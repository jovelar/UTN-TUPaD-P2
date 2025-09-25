/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto11;

/**
 *
 * @author isaia
 */
public class Cancion {
    private String titulo;
    private Artista artista;
    
    public Cancion(){
        
    }
    
    public Cancion(String titulo){
        this.titulo=titulo;
    }
    
    public void setArtista(Artista artista){
        this.artista=artista;
    }
    
    @Override
    
    public String toString(){
        return("Cancion: "+ titulo + artista.toString());
    }
}
