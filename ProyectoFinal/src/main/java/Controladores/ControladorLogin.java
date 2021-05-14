package Controladores;

import Programa.Principal;
import Usuarios.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alexs
 */
public class ControladorLogin {

    private Principal prin;

    public ControladorLogin(Principal prin) {
        this.prin = prin;
    }

    public void verificarIngreso(JTextField usuario, JTextField contraseña, String ubicación) {

        if (verificarCampos(usuario, contraseña)) {
            verificarUbicación(usuario, contraseña, ubicación);
        }

    }

    private boolean verificarCampos(JTextField usuario, JTextField contraseña) {
        if (usuario.getText().length() == 0 || contraseña.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Usted no ha ingresado ningun dato en algún campo");
            return false;
        } else {
            return true;
        }
    }

    private void verificarUbicación(JTextField usuario, JTextField contraseña, String ubicación) {
        try {
            if (ubicación.equalsIgnoreCase("Usuarios")) {
                verificarDatos(usuario, contraseña, prin.getLecturaPasajeros().leerArchivos());
            } else {
                verificarDatos(usuario, contraseña, prin.getLecturaPersonal().leerArchivos());
            }
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
    }

    private void verificarDatos(JTextField usuario, JTextField contraseña, ArrayList arreglo) {
        boolean encontrado = false;
        for (int i = 0; i < arreglo.size(); i++) {
            if (usuario.getText().equals(((Usuario) arreglo.get(i)).getNombre()) && contraseña.getText().equals(((Usuario) arreglo.get(i)).getContraseña())) {
                acceso((Usuario) arreglo.get(i));
                encontrado = true;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            usuario.setText("");
            contraseña.setText("");
        }
    }

    private void acceso(Usuario user) {
        prin.concederAcceso(user);
    }
    /*
    Pasajero
    Administrador
    Gerente
    OperadorVuelo
     */

}
