/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.arraylisttema;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alex
 */
public class ArrayListTema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos_biblioteca = new ArrayList();
        ArrayList<Libro> libros_biblioteca = new ArrayList();
        
        Alumno al_1 = new Alumno("Alejandro", "Muñoz", 35, "25361478D", "C/ Francisco Azorin");
        alumnos_biblioteca.add(al_1);
        
        Alumno al_2 = new Alumno("Roberto", "Fernandez", 30, "56897412F", "C/ Santa Barbara");
        alumnos_biblioteca.add(al_2);
        
        Alumno al_3 = new Alumno("Fernando", "Soriano", 20, "79461328G", "C/ Pio Baroja");
        alumnos_biblioteca.add(al_3);
        
        Alumno al_4 = new Alumno("Javier", "Hernandez", 25, "73194682E", "C/ España");
        alumnos_biblioteca.add(al_4);
        
        //Iterar ArrayList Alumnos
        System.out.println("------ALUMNOS------");
        Iterator<Alumno> nombreIterator = alumnos_biblioteca.iterator();
        while(nombreIterator.hasNext()){
            Alumno elemento = nombreIterator.next();
            
            System.out.print("Alumno:" + elemento);
            System.out.println("\n");
        }        
        
        Libro book_1 = new Libro("4d7c8", "Vacaciones", "Amaya", "Enrique del pozo", 352);
        libros_biblioteca.add(book_1);
        
        Libro book_2 = new Libro("45da2", "La sombre del viento", "Planeta", "Carlos Ruiz Zafon", 752);
        libros_biblioteca.add(book_2);
        
        Libro book_3 = new Libro("89a44", "El juego del angel", "Planeta", "Carlos Ruiz Zafon", 656);
        libros_biblioteca.add(book_3);
        
        Libro book_4 = new Libro("acv45", "El prisionero de Azkadan", "Salamandra", "J. K. Rowling", 523);
        libros_biblioteca.add(book_4);
        
        //Iterar ArrayList Alumnos
        System.out.println("------LIBROS------");
        Iterator<Libro> librosIterar = libros_biblioteca.iterator();
        while(librosIterar.hasNext()){
            Libro elemento = librosIterar.next();
            System.out.print("Alumno:" + elemento);
            System.out.println("\n");
        }
        
        //Añadir prestamos
        ArrayList<Prestar> prestamosLibros = new ArrayList();
        
        Prestar prestamo_1 = new Prestar(1, "12/02/2021", al_1.getDNI(), book_1.getCodigo());
        prestamosLibros.add(prestamo_1);
        
        Prestar prestamo_2 = new Prestar(2, "13/02/2021", al_1.getDNI(), book_2.getCodigo());
        prestamosLibros.add(prestamo_2);
        
        Prestar prestamo_3 = new Prestar(3, "14/02/2021", al_2.getDNI(), book_3.getCodigo());
        prestamosLibros.add(prestamo_3);
        
        Prestar prestamo_4 = new Prestar(4, "15/02/2021", al_3.getDNI(), book_4.getCodigo());
        prestamosLibros.add(prestamo_4);
        
        //Iterar ArrayList Prestamos
        System.out.println("------Prestamos------");
        Iterator<Prestar> prestamosIterador = prestamosLibros.iterator();
        while(prestamosIterador.hasNext()){
            Prestar elemento = prestamosIterador.next();
            System.out.print(elemento);
            System.out.println("\n");
        }
        
        //Comprobar cuantos libres tiene un alumno
        Prestar auxPrestar = new Prestar();
        int cantidad_libros = auxPrestar.cantidad_libros_alumno(al_1.getDNI(), prestamosLibros);
        System.out.println("Cantidad de libros del DNI " + al_1.getDNI() + " :" + cantidad_libros);
        
        cantidad_libros = auxPrestar.cantidad_libros_alumno(al_2.getDNI(), prestamosLibros);
        System.out.println("Cantidad de libros del DNI " + al_2.getDNI() + " :" + cantidad_libros);
        
        cantidad_libros = auxPrestar.cantidad_libros_alumno(al_3.getDNI(), prestamosLibros);
        System.out.println("Cantidad de libros del DNI " + al_3.getDNI() + " :" + cantidad_libros);
        
        cantidad_libros = auxPrestar.cantidad_libros_alumno(al_4.getDNI(), prestamosLibros);
        System.out.println("Cantidad de libros del DNI " + al_4.getDNI() + " :" + cantidad_libros);
    }
    
}
