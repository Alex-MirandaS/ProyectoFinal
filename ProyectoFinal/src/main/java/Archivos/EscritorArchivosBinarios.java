/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author richard
 */
public class EscritorArchivosBinarios<T> {

    //donde se guardn los archivos binarios
    private File archivo;
    private String ubicación;

    public EscritorArchivosBinarios(String ubicación) {
        this.ubicación = ubicación;
    }

    public void guardarObjeto(T objeto, String nombre) throws IOException, FileNotFoundException {
        FileOutputStream fileOutput;
        ObjectOutputStream salida;
        archivo = new File("\\Users\\Alexs\\Desktop\\ProyectoFinal.todo\\ProyectoFinal\\ArchivosPrueba\\" + ubicación);
        fileOutput = new FileOutputStream(archivo + "/" + nombre);
        salida = new ObjectOutputStream(fileOutput);
        salida.writeObject(objeto);
        salida.close();
    }

}
