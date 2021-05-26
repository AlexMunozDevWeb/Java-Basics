/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg2.ejercicioagroalimentaria;

/**
 *
 * @author alex
 */
public class Aire extends Congelados{
    protected double porcentaje_N;
    protected double porcentaje_O2;
    protected double porcentaje_CO2;
    protected double porcentaje_H2O;
    
    public Aire(){}
    
    public Aire(double por_N, double por_O2, double por_CO2, double por_H2O, int temp_mantenimiento, String caducidad, String lote, String fecha_env, String origen){
        super(temp_mantenimiento, caducidad, lote, fecha_env, origen);
        this.porcentaje_N = por_N;
        this.porcentaje_O2 = por_O2;
        this.porcentaje_CO2 = por_CO2;
        this.porcentaje_H2O = por_H2O;
    }
    
    //Setters
    public void set_N(double por_N){
        this.porcentaje_N = por_N;
    }
    public void set_O2(double por_O2){
        this.porcentaje_O2 = por_O2;
    }
    public void set_CO2(double por_CO2){
        this.porcentaje_CO2 =  por_CO2;
    }
    public void set_H2O(double por_H2O){
        this.porcentaje_H2O = por_H2O;
    }
    
    //Getters
    public double get_N(){
        return porcentaje_N;
    }
    public double get_O2(){
        return porcentaje_O2;
    }
    public double get_CO2(){
        return porcentaje_CO2;
    }
    public double get_H22O(){
        return porcentaje_H2O;
    }
    
    @Override
    public String toString(){
        return "Fecha caducidad: " + fecha_caducidad + "\nNumero de lote: " + num_lote + "\nFecha envasado: " + fecha_envasado + "\nPais origen: " + pais_origen
                + "\nTemperatura de mantenimiento: " + temp_mantenimiento + "º" + "\nPorcentaje de Nitrogeno: " + porcentaje_N + "%" + "\nPorcentaje de Oxígeno: " + porcentaje_O2 + "%"  
                + "\nPorcentaje de Dioxido de Carbono: " + porcentaje_CO2 + "%" + "\nPorcentaje de Vapor de agua: " + porcentaje_H2O + "%";
    }
}
