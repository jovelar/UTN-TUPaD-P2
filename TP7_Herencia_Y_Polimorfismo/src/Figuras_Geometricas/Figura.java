/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras_Geometricas;

/**
 *
 * @author Isaias
 */
public abstract class Figura {
    private String nombre;
    
    public Figura(){
        
    }

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    public void calcularArea(){
    }
    @Override
    public String toString(){
        return nombre;
    }
}
