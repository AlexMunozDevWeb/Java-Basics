/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg1agruparnombrearraylist;

/**
 *
 * @author alex
 */
public class Agrupar_por_nombre {
    private String nombre;
    private int repeticiones;

    public Agrupar_por_nombre() {
    }

    public Agrupar_por_nombre(String nombre, int repeticiones) {
        this.nombre = nombre;
        this.repeticiones = repeticiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    @Override
    public String toString() {
        return "Agrupar_por_nombre{" + "nombre=" + nombre + ", repeticiones=" + repeticiones + '}';
    }
}
