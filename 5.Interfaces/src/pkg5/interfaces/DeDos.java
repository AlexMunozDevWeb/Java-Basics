/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.interfaces;

/**
 *
 * @author alex
 */
public class DeDos implements Series{
    int iniciar;
    int valor;

    public DeDos() {
        this.iniciar = 0;
        this.valor = 0;
    }
    
    @Override
    public int getSiguiente(){
        valor += 2;
        return valor;
    }
    
    @Override
    public void reiniciar(){
        this.valor = this.iniciar;
    }
    
    @Override
    public void setComenzar(int x){
        iniciar = x;
        valor = x;
    }
    
}
