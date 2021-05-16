package Controladores;

import Objetos.Aereopuerto;
import Objetos.Vuelo;
import Programa.Principal;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alexs
 */
public class ControladorVentanaPersonal {

    private Principal principal;

    public ControladorVentanaPersonal(Principal principal) {
        this.principal = principal;
    }

    public void llenarTablaVuelos(JTable table, JComboBox lista) {
        try {

            DefaultTableModel modelo = new DefaultTableModel();
            Vuelo temp;
            table.setModel(modelo);
            modelo.addColumn("No.");
            modelo.addColumn("Estado");
            modelo.addColumn("Cod. Vuelo");
            modelo.addColumn("Cod. Avión");
            modelo.addColumn("Origen");
            modelo.addColumn("Destino");
            modelo.addColumn("Fecha");
            modelo.addColumn("Cantidad Pasajeros");

            for (int i = 0; i < principal.getLecturaVuelos().leerArchivos().size(); i++) {
                temp = principal.getLecturaVuelos().leerArchivos().get(i);
                modelo.addRow(new Object[]{i + 1, temp.getCodigoVuelo(), temp.getCodigoAvión(),
                    principal.getBuscarDatos().buscarCiudades(temp.getNombreAereopuertoOrigen()),
                    principal.getBuscarDatos().buscarCiudades(temp.getNombreAereopuertoDestino()),
                    temp.getFechaSalida(), temp.getPasaportesVuelo().size()});
                lista.addItem("" + (i + 1));
            }
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
    }

    public void cambiarDatos(JComboBox lista, JLabel codigoAvión1, JLabel estado1, JLabel aereopuertoActual1, JLabel aereoDestino1, JLabel cPasajeros1) {
        try {
            Vuelo temp = principal.getLecturaVuelos().leerArchivos().get(lista.getSelectedIndex());
            codigoAvión1.setText(temp.getCodigoAvión());
            estado1.setText(temp.getEstado());
            aereopuertoActual1.setText(principal.getBuscarDatos().buscarCiudades(temp.getNombreAereopuertoOrigen()));
            aereoDestino1.setText(principal.getBuscarDatos().buscarCiudades(temp.getNombreAereopuertoDestino()));
            cPasajeros1.setText("" + temp.getPasaportesVuelo().size());
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
    }

}
