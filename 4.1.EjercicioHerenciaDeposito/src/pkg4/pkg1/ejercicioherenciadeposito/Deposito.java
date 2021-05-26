/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg1.ejercicioherenciadeposito;

/**
 *
 * @author alex
 */
public class Deposito {
    protected String titular;
    protected double capital;
    protected int dias_plazo;
    protected double tipo_interes;
    
    public Deposito(){
        
    }
    public Deposito(String titular, double capital, int dias, double tipo){
        this.titular = titular;
        this.capital = capital;
        this.dias_plazo = dias;
        this.tipo_interes = tipo;
    }
    
    //Getters
    public void set_titular(String cliente){
        this.titular = cliente;
    }
    public void set_capital(float dinero){
        this.capital = dinero;
    }
    public void set_dias_plazo(int dias){
        this.dias_plazo = dias;
    }
    public void set_tipo_interes(float interes){
        this.tipo_interes = interes;
    }
    
    //Setters
    public String get_titular(){
        return this.titular;
    }
    public double get_capital(){
        return this.capital;
    }
    public int get_dias_plazo(){
        return this.dias_plazo;
    }
    public double get_tipo_interes(){
        return this.tipo_interes;
    }
    
    //Metodos
    public double liquidar(){
        return get_capital() + obtener_intereses();
    }
    
    public double obtener_intereses(){
        return Math.round((dias_plazo * tipo_interes * capital)/365)/100.0;
    }
}
