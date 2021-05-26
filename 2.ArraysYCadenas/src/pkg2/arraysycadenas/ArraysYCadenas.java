/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.arraysycadenas;

import java.util.Arrays;

/**
 *
 * @author alex
 */
public class ArraysYCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ******** ARRAYS ********
        int notas[]; //tambien válido int[] notas;
        notas = new int[8];
        int notas2[] = new int[8]; //tambien se puede hacer todo a la vez
        int notas3[] = {5,6,7}; //Asignacion de valores en la declaracion
        int notas4[] = new int[]{6,9,7};

        int nota[] = new int[] {7,3,9,7,5,6,1,2,3,4,10,4,5,6,8,9,10,10};    
        int suma = 0;
        float media;

        for (int i=0;i<=17;i++){
         suma+=nota[i];
        }
        media=suma/18;
        System.out.println("media notas: " + media);
        
        nota = new int[25];//un array se puede inicializar las veces que haga falta
        notas = notas2;//Dos arrays se pueden asignar si son del mismo tipo
        
        //Ordenar array ascendente
        int array_ordenar[]={4,5,2,3,7,8,2,3,9,5};
        Arrays.sort(array_ordenar);
        System.out.println("Ordenar array:");
        for(int i=0; i < array_ordenar.length; i++){
            System.out.print(array_ordenar[i] + " ");
        }
        System.out.println("\n");
        
        // MÉTODOS PARA EL ARRAY
        String palabras[] = new String[]{"hola","que","tal","pepe","?"};
        
        // LENGHT
        String texto = "Prueba lenght";
        System.out.println("longitud: " + texto.length());
        
        // ARRAY FILL
        int valores[] = new int[23];
        Arrays.fill(valores, -1);//Todo el array vale -1
        System.out.println("Ejemplo array fill: ");
        for(int i = 0; i < valores.length ; i++){
            System.out.print(valores[i] + ", ");
        }
        System.out.println();
        
        // EQUALS 
        if (palabras[0].equals("hola")){
            System.out.println("valor del equal: " + palabras[0].equals("hola"));
        }else{
            System.out.println("valor del equal: " + palabras[0].equals(""));
        }
        
        // SORT
        int ordenar[] = new int[] {7,3,9,7,5,6,1,2,3,4,10,4,5,6,8,9,10,10}; 
        Arrays.sort(ordenar);
        for(int i = 0; i < ordenar.length ; i++){
            System.out.print(ordenar[i] + ", ");
        }
        System.out.println();
        
        // BINARY SEARCH (busqueda de un elemento)
        System.out.println("Binary search: " + Arrays.binarySearch(ordenar, 8));
        
        // Arraycopy
        int uno[]={1,1,2};
        int dos[]={3,3,3,3,3,3,3,3,3};
        System.arraycopy(uno, 0, dos, 5, uno.length);
        for (int i=0;i<=8;i++){
            System.out.print(dos[i]+" ");
        } //Sale 112333333
        System.out.println("");
        
        // ******** CADENAS ********

        // CONCATENAR CADENAS
        String s1 = "Buenas", s2 = " tardes";
        System.out.println("Concatenar dos variables: " + s1.concat(s2));

        // CHAR AT
        System.out.println("Sacar una caracter en x posicion: " + s1.charAt(2));

        // SUBSTRING
        System.out.println("Empieza en la posicion 2: " + s1.substring(2));
        System.out.println("Impreme de la posicion 2 a la 5: " + s1.substring(2,5));

        //  INDEX OF (devuelve la posicion donde se encuentra un texto dado)
        String texto_prueba = "Quería decirte que quiero que te vayas.";
        System.out.println(texto_prueba.indexOf("que"));
        
        // LASTINDEXOF (devuelve la ultima aparacion)
        System.out.println(texto_prueba.lastIndexOf("que"));

        //ENDSWITH (devuelve true si la cadena termina con un determinado texto)
        System.out.println(texto_prueba.endsWith("vayas")); //Da false
        System.out.println(texto_prueba.endsWith("vayas.")); //Da true

        //startsWith devuelve true si empeza por una determinada cadena
        System.out.println(texto_prueba.startsWith("Quería")); //Da true
        System.out.println(texto_prueba.startsWith("va.")); //Da false

        //Replace
        String prueba_replace = "Mariposa";
        System.out.println(prueba_replace.replace("a", "e"));
    }
    
}
