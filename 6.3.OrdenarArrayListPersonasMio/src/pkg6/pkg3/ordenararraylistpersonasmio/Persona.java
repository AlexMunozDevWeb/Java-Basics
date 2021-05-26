/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg3.ordenararraylistpersonasmio;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String dni;
    protected String ciudad;
    
    public Persona(){}
    
    public Persona(String name, String surname, int age, String dni, String city){
        this.nombre = name;
        this.apellido = surname;
        this.edad = age;
        this.dni = dni;
        this.ciudad = city;
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
    public void setCiudad(String city){
        this.ciudad = city;
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
    public String getCiudad(){
        return this.ciudad;
    }
    
    //Dado un array de personas, con las características de :
    //nombre,apellidos,edad,dni.
    //Realizar una función que me inserte las personas ordenadas en un Arraylist por DNI.
    
    
    public void ordenar_personas_arraylist(ArrayList<Persona> list_personas, Persona[] array_personas){
        Persona auxPersona;
        Persona personaMayor = array_personas[0];
        boolean existeMayor = false;
        
        for(int i=0; i < array_personas.length; i++){
            
            for(int j=i+1; j < array_personas.length; j++){
                
                //DNI persona en la posicion de i mayor a la persona en la posicion j, en el else entra cuando es al reves
                if(array_personas[i].getDNI().compareTo(array_personas[j].getDNI()) > 0){
                    //guardo el mayor para insertar en ArrayList
                    personaMayor = array_personas[j];
                    existeMayor = true;
                    
                    //Intercambio valores
                    auxPersona = array_personas[i];
                    array_personas[i] = array_personas[j];
                    array_personas[j] = auxPersona;
                    
                }
                
            }
            
            if(!existeMayor){
                list_personas.add(array_personas[i]);
            }else{
                list_personas.add(personaMayor);
                existeMayor = false;
            }
            
        }
        
    }
    
    public ArrayList<Persona> ordenar_dni_arrayList(Persona[] p, int lon){
        ArrayList<Persona> ordenar = new ArrayList<Persona>();
        String dni;
        int contador, indice;
        contador = 0;
        indice = 0;
        
        while(indice < lon){
            
            dni = p[indice].getDNI();
            
            if(ordenar.isEmpty()){//Verifica arrayLista vacia
                ordenar.add(contador, p[indice]);
            }else{
                contador = 0;
                while(contador < ordenar.size() && ordenar.get(contador).getDNI().compareTo(dni) >= 0){
                    contador++;
                }
                if(contador >= ordenar.size()){
                    ordenar.add(contador, p[indice]);
                }else{
                    ordenar.add(contador, p[indice]);
                }
            }
            indice++;
        }
        
        return ordenar;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre +".\nApellido: " + apellido + ".\nEdad: " + edad + ".\nDNI: " + dni;
    }
}
