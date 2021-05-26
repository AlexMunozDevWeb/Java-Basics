/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg2.ejercicioagroalimentaria;

/**
 *
 * @author alex
 */
public class EjercicioAgroalimentaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2 Productos frescos
        System.out.println("---- PRODUCTOS FRESCOS ----");
        Frescos fr_1 = new Frescos("12/5/2022","LOT4578","16/04/2021","España");
        System.out.println(fr_1.toString() + "\n");
        
        Frescos fr_2 = new Frescos("12/5/2023","LOT7946","16/04/2021","Francia");
        System.out.println(fr_2.toString() + "\n");
        
        //3 Productos refrigerados
        System.out.println("---- PRODUCTOS REFRIGERADOS ----");
        Refrigerados ref_1 = new Refrigerados("301",5,"12/5/2022","LOT4578","16/04/2021","España");
        System.out.println(ref_1.toString() + "\n");
        
        Refrigerados ref_2 = new Refrigerados("303",3,"12/1/2023","LOT7345","17/04/2021","Francia");
        System.out.println(ref_2.toString() + "\n");
        
        Refrigerados ref_3 = new Refrigerados("305",2,"25/7/2022","LOT5623","17/04/2021","Portugal");
        System.out.println(ref_3.toString() + "\n");
        
        //2 Productos congelos por aire
        System.out.println("---- PRODUCTOS CONGELADOS POR AIRE ----");
        Aire ar_1 = new Aire(25.5, 30.8, 10.1, 5.9, 0, "22/02/2022", "Lot7985", "17/04/2021", "Estados Unidos");
        System.out.println(ar_1.toString() + "\n");
        
        Aire ar_2 = new Aire(20.3, 10.7, 1.1, 6.7, 0, "22/02/2022", "Lot7985", "17/04/2021", "Estados Unidos");
        System.out.println(ar_2.toString() + "\n");
        
        //2 Productos congelados por agua
        System.out.println("---- PRODUCTOS CONGELADOS POR AGUA ----");
        Agua ag_1 = new Agua(5.3, 5, "01/02/2023", "LOT2549", "17/04/2021", "Italy");
        System.out.println(ag_1.toString() + "\n");
        
        Agua ag_2 = new Agua(3.3, 3, "12/12/2022", "LOT7951", "17/04/2021", "Alemania");
        System.out.println(ag_2.toString() + "\n");
        
        //1 Producto congelado con Nitrogeno
        System.out.println("---- PRODUCTOS CONGELADOS POR NITRÓGENO ----");
        Nitrogeno nitro_1 = new Nitrogeno("Neveras", 10, 0, "01/02/2022", "LOT5348", "17/04/2021", "España");
        System.out.println(nitro_1.toString() + "\n");
    }
    
}
