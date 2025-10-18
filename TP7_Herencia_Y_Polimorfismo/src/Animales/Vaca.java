/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;

/**
 *
 * @author isaia
 */
public class Vaca extends Animal{
    
    public Vaca(String descripcionAnimal) {
        super(descripcionAnimal);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("MUUUUUUUU!!!!!");
    }
}
