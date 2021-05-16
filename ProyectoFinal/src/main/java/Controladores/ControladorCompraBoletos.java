/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import GUI.PedirPasaporte;
import Objetos.Pasaporte;
import Objetos.Vuelo;
import Programa.Principal;
import java.awt.Component;
import java.awt.GridLayout;
import java.io.IOException;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alexs
 */
public class ControladorCompraBoletos {

    private Principal principal;
    private int cPasajeros;
    private Vuelo vuelotemp;
    private Pasaporte[] pasaportesTemp;

    public ControladorCompraBoletos(Principal principal) {
        this.principal = principal;
    }

    public void verificarDatos(JComboBox partida, JComboBox destino, JTextField fecha, JTextField cantidad) {
        if (verificarLugares(partida, destino) && verificarCBoletos(cantidad) && verificarFecha(fecha)) {
            JOptionPane.showMessageDialog(null, "OPERACIÒN EXITOSA");
            cPasajeros = Integer.parseInt(cantidad.getText());
            verificarVuelo(partida, destino, fecha, cantidad);
        }
    }

    public void llenarLugares(JComboBox listado) {
        try {
            for (int i = 0; i < principal.getLecturaAereopuertos().leerArchivos().size(); i++) {
                listado.addItem(principal.getLecturaAereopuertos().leerArchivos().get(i).getCiudad()
                        + ", "
                        + principal.getLecturaAereopuertos().leerArchivos().get(i).getPais());
            }
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
    }

    private boolean verificarLugares(JComboBox partida, JComboBox destino) {
        if (partida.getSelectedIndex() == destino.getSelectedIndex()) {
            JOptionPane.showMessageDialog(null, "NO PUEDES VIAJAR AL MISMO DESTINO DE DONDE TE ENCUENTRAS");
            return false;
        } else {
            return true;
        }
    }

    private boolean verificarCBoletos(JTextField text) {
        try {
            if (Integer.parseInt(text.getText()) < 1) {
                JOptionPane.showMessageDialog(null, "CANTIDAD INVALIDA, VUELVA A INTENTAR");
                text.setText("");
                return false;
            } else if (text.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "NO HAY NINGUN VALOR EN EL CAMPO");
                text.setText("");
            } else {
                return true;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "CARACTER INVALIDO, SOLO SE ACEPTAN NUMERO, VUELVA A INTENTARLO");
            text.setText("");
        }
        return false;
    }

    private boolean verificarFecha(JTextField text) {
        try {
            String[] horaDividida = text.getText().split("/");
            int mes = Integer.valueOf(horaDividida[0]);
            int hora = Integer.valueOf(horaDividida[1]);

            if (text.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "NO HAY NINGUN VALOR EN EL CAMPO");
                return false;
            } else if (hora < 1 || mes < 1 || hora > 24 || mes > 12) {
                JOptionPane.showMessageDialog(null, "CANTIDAD INVALIDA, VUELVA A INTENTAR");
                text.setText("");
                return false;
            } else {
                return true;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "CARACTER INVALIDO, SOLO SE ACEPTAN NUMERO, VUELVA A INTENTARLO");
            text.setText("");
        }
        return false;
    }

    private void verificarVuelo(JComboBox partida, JComboBox destino, JTextField fecha, JTextField cantidad) {
        llenarTabla(principal.getTablaVuelos().getTabla(), Integer.parseInt(cantidad.getText()));
        principal.getTablaVuelos().setVisible(true);
    }

    private void llenarTabla(JTable table, int c) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            Vuelo temp;
            table.setModel(modelo);
            modelo.addColumn("No.");
            modelo.addColumn("Origen");
            modelo.addColumn("Destino");
            modelo.addColumn("Fecha");
            modelo.addColumn("Precio");
            modelo.addColumn("Precio Acumulado");

            for (int i = 0; i < principal.getLecturaVuelos().leerArchivos().size(); i++) {
                temp = principal.getLecturaVuelos().leerArchivos().get(i);
                modelo.addRow(new Object[]{i + 1, principal.getBuscarDatos().buscarCiudades(temp.getNombreAereopuertoOrigen()),
                    principal.getBuscarDatos().buscarCiudades(temp.getNombreAereopuertoDestino()),
                    temp.getFechaSalida(), temp.getPrecioBoleto(), temp.getPrecioBoleto() * c});
                principal.getTablaVuelos().getListaElección().addItem("" + (i + 1));
            }
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
    }

    public void inicioPasaportes(int i) {
        try {
            vuelotemp = principal.getLecturaVuelos().leerArchivos().get(i);
            principal.getLlenado().setVisible(true);
            principal.getControlCBoletos().llenarPasaportes(principal.getLlenado().getPasaportes());
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }

    }

    public void verificarPasaportes() {

        Component[] components = ((JComponent) (principal.getLlenado().getPasaportes())).getComponents();
        pasaportesTemp = new Pasaporte[cPasajeros];
        Pasaporte temp;
        int contador = 0;
        for (int i = 0; i < components.length; i++) {
            temp = principal.getBuscarDatos().buscarPasaporte(((PedirPasaporte) components[i]).getCodPasaporte());
            if (temp != null && verificarVuelo(temp, vuelotemp) == true && verificarFecha(temp.getFechaEmisión())) {
                pasaportesTemp[contador] = temp;
                contador++;
            }
        }
        if (pasaportesTemp[pasaportesTemp.length - 1] != null) {
            inicioTarjeta();
        }
    }

    public void llenarPasaportes(JPanel panel) {
        panel.setLayout(new GridLayout(cPasajeros, 1));
        for (int i = 0; i < cPasajeros; i++) {
            panel.add(new PedirPasaporte());
        }
    }

    public boolean verificarVuelo(Pasaporte pas, Vuelo vuel) {

        for (int i = 0; i < vuel.getPasaportesVuelo().size(); i++) {
            if (vuel.getPasaportesVuelo().get(i) == pas) {
                JOptionPane.showMessageDialog(null, "El Pasaporte ya esta registrado dentro del vuelo");
                return false;
            }
        }
        return true;
    }

    private boolean verificarFecha(LocalDate fecha) {
        if (fecha.compareTo(vuelotemp.getFechaSalida()) < 0) {
            JOptionPane.showMessageDialog(null, "PARA ESTA FECHA, SU PASAPORTE YA HA VENCIDO");
            return false;
        } else {
            return true;
        }
    }

    public void inicioTarjeta() {
        principal.getPedirTarjeta().setVisible(true);
        principal.getLlenado().setEnabled(false);
    }

    public void verificarTarjeta(JTextField codTarjeta, JTextField cvc) {

        if (principal.getBuscarDatos().buscarTarjeta(codTarjeta, cvc) != null) {
            guardarDatos();
        }
    }

    private void guardarDatos() {

    }
}
