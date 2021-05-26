/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.arraylisttema;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class Prestar {
    protected int numero_prestamo;
    protected String fecha;
    protected String dniPersona;
    protected String codigo_libro;
    
    public Prestar(){}
    
    public Prestar(int num, String date, String dniPerson, String cod){
        this.numero_prestamo = num;
        this.fecha = date;
        this.dniPersona = dniPerson;
        this.codigo_libro = cod;
    }
    
    //setters
    public void setNumeroPrestamos(int num){
        this.numero_prestamo = num;
    }
    public void setFecha(String date){
        this.fecha = date;
    }
    public void setDniPersona(String dni){
        this.dniPersona = dni;
    }
    public void setCodLibro(String cod){
        this.codigo_libro = cod;
    }
    //getter
    public int getNumeroPrestamos(){
        return this.numero_prestamo;
    }  
    public String getFecha(){
        return this.fecha;
    }
    public String getDNI(){
        return this.dniPersona;
    }
    public String getCodigoLibro(){
        return this.codigo_libro;
    }
    
    //metodo para añadir prestamos
    public void addPrestamos(ArrayList<Prestar> prestamos,int numPrestamo, String fecha, String dni, String codLibro){
        Prestar auxPrestamos = new Prestar(numPrestamo, fecha, dni, codLibro);
        prestamos.add(auxPrestamos);
    }
    
    //Método para comprobar cuantos libres tiene un alumno
    public int cantidad_libros_alumno(String dni, ArrayList<Prestar> prestamos){
        int contador = 0, indice = 0;
        
        while (indice < prestamos.size()){
            
            //FORMA 1
            contador = dni.equals(prestamos.get(indice).getDNI()) ? ++contador : contador;
            
            //FORMA 2
            if(dni.equals(prestamos.get(indice).getDNI())){
                contador++;
            }
            
            indice++;
        }
        
        return contador;
    }
    
    @Override
    public String toString(){
        return "Numero prestamos: " + this.numero_prestamo + ".\nFecha: " + this.fecha + ".\nDNI: " + this.dniPersona + ".\nCodigo libro: " + this.codigo_libro;
    }
}
