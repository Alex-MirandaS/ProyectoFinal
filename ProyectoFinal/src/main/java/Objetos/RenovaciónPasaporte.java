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
public class RenovaciónPasaporte implements Serializable {

    private int numPasaporte;
    private LocalDate fechaNuevoVencimiento;

    public RenovaciónPasaporte(int numPasaporte, LocalDate fechaNuevoVencimiento) {
        this.numPasaporte = numPasaporte;
        this.fechaNuevoVencimiento = fechaNuevoVencimiento;
    }

    public int getNumPasaporte() {
        return numPasaporte;
    }

    public LocalDate getFechaNuevoVencimiento() {
        return fechaNuevoVencimiento;
    }

}
