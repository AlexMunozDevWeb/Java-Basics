/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg3.ordenararraylistpersonasmio;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alex
 */
public class OrdenarArrayListPersonasMio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> list_personas = new ArrayList();
        
        Persona personas[] = new Persona[4];
        Persona auxPersona = new Persona();
        
        Persona per_uno =  new Persona("Javier", "Ripoll", 45, "96851247Z", "yecla");
        personas[0] = per_uno;
        Persona per_dos = new Persona("Fran", "Hernandez", 25, "96524145D", "jumilla");
        personas[1] = per_dos;
        Persona per_tres = new Persona("alex", "Muñoz", 30, "78561245D", "cieza");
        personas[2] = per_tres;
        Persona per_cuatro = new Persona("Sandra", "Lledo", 30, "15457863F", "yecla");
        personas[3] = per_cuatro;
        
        System.out.println("-----------");
        System.out.println(personas[0].toString());
        System.out.println(personas[1].toString());
        System.out.println(personas[2].toString());
        System.out.println(personas[3].toString());
        
        auxPersona.ordenar_personas_arraylist(list_personas, personas);
        
        System.out.println("-----------");
        System.out.println("\n" + personas[0].toString());
        System.out.println("\n" + personas[1].toString());
        System.out.println("\n" + personas[2].toString());
        System.out.println("\n" + personas[3].toString());
        
        //Iterar ArrayList Alumnos
        System.out.println("\n------Personas------");
        Iterator<Persona> nombreIterator = list_personas.iterator();
        while(nombreIterator.hasNext()){
            Persona elemento = nombreIterator.next();
            
            System.out.print("Personas:" + elemento);
            System.out.println("\n");
        }  
    
        
        //Agrupar por ciudad
        //1.	Dado un arraylist de personas, con los campos indicados en el ejercicio explicado en la primera, Decir las veces que se repiten las ciudades.
        //2.	Deben hacerle funcionar al problema que se ha explicado en la primera clase.

        ArrayList<Persona> p = new ArrayList();
        
        p.add(per_uno);
        p.add(per_dos);
        p.add(per_tres);
        p.add(per_cuatro);
        
        ArrayList<Agrupar_por_ciudad> ac=new ArrayList();
        Agrupar_por_ciudad apc;
        int contador=0;
        int contadora;
        int veces;
        String ciudad;
        
        while (contador < p.size())
        {
            ciudad=p.get(contador).getCiudad();
            
            if (ac.isEmpty())
            {
                apc=new Agrupar_por_ciudad(ciudad,1);
                ac.add(apc);
            }
            else
            {
                contadora=0;
                while(contadora<ac.size() && ac.get(contadora).getNombre()!= ciudad)
                {
                    contadora++;
                }
                if (contadora < ac.size())
                {
                    veces = ac.get(contadora).getRepeticiones()+1;
                    ac.get(contadora).setRepeticiones(veces);
                }
                else
                {
                    apc = new Agrupar_por_ciudad(ciudad,1);
                    ac.add(apc);
                }
            }
            contador++;
        }
        
        //Iterar ArrayList Alumnos
        System.out.println("\n------Ciudades------\n");
        Iterator<Agrupar_por_ciudad> acIterator = ac.iterator();
        while(acIterator.hasNext()){
            Agrupar_por_ciudad elemento = acIterator.next();
            
            System.out.print("Personas:" + elemento);
            System.out.println("\n");
        }   
        
        Persona[] personasEntrada=  new Persona[10];
        
        EntradaDatos entradaDatos = new EntradaDatos();
        
        int longitud = entradaDatos.entrada(personasEntrada);
        
        System.out.println("Numero de personas: " + longitud);
        
    }
    
}
