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
public class Aereolínea implements Serializable {

    private String nombreAereopuerto, nombreAereolinea;

    public Aereolínea(String nombreAereopuerto, String nombreAereolinea) {
        this.nombreAereopuerto = nombreAereopuerto;
        this.nombreAereolinea = nombreAereolinea;
    }

    public String getNombreAereopuerto() {
        return nombreAereopuerto;
    }

    public String getNombreAereolinea() {
        return nombreAereolinea;
    }

}
