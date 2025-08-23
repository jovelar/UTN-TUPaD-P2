/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

//Para la validacion de año
import java.time.LocalDateTime;

/**
 *
 * @author Isaias
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public Libro(){
        
    }
    
    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion=anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if(validarAnio(anioPublicacion)){
            this.anioPublicacion = anioPublicacion;
        }
        
    }
    
    public boolean validarAnio(int anio)
    {
        LocalDateTime actual=LocalDateTime.now();
        boolean estado=true;
        
        if(anio<0)
        {
            estado=false;
        }
        
        //Si el año supera al año actual
        if(anio > actual.getYear())
        {
            estado=false;
        }
        
        return estado;
    }
}
