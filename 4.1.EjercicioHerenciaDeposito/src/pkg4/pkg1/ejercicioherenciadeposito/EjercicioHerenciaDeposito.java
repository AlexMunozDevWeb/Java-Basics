/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg1.ejercicioherenciadeposito;

/**
 *
 * @author alex
 */
public class EjercicioHerenciaDeposito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deposito cliente1 = new Deposito("Juan",1000,30,10);
        System.out.println("PRIMER DEPOSITO");
        System.out.println("Consultar intereses: " + cliente1.obtener_intereses());
        System.out.println("Capital despues de los intereses: " + cliente1.liquidar());
        
        System.out.println("\nSEGUNDO DEPOSITO");
        DepositoEstructurado cliente2 = new DepositoEstructurado("Alex",1000,60,25,100);
        System.out.println("El resultado del depósito básico es: " + cliente2.liquidar());
        System.out.println("El resultado del depósito estructurado es: " + cliente2.obtener_intereses_ampliado());
        
    }
    
}
