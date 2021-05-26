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
public class TratamientoFichero {
    String nombre;
    String lineas;
    
    public TratamientoFichero(){}
    
    public TratamientoFichero(String nombre, String lineas){
        this.nombre = nombre;
        this.lineas = lineas;
    }
    
    //setters and getters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setLineas(String lineas){
        this.lineas = lineas;
    }
    public String getNombre(){
       return this.nombre; 
    }
    public String getLineas(){
       return this.lineas;
    }
    //Metodos
    public void add_linea(String linea){
        this.lineas += ", " + linea;
    }
    
    // 1. Realizar una función que me devuelva los nombres que hay en un fichero de texto y me diga
    // en que líneas aparecen. (La estructura de datos es la dada en clase)
    public ArrayList<TratamientoFichero> nombre_posiciones(File fichero){
            
        Scanner s, sl;
        String linea, token, convertir_entero;
        int posicion = 0, contador_lineas = 0;
        boolean seguir, existe = false;
        
        ArrayList<TratamientoFichero>  t_f = new ArrayList<TratamientoFichero>();
        TratamientoFichero palabras;
               
        try{
            
            s = new Scanner(fichero);
       
            while(s.hasNextLine()){//Empieza a leer las lineas
                contador_lineas++; //Cuenta la linea que en la que estamos
                linea = s.nextLine();
                sl = new Scanner(linea);
                sl.useDelimiter("\\s*,\\s*");
                seguir = sl.hasNext();
                
                while(seguir){//Mientras sea true que siga leyendo la siguiente palabra
                    token = sl.next();//recoge la palabra
                    
                    if(t_f.isEmpty()){//Si esta vacio el ArrayList
                        
                        convertir_entero = String.valueOf(contador_lineas);//Convierte int a entero para añadirlo en el metodo
                        palabras = new TratamientoFichero(token, convertir_entero);
                        t_f.add(palabras);
                        
                    }else{//Sino esta vacio el arrayList
                        
                        for(int i=0; i < t_f.size(); i++){
                            if(t_f.get(i).getNombre().compareTo(token) == 0){ //Comprobar si la palabra existe ya en el ArrayList
                                existe = true;
                                posicion = i;
                            }
                        }
                        
                        if(existe){//Si existe la palabra se añado la linea
                            
                            convertir_entero = String.valueOf(contador_lineas);
                            t_f.get(posicion).add_linea(convertir_entero);
                            
                        }else{//Sino existe la palabra se agrega al ArrayList
                            
                            convertir_entero = String.valueOf(contador_lineas);
                            palabras = new TratamientoFichero(token, convertir_entero);
                            t_f.add(palabras);
                            
                        }
                        existe = false;
                    }
                    seguir = sl.hasNext();
                }
            
            }
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
        return t_f;
    }
    
    // 3. Dado un fichero de texto. Realizar una función que devuelva, la media de palabras que
    // existen en el fichero.
    public double media_palabras_fichero(File fichero){
        
        //Variables utilizadas
        Scanner s, sl;
        String linea, token;
        int contador_palabras = 0, contador_lineas = 0;
        boolean seguir;
        double media = 0;
               
        try{
            
            s = new Scanner(fichero);
       
            while(s.hasNextLine()){//Empezia a leer las lineas
                contador_lineas++; //Cuenta la linea que en la que estamos
                linea = s.nextLine();
                sl = new Scanner(linea);
                sl.useDelimiter("\\s*,\\s*");
                seguir = sl.hasNext();
                
                while(seguir){//Mientras sea true que siga leyendo la siguiente palabra
                    token = sl.next();//recoge la palabra     
                    contador_palabras++;
                    seguir = sl.hasNext();//Comprueba si hay otra palabra
                }           
            }
       
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
        media = (double) contador_palabras / contador_lineas;
        return media;
    }
    
    @Override
    public String toString(){
        return this.nombre + " " + this.lineas;
    }
    
}
