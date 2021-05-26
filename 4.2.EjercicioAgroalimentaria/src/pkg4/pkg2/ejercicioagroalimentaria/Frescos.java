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
public class Frescos extends Productos{
    public Frescos(){}
    
    public Frescos(String cad, String lote, String fecha_env, String origen){
        super(cad, lote, fecha_env, origen);
    }
    
    @Override
    public String toString(){
        return "Fecha caducidad: " + fecha_caducidad + "\nNumero de lote: " + num_lote + "\nFecha envasado: " + fecha_envasado + "n\nPais origen:" + pais_origen;
    }
}
