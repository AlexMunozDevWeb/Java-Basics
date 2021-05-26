/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.interfaces;

/**
 *
 * @author alex
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DeDos ob=new DeDos();
        
        for (int i=0;i<5;i++){
            System.out.println("Siguiente valor es: "+ob.getSiguiente());
        }
        
        System.out.println("\nReiniciando");
        
        ob.reiniciar();     
        for (int i=0;i<5;i++){
            System.out.println("Siguiente valor es: "+ob.getSiguiente());
        }
        System.out.println("\nIniciando en 100");
        
        ob.setComenzar(100);
        for (int i=0;i<5;i++){
            System.out.println("Siguiente valor es: "+ob.getSiguiente());
        }
            
    }
    
}
