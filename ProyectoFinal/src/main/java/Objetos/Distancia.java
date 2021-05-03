/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.io.Serializable;

/**
 *
 * @author Alexs
 */
public class Distancia implements Serializable {

    private String nombreAereopuertoOrigen, nombreAereopuertoDestino;
    private int cantidadMillas;

    public Distancia(String nombreAereopuertoOrigen, String nombreAereopuertoDestino, int cantidadMillas) {
        this.nombreAereopuertoOrigen = nombreAereopuertoOrigen;
        this.nombreAereopuertoDestino = nombreAereopuertoDestino;
        this.cantidadMillas = cantidadMillas;
    }

    public String getNombreAereopuertoOrigen() {
        return nombreAereopuertoOrigen;
    }

    public String getNombreAereopuertoDestino() {
        return nombreAereopuertoDestino;
    }

    public int getCantidadMillas() {
        return cantidadMillas;
    }

}
