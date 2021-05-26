/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg4.repetirciudades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Personas {
     int dni;
    String nombre;
    String apellido;
    String ciudad;
    public Personas(){

    }
    public Personas(int d,String m,String a, String c){
        this.dni=d;
        this.nombre=m;
        this.apellido=a;
        this.ciudad=c;
    }
    public int getdni(){
        return dni;
    }
    public String getnombre(){
        return nombre;
    }
    public String getapelido(){
        return apellido;
    }
    public String getciudad(){
        return ciudad;
    }
    public void setdni(int d){
        this.dni=d;
    }
    public void setnombre(String m){
        this.nombre=m;

    }
    public void setapellido(String a){
        this.apellido=a;
    }
    public void setciudad(String c){
        this.ciudad=c;
    }
    public ArrayList<Personas> persona(){
        ArrayList<Personas> per =new ArrayList<Personas>();
        Personas p;
        String nombre;
        String apellido;
        String ciudad;
        int dni;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Dame el dni de la persona y para termina cero");
        dni=entrada.nextInt();
        while(dni!=0){
            System.out.println("Dame el nombre");
            nombre=entrada.next();
            System.out.println("Dame el apellido");
            apellido=entrada.next();
            System.out.println("Dame la ciudad");
            ciudad=entrada.next();
            p=new Personas(dni,nombre,apellido,ciudad);
            per.add(p);
            System.out.println("Dame otro dni sino cero para terminar");
            dni=entrada.nextInt();


            
        }
        return per;
        
    }
}
