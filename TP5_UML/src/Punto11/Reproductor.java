/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto11;

/**
 *
 * @author isaia
 */
public class Reproductor {
    
    public Reproductor(){
        
    }
    
    public void reproducir(Cancion cancion){
        
        //Con los .toString() "encadenados" deberia mostrar algo como:
        //Reproduciendo: Lalala , Artista: Fulano, Genero: instrumental
        
        System.out.println("Reproduciendo"+ cancion.toString());
        
    }
}
