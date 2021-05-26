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
public class Refrigerados extends ProductosRefCong{
    protected String cod_organismo_supervision;
    
    public Refrigerados(){}
    
    public Refrigerados(String cod_super, int temp_mant, String cad, String lote, String fecha, String origen){
        super(temp_mant, cad, lote, fecha, origen);
        this.cod_organismo_supervision = cod_super;
    }
    
    //Setter
    public void set_cod_organimo(String cod){
        this.cod_organismo_supervision = cod;
    }   
    
    //Getter
    public String get_cod_organimos(){
        return this.cod_organismo_supervision;
    }
    
    @Override
    public String toString(){
        return "Fecha caducidad: " + fecha_caducidad + "\nNumero de lote: " + num_lote + "\nFecha envasado: " + fecha_envasado + "\nPais origen:" + pais_origen
                + "\nCodigo supervision: " + cod_organismo_supervision + "\nTemperatura de mantenimiento: " + temp_mantenimiento + "ยบ";
    }
}
