/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.herenciayclasesabstractas;

import java.util.Calendar;

/**
 *
 * @author alex
 */
public class EAsalariado extends Empleado{
    private double salarioBase;
 
    public EAsalariado () {
        super();
        salarioBase = 0.0;
    }
 
    public EAsalariado (String dni, String nombre, String apellidos, 
            int yearIngreso, double salarioBase) {
        super(dni, nombre, apellidos, yearIngreso);
        this.salarioBase = salarioBase;
    }
 
    public double obtenerSalario (){
        Calendar now = Calendar.getInstance();
        int actualYear = now.get(Calendar.YEAR);
        int anios = actualYear - getYearIngreso(); 
        if (anios<0){
            System.out.println("Error: número de años negativo");
        }
        if (anios < 2) return salarioBase;
        else if (anios >= 2 && anios<=3) return salarioBase * 0.05 + salarioBase;
        else if (anios >= 4 && anios<=7) return salarioBase * 0.10 + salarioBase;
        else if (anios >= 8 && anios<=15) return salarioBase * 0.15 + salarioBase;
        else return salarioBase * 0.20 + salarioBase;        
    }
 
    public void imprimir(){
        super.imprimir();
        System.out.printf("Salario: %.2f\n", obtenerSalario());
        System.out.println();
    }
    
    public void setSalarioBase (double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
}
