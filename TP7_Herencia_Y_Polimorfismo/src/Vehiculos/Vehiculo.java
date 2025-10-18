/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author Isaias
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    
    public Vehiculo(){
        
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarInfo(){
        System.out.println("MARCA: "+marca+", MODELO: "+modelo);
    }
    
    @Override
    public String toString(){
        return ("MARCA: "+marca+", MODELO: "+modelo);
    }
}
