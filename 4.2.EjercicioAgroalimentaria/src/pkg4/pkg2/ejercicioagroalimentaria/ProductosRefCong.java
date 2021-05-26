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
public class ProductosRefCong extends Productos{
    protected int temp_mantenimiento; 

    public ProductosRefCong(){}
    
    public ProductosRefCong(int temp, String caducidad, String lote, String fecha_env, String origen){
        super(caducidad, lote, fecha_env, origen);
        this.temp_mantenimiento = temp;
    }
    
    //setters
    public void set_temp_mantenimiento(int temp){
        this.temp_mantenimiento = temp;
    }
    
    //getters
    public int get_temp_mantenimiento(){
        return this.temp_mantenimiento;
    }
}
