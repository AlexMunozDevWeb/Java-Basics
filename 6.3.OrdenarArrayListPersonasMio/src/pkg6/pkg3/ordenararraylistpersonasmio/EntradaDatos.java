/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg3.ordenararraylistpersonasmio;

import java.util.Scanner;

/**
 *
 * @author alex
 */
public class EntradaDatos {
    public int entrada(Persona[] p){

        Persona per;
        String nombre;
        String apellidos;
        int edad;
        String dni;
        String direccion;
        int indice = 0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe la edad de la persona: ");
        
        edad = entrada.nextInt();
        
        while(edad > 0){
            
            System.out.println("Escribe el nombre del alumno: ");
            nombre = entrada.next();
            
            System.out.println("Escribe los apellidos: ");
            apellidos = entrada.next();
            
            System.out.println("Escribe el DNI: ");
            dni = entrada.next();
            
            System.out.println("Escribe la direccion: ");
            direccion = entrada.next();
            
            per = new Persona(nombre, apellidos, edad, dni, direccion);
            
            p[indice] = per;
            indice++;
            
            System.out.println("Escribe la siguiente edad: ");
            edad = entrada.nextInt();
            
        }
        entrada.close();
        
        return indice;
    }
}
