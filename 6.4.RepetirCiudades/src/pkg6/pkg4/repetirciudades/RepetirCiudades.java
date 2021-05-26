/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg4.repetirciudades;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class RepetirCiudades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Personas> person=new ArrayList<Personas>();
        ArrayList<Ciudades> ciudad=new ArrayList<Ciudades>();
        Ciudades c=new Ciudades();
        Personas p=new Personas();
        person=p.persona();
        
         try{
                ciudad=c.repeticiones(person);
            }catch(ArrayIndexOutOfBoundsException exc){
                System.out.println("Recoger excepcion.");
            }
        
    }
    
}
