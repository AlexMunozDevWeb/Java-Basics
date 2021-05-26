/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.variables;

/**
 *
 * @author alex
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ENTEROS (byte, short, int, long) 
        int i = 12;
        byte b = (byte)i; //no hay error por el casteo
        
        int dias = 30;
        int a = 5, c = 10;
        int d = a + c;
        System.out.println(dias + "\nSuma de a + b = " + d);
        
        //BOLEANOS (true -1, false 0) valor inicial por defecto 0 (false)
        boolean decision = true;
        
        //CARACTERES 
        char letra;
        letra = 'C';
        System.out.println(letra);
        letra = 67;
        System.out.println("El valor unicode es de 67 por lo tanto vale C --> " + letra);
        
        //Operador ternario
        int edad = 18;
        int paga;
        paga = (edad > 18)?6000:3000;
        System.out.println("Resultado operador ternario: " + paga);
        
        edad = 19;
        paga = (edad > 18)?6000:3000;
        System.out.println("Resultado operador ternario: " + paga);
        
        //Clase Math
        double x = Math.pow(3, 3);
        System.out.println("Resultado 3 elevado a 3: " + x);
        double pi = Math.PI;
        System.out.println(pi);

    }
    
}
