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
public class Agua extends Congelados{
    protected double salinidad;
    
    public Agua(){}
    
    public Agua(double sal, int temp_mant, String caducidad, String lote, String fecha_env, String origen){
        super(temp_mant, caducidad, lote, fecha_env, origen);
        this.salinidad = sal;
    }
    
    //setters
    public void set_salinidad(double sal){
        this.salinidad =  sal;
    }
    
    //getters
    public double get_salinidad(double sal){
        return this.salinidad;
    }
    
    @Override
    public String toString(){
        return "Fecha caducidad: " + fecha_caducidad + "\nNumero de lote: " + num_lote + "\nFecha envasado: " + fecha_envasado + "\nPais origen: " + pais_origen
                + "\nTemperatura de mantenimiento: " + temp_mantenimiento + "ยบ" + "\nSalinidad: " + salinidad + " gr. por litro de agua";
    }
}
