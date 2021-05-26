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
public class Productos {
    protected String fecha_caducidad;
    protected String num_lote;
    protected String fecha_envasado;
    protected String pais_origen;
    
    protected Productos(){}
    
    protected Productos(String cad, String lote, String fecha, String origen){
        this.fecha_caducidad = cad;
        this.num_lote = lote;
        this.fecha_envasado = fecha;
        this.pais_origen = origen;
    }
    
    //Setters
    protected void set_caducidad(String caducidad){
        this.fecha_caducidad = caducidad;
    }
    protected void set_lote(String lote){
        this.num_lote = lote;
    }
    protected void set_fecha_envasado(String envasado){
        this.fecha_envasado = envasado; 
    }
    protected void set_pais_origen(String pais){
        this.pais_origen = pais;
    }
    
    //Getters
    protected String get_caducidad(){
        return this.fecha_caducidad;
    }
    protected String get_lote(){
        return this.num_lote;
    }
    protected String get_fecha_envasado(){
        return this.fecha_envasado; 
    }
    protected String get_pais_origen(){
        return this.pais_origen;
    }
}
