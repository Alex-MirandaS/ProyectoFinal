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
public class Avión implements Serializable {

    private String nombreAereolínea, nombreAereopuertoActual, codigoAvión;
    private int capacidadPasajeros, capacidadGasolina, consumoMilla;

    public Avión(String nombreAereolínea, String nombreAereopuertoActual, String codigoAvión, int capacidadPasajeros, int capacidadGasolina, int consumoMilla) {
        this.nombreAereolínea = nombreAereolínea;
        this.nombreAereopuertoActual = nombreAereopuertoActual;
        this.codigoAvión = codigoAvión;
        this.capacidadPasajeros = capacidadPasajeros;
        this.capacidadGasolina = capacidadGasolina;
        this.consumoMilla = consumoMilla;
    }

    public String getNombreAereolínea() {
        return nombreAereolínea;
    }

    public String getNombreAereopuertoActual() {
        return nombreAereopuertoActual;
    }

    public String getCodigoAvión() {
        return codigoAvión;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public int getCapacidadGasolina() {
        return capacidadGasolina;
    }

    public int getConsumoMilla() {
        return consumoMilla;
    }

    public void setNombreAereopuertoActual(String nombreAereopuertoActual) {
        this.nombreAereopuertoActual = nombreAereopuertoActual;
    }
    
    

}
