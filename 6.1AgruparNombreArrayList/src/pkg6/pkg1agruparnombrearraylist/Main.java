/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg1agruparnombrearraylist;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Persona> p=new ArrayList();
        ArrayList<Agrupar_por_nombre> ap=new ArrayList();
        Agrupar_por_nombre apn;
        int contador=0;
        int contadora;
        int veces;
        String nombre;
        while (contador<p.size())
        {
            nombre=p.get(contador).getNombre();
            if (ap.isEmpty())
            {
                apn=new Agrupar_por_nombre(nombre,1);
                ap.add(apn);
            }
            else
            {
                contadora=0;
                while(contadora<ap.size() && ap.get(contadora).getNombre()!=nombre)
                {
                    contadora++;
                }
                if (contadora<ap.size())
                {
                    veces=ap.get(contadora).getRepeticiones()+1;
                    ap.get(contadora).setRepeticiones(veces);
                }
                else
                {
                    apn=new Agrupar_por_nombre(nombre,1);
                    ap.add(apn);
                }
            }
            contador++;
        }
    }
    
}
