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
public class Nitrogeno extends Congelados{
    protected String metodo_congelacion;
    protected int exposicion_nitrogeno;
    
    public Nitrogeno(){}
    
    public Nitrogeno(String metodo, int exp_nitrogeno , int temp_mant, String caducidad, String lote, String fecha_env, String origen){
        super(temp_mant, caducidad, lote, fecha_env, origen);
        this.metodo_congelacion = metodo;
        this.exposicion_nitrogeno = exp_nitrogeno;
    }
    
    //setters
    public void set_metodo_congelacion(String metodo){
        this.metodo_congelacion =  metodo;
    }
    public void set_exposicion_nitrogeno(int exp){
        this.exposicion_nitrogeno =  exp;
    }
    
    //getters
    public String get_metodo_congelacion(){
        return this.metodo_congelacion;
    }
    public int get_exposicion_nitrogeno(){
        return this.exposicion_nitrogeno;
    }
    
    @Override
    public String toString(){
        return "Fecha caducidad: " + fecha_caducidad + "\nNumero de lote: " + num_lote + "\nFecha envasado: " + fecha_envasado + "\nPais origen:" + pais_origen
                + "\nTemperatura de mantenimiento: " + temp_mantenimiento + "º" + "\nMetodo de congelacion: " + metodo_congelacion + "\nExposicion al Nitrógeno: " + exposicion_nitrogeno + 
                " seg.";
    }
}
