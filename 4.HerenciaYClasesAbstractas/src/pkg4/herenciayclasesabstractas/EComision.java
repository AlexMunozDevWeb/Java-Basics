/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.herenciayclasesabstractas;

/**
 *
 * @author alex
 */
public class EComision extends Empleado{
    private int clientesCaptados;
    private double montoPorCliente;
    public static final double salarioMinimo = 750;
 
    public EComision () {
        super();
        clientesCaptados = 0;
        montoPorCliente = 0;
    }
 
    public EComision (String dni, String nombre, String apellidos, int yearIngreso, 
            int clientesCaptados, double montoPorCliente) {
        super(dni, nombre, apellidos, yearIngreso);
        this.clientesCaptados = clientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }
 
    public double obtenerSalario (){
        if (montoPorCliente*clientesCaptados > salarioMinimo)
            return montoPorCliente*clientesCaptados;
        else
            return salarioMinimo;
    }
 
    @Override
    public void imprimir (){
        super.imprimir();
        System.out.printf("Salario: %.2f\n", obtenerSalario());
        System.out.println();
    }
    
    public void setClientesCaptados (int clientesCaptados) {
        this.clientesCaptados = clientesCaptados;        
    }
 
    public int getClientesCaptados () {
        return clientesCaptados;
    }
    
    public void setMontoPorCliente(double montoPorCliente){
        this.montoPorCliente = montoPorCliente;
    }
    
    public double getMontoPorCliente(){
        return montoPorCliente;
    }
}
