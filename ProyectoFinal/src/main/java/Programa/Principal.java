/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import Controladores.ControladorCompraBoletos;
import GUI.CompraBoletosGUI;
import GUI.PrincipalGUI;

/**
 *
 * @author Alexs
 */
public class Principal {

    //Objetos
    private ControladorCompraBoletos controlCBoletos;
    //GUI
    private PrincipalGUI ventanaPrincipal;
    private CompraBoletosGUI ventanaCompraBoletos;

    public void iniciar() {
        ventanaPrincipal = new PrincipalGUI(this);
        ventanaPrincipal.setVisible(true);
    }

    public void comprarBoletos() {
        ventanaCompraBoletos = new CompraBoletosGUI(this);
        controlCBoletos = new ControladorCompraBoletos();
        ventanaPrincipal.setEnabled(false);
        ventanaCompraBoletos.setVisible(true);
        //desbloquearPantallaPrincipal
    }

    public ControladorCompraBoletos getControlCBoletos() {
        return controlCBoletos;
    }

}
