/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] datos = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete"};
        File f=new File("prueba.txt");
        Scanner s,sl;
        FileWriter fichero = null;
        Writer fichero1=null;
        String linea;
        int contador=0;
        
        /*
        Leer un fichero de caracteres  a traves de una expresión regular:
        \\s*,\\s* El texto está separado por comas, y puede tener varios espacios entre el texto
        */
        
        try
        {
            s=new Scanner(f);
            while(s.hasNextLine())
            {
                linea=s.nextLine();
                sl=new Scanner(linea);
                sl.useDelimiter("\\s*,\\s*");
                System.out.println(sl.next()+ " "+sl.next()+" "+sl.next());
                
            }
            s.close();
            
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        /*
        Escribir datos en el fichero sin codificación
        */
        try
        {
            fichero = new FileWriter("fichero_escritura.txt");
            while (contador<=datos.length-1)
            {
                fichero.write(datos[contador]+ "\n");
                contador++;
            }
            fichero.close();
            
            
        } catch (Exception ex)
        {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
        
        /*
        FORMA 2 DE ESCRITURA. Con el fichero codificado en UTF-8
        */
        contador=0;  
        try
        {
            fichero1 =new BufferedWriter(new OutputStreamWriter(new FileOutputStream("fichero_escritura1.txt"), "UTF-8"));
            while (contador<=datos.length-1)
            {
                try
                {
                fichero1.write(datos[contador]+ "\n");
                } catch (IOException ex)
                {
                    System.out.println("Mensaje excepcion escritura: " + ex.getMessage());
                }
                contador++;
            }
            
            
            
        } catch (UnsupportedEncodingException | FileNotFoundException ex2)
        {
            System.out.println("Mensaje error 2: " + ex2.getMessage());
        } finally
        { 
            try
            {
                fichero1.close();
            }catch (IOException ex3)
            {
                System.out.println("Mensaje error cierre fichero: " + ex3.getMessage());
            }
        }
    }
    
}
