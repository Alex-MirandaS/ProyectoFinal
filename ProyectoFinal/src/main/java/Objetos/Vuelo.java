/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Alexs
 */
public class Vuelo implements Serializable {

    private String codigoVuelo, codigoAvión, nombreAereopuertoOrigen, nombreAereopuertoDestino;
    private ArrayList<Pasaporte> pasaportesVuelo;
    private double precioBoleto;
    private LocalDate fechaSalida;

    public Vuelo(String codigoVuelo, String codigoAvión, String nombreAereopuertoOrigen, String nombreAereopuertoDestino, double precioBoleto, LocalDate fechaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.codigoAvión = codigoAvión;
        this.nombreAereopuertoOrigen = nombreAereopuertoOrigen;
        this.nombreAereopuertoDestino = nombreAereopuertoDestino;
        this.precioBoleto = precioBoleto;
        this.fechaSalida = fechaSalida;
        pasaportesVuelo = new ArrayList<>();
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public String getCodigoAvión() {
        return codigoAvión;
    }

    public String getNombreAereopuertoOrigen() {
        return nombreAereopuertoOrigen;
    }

    public String getNombreAereopuertoDestino() {
        return nombreAereopuertoDestino;
    }

    public double getPrecioBoleto() {
        return precioBoleto;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public ArrayList<Pasaporte> getPasaportesVuelo() {
        return pasaportesVuelo;
    }

}
