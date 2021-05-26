/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.excepciones;

/**
 *
 * @author alex
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean indiceNoValido = true;
        int i;
        String texto[] = {"Uno", "Dos", "Tres", "Cuatro", "Cinco"};
        while(indiceNoValido){
            try{
                i = (int) Math.round(Math.random()*9);
                System.out.println(texto[i]);
                indiceNoValido = false;
            }catch(ArrayIndexOutOfBoundsException exc){
                System.out.println("Fallo del indice");
            }
        }
    }
    
}
