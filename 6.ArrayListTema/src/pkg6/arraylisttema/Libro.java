/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.arraylisttema;

/**
 *
 * @author alex
 */
public class Libro {
   protected String codigo_libro;
    protected String titulo;
    protected String editorial;
    protected String autor;
    protected int numero_paginas;
    
    public Libro(){}
    
    public Libro(String cod, String title, String ed, String author, int pages){
        this.codigo_libro = cod;
        this.titulo = title;
        this.editorial = ed;
        this.autor = author;
        this.numero_paginas = pages;
    }
    
    //Setters
    public void setCodigo(String cod){
        this.codigo_libro = cod;
    }
    public void setTitulo(String title){
        this.titulo = title;
    }
    public void setEditorial(String ed){
        this.editorial = ed;
    }
    public void setAutor(String author){
        this.autor = author;
    }
    public void setNum_paginas(int pages){
        this.numero_paginas = pages;
    }
    //Getters
    public String getCodigo(){
        return this.codigo_libro;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getEditorial(){
        return this.editorial;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getNum_paginas(){
        return this.numero_paginas;
    }
    
    @Override
    public String toString(){
        return "Codigo: " + codigo_libro +".\nTitulo: " + titulo + ".\nEditorial: " + editorial + ".\nAutor: " + autor + ".\nPaginas: " + numero_paginas;
    } 
}
