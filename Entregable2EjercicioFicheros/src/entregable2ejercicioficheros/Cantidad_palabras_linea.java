/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregable2ejercicioficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Cantidad_palabras_linea {

    protected int num_palabras;
    protected int num_linea;

    Cantidad_palabras_linea() {
    }

    Cantidad_palabras_linea(int num_p, int num_l) {
        this.num_palabras = num_p;
        this.num_linea = num_l;
    }

    public int get_num_palabras() {
        return this.num_palabras;
    }

    public int get_num_linea() {
        return this.num_linea;
    }

    public void set_num_palabras(int n_palabras) {
        this.num_palabras = n_palabras;
    }

    public void set_num_linea(int n_linea) {
        this.num_linea = n_linea;
    }

    // 2. Realizar una función que me devuelva la cantidad de palabras por línea que existen en un
    // fichero de texto. ( Se debe decir que tipo de estructura de datos se debe utilizar)
    
    // La estructura que sigue el ejercicio es:
    // - Cada vez que termino de leer una línea la instancio en una clase.
    // - Ese objeto lo añado a una posición del ArrayList y así consigo una lista con las líneas y su número de palabras. 
    public ArrayList<Cantidad_palabras_linea> nombre_posiciones(File fichero) {

        ArrayList<Cantidad_palabras_linea> lista_cant_palabras = new ArrayList<Cantidad_palabras_linea>();
        Scanner s, sl;
        String linea, token;
        int contador_lineas = 0, contador_palabras;
        boolean seguir;
        Cantidad_palabras_linea cp;

        try {

            s = new Scanner(fichero);

            while (s.hasNextLine()) {//Empieza a leer las lineas
                contador_lineas++; //Cuenta el numero de lineas
                linea = s.nextLine();
                sl = new Scanner(linea);
                sl.useDelimiter("\\s*,\\s*");
                seguir = sl.hasNext();
                contador_palabras = 0;//reinicia el numero de palabras por linea
                
                while (seguir) {//Mientras sea true que siga leyendo la siguiente palabra
                    token = sl.next();//recoge la palabra
                    contador_palabras++; //Aumenta en 1 el contador de palabras
                    seguir = sl.hasNext();//Comprueba si hay otra palabra
                }
                
                cp = new Cantidad_palabras_linea(contador_palabras, contador_lineas);
                //Añade el elemento al ArrayList
                lista_cant_palabras.add(cp);
                
               // System.out.println(contador_lineas + " " + contador_palabras);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return lista_cant_palabras;
    }

    @Override
    public String toString() {
        return "En la linea " + this.num_linea + " hay " + this.num_palabras + ".";
    }
}
