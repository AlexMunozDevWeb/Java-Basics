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
public class Ciudades {
     String ciudad;
   int repeticiones;
   public Ciudades(){}
   public Ciudades(String c, int r){
       this.ciudad=c;
       this.repeticiones=r;
   } 
   public String getciudad(){
       return ciudad;
   }
   public int getrepeticiones(){
       return repeticiones;
   }
   public void setciudad(String c){
       this.ciudad=c;
       
   }
   public void setrepeticiones(int r){
       this.repeticiones=r;
   }
   public ArrayList<Ciudades> repeticiones(ArrayList<Personas> p){
    ArrayList<Ciudades> ciu=new ArrayList<Ciudades>();
    Ciudades c=new Ciudades();
    int contador=0;
    int contador1=0;
    int veces=0;
    int longitud=p.size();
    String ciudad;
    
    while (contador<longitud){
        
        ciudad=p.get(contador).getciudad();
        
        if (ciu.isEmpty()){
            
            c=new Ciudades(ciudad,1);
            ciu.add(contador,c);
            
        }
        else
        {
            contador1=0;
            while(contador1<ciu.size()&& ciudad!=p.get(contador1).getciudad() ){
                contador1++;
            }
            if (contador1<ciu.size()){
                c=new Ciudades(ciudad,1);
                ciu.add(contador1, c);

            }
            else{
                veces=ciu.get(contador1).getrepeticiones();
                veces=veces+1;
                ciu.get(contador1).setrepeticiones(veces);
            }


        }
        contador++;
    }
    return ciu;
   }
}
