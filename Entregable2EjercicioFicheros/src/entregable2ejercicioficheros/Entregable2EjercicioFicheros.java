/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregable2ejercicioficheros;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alex
 */
public class Entregable2EjercicioFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Realizar una función que me devuelva los nombres que hay en un fichero de texto y me diga
        // en que líneas aparecen. (La estructura de datos es la dada en clase)
        
        // 2. Realizar una función que me devuelva la cantidad de palabras por línea que existen en un
        // fichero de texto. ( Se debe decir que tipo de estructura de datos se debe utilizar)
        
        // 3. Dado un fichero de texto. Realizar una función que devuelva, la media de palabras que
        // existen en el fichero.
        
        // Ejercicio extra. Dado un fichero de texto, compuesto por palabras, realizar una funcion 
        // que me devuelva aquellas palabras que tienen la misma longitud,
        // asi como las veces que se repite esa misma palabra.
        
        File f=new File("fichero_palabras.txt");
        
        TratamientoFichero ejercicioFichero = new TratamientoFichero();        
        ArrayList<TratamientoFichero>  t_f = new ArrayList<TratamientoFichero>();
        
        t_f = ejercicioFichero.nombre_posiciones(f);        
        
        //Iterar ArrayList 
        System.out.println("------PALABRAS Y REPETICIONES------\n");
        Iterator<TratamientoFichero> nombreIterator = t_f.iterator();
        while(nombreIterator.hasNext()){
            TratamientoFichero elemento = nombreIterator.next();
            
            System.out.print(elemento);
            System.out.println("");
        } 
        
        System.out.println(ejercicioFichero.media_palabras_fichero(f));
        
        Cantidad_palabras_linea c_p = new Cantidad_palabras_linea();
        
        ArrayList<Cantidad_palabras_linea> lista_cantidad_palabras = new ArrayList<Cantidad_palabras_linea>();
        
        //System.out.println(c_p.nombre_posiciones(f));
        lista_cantidad_palabras = c_p.nombre_posiciones(f);
        
        //Iterar ArrayList 
        System.out.println("------ Cantidad de palabras por linea ------\n");
        Iterator<Cantidad_palabras_linea> nombreIterator_cant = lista_cantidad_palabras.iterator();
        while(nombreIterator_cant.hasNext()){
            Cantidad_palabras_linea elemento = nombreIterator_cant.next();
            System.out.print(elemento);
            System.out.println("");
        } 
        
    }
    
}
