/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Archivos.LectorArchivosBinarios;
import Objetos.Avión;
import Objetos.Pasaporte;
import Objetos.Vuelo;
import Usuarios.OperadorVuelo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
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
                    cambiarLugarPasajeros(vuelo.getPasaportesVuelo(), vuelo.getNombreAereopuertoDestino());
                    vuelo = null;
                }
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "ESTE VUELO YA NO EXISTE");
        }
    }
    
    public void cancelarVuelo(Vuelo vuelo) {
        vuelo = null;
    }
    
    public void posponerVuelo(Vuelo vuelo, LocalDate nuevaFecha) throws IOException, FileNotFoundException, ClassNotFoundException {
        if (vuelo != null) {
            
            if (nuevaFecha.compareTo(vuelo.getFechaSalida()) < 0) {
                JOptionPane.showMessageDialog(null, "LA FECHA ES INCORRECTA, YA QUE NO SE PUEDE PONER UNA FECHA ANTES");
            } else {
                vuelo.setFechaSalida(nuevaFecha);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "ESTE VUELO YA FUE EFECTUADO");
        }
    }
    
    private void cambiarLugarPasajeros(ArrayList<Pasaporte> pasaportes, String país) {
        for (int i = 0; i < pasaportes.size(); i++) {
            pasaportes.get(i).setPaisActual(país);
        }
        
    }
    
}
