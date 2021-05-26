/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.objetosyclases;

/**
 *
 * @author alex
 */
public class Coche {
    
    // Private -> acceso desde la misma clase.
    private int puertas; 
    
    // Protected -> acceso desde la misma clase y subclases.
    protected int ruedas; 
    
    // Public -> Acceso desde la misma clase, subclase, paquete y subclases de distinto paquete.
    public String motor; 
    
    // No especifica -> Acceso desde las clases mismo paquete, subclase mismo paquete, misma clase.
    String cilindrada;  
    
    public Coche(){}
    
    public Coche(int puertas, int ruedas, String motor, String cilindrada){
        this.puertas = puertas;
        this.ruedas = ruedas;
        this.motor = motor;
        this.cilindrada = cilindrada;
    }
    
    //setters
    public void set_puertas(int puertas){
        this.puertas = puertas;
    }
    public void set_ruedas(int ruedas){
        this.ruedas = ruedas;
    }
    
    //getters
    public int get_puertas(){
        return this.puertas;
    }
    public int get_ruedas(){
        return this.ruedas;
    }
    
}
