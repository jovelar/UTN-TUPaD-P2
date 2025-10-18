/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author isaia
 */
public abstract class Animal {

    private String descripcionAnimal;

    public Animal(String descripcionAnimal) {
        this.descripcionAnimal = descripcionAnimal;
    }
    
    
    public void hacerSonido(){
        
    }
    
    public void describirAnimal(){
        System.out.println(descripcionAnimal);
    }
}
