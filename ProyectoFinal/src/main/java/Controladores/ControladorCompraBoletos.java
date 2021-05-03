/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alexs
 */
public class ControladorCompraBoletos {

    public void verificarCBoletos(JTextField text) {
        try {
            if (Integer.parseInt(text.getText()) < 1) {
                JOptionPane.showMessageDialog(null, "CANTIDAD INVALIDA, VUELVA A INTENTAR");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "CARACTER INVALIDO, SOLO SE ACEPTAN NUMERO, VUELVA A INTENTARLO");
        } finally {
            text.setText("");
        }
    }

}
