/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.arraylisttema;

/**
 *
 * @author alex
 */
public class Alumno {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String dni;
    protected String direccion;
    
    public Alumno(){}
    
    public Alumno(String name, String surname, int age, String dni, String address){
        this.nombre = name;
        this.apellido = surname;
        this.edad = age;
        this.dni = dni;
        this.direccion = address;
    }
    
    //Setters
    public void setNombre(String name){
        this.nombre = name;
    }
    public void setApellido(String surname){
        this.apellido = surname;
    }
    public void setEdad(int age){
        this.edad = age;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    public void setDireccion(String address){
        this.direccion = address;
    }
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getDNI(){
        return this.dni;
    }
    public String getDireccion(){
        return this.direccion;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre +".\nApellido: " + apellido + ".\nEdad: " + edad + ".\nDNI: " + dni + ".\nDireccion: " + direccion;
    }
}
