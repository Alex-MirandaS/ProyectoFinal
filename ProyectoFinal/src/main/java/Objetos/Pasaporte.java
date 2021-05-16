/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Alexs
 */
public class Pasaporte implements Serializable {

    private String contraseña, nacionalidad, estadoCivil, nombres, apellidos, sexo, paisActual;
    private int numPasaporte, millasRecorridas;
    private LocalDate fechaNacimiento, fechaEmisión, fechaVencimiento;

    public Pasaporte(int numPasaporte, String contraseña, LocalDate fechaNacimiento, String nacionalidad, String estadoCivil, String nombres, String apellidos, String sexo, LocalDate fechaEmisión, LocalDate fechaVencimiento, String paisActual, int millasRecorridas) {
        this.contraseña = contraseña;
        this.nacionalidad = nacionalidad;
        this.estadoCivil = estadoCivil;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.paisActual = paisActual;
        this.numPasaporte = numPasaporte;
        this.millasRecorridas = millasRecorridas;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaEmisión = fechaEmisión;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public String getPaisActual() {
        return paisActual;
    }

    public int getNumPasaporte() {
        return numPasaporte;
    }

    public int getMillasRecorridas() {
        return millasRecorridas;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDate getFechaEmisión() {
        return fechaEmisión;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setPaisActual(String paisActual) {
        this.paisActual = paisActual;
    }

}
