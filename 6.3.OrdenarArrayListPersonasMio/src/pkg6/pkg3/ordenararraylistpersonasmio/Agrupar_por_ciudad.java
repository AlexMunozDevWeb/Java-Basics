/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg3.ordenararraylistpersonasmio;

/**
 *
 * @author alex
 */
public class Agrupar_por_ciudad {
    private String ciudad;
    private int repeticiones;

    public Agrupar_por_ciudad() {
    }

    public Agrupar_por_ciudad(String ciudad, int repeticiones) {
        this.ciudad = ciudad;
        this.repeticiones = repeticiones;
    }

    public String getNombre() {
        return ciudad;
    }

    public void setNombre(String nombre) {
        this.ciudad = nombre;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    @Override
    public String toString() {
        return "Agrupar_por_nombre{" + "nombre=" + ciudad + ", repeticiones=" + repeticiones + '}';
    }
}
