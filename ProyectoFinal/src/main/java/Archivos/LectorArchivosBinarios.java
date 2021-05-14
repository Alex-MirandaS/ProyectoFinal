/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author richard
 */
public class LectorArchivosBinarios<T> {

    private File archivo;
    private String ubicación;

    public LectorArchivosBinarios(String ubicación) {
        this.ubicación = ubicación;
    }

    public ArrayList<T> leerArchivos() throws FileNotFoundException, IOException, ClassNotFoundException {
        ArrayList<T> objetos = new ArrayList<>();
        archivo = new File("\\Users\\Alexs\\Desktop\\ProyectoFinal.todo\\ProyectoFinal\\ArchivosPrueba\\" + ubicación);
        String[] archivos = archivo.list();
        ObjectInputStream lector;
        //System.out.println("Archivos:"+archivos.length);
        for (int i = 0; i < archivos.length; i++) {
            String archivo1 = archivos[i];
            lector = new ObjectInputStream(new FileInputStream(archivo + "/" + archivo1));
            T v = (T) lector.readObject();
            objetos.add(v);
            lector.close();
        }
        return objetos;
    }
}
