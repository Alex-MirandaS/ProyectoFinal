/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Archivos.LectorArchivosBinarios;
import Objetos.Avión;
import Objetos.Vuelo;
import Usuarios.OperadorVuelo;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexs
 */
public class ControladorOperadorVuelo {

    private OperadorVuelo operador;

    public ControladorOperadorVuelo(OperadorVuelo operador) {
        this.operador = operador;
    }

    public void iniciarVuelo(Vuelo vuelo, LectorArchivosBinarios<Avión> aviones) throws IOException, FileNotFoundException, ClassNotFoundException {
        if (vuelo != null) {

            //aplicar hilo
            for (int i = 0; i < aviones.leerArchivos().size(); i++) {
                if (vuelo.getCodigoAvión().equalsIgnoreCase(aviones.leerArchivos().get(i).getCodigoAvión())) {
                    aviones.leerArchivos().get(i).setNombreAereopuertoActual(vuelo.getNombreAereopuertoDestino());
                    vuelo = null;
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "ESTE VUELO YA NO EXISTE");
        }
    }

    public void cancelarVuelo(Vuelo vuelo) {
        for (int i = 0; i < vuelo.getPasaportesVuelo().size(); i++) {

        }
        vuelo = null;

    }

}
