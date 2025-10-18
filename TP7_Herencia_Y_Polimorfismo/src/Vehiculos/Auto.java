/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author Isaias
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto() {
    }
    
    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println(super.toString()+",C.PUERTAS: "+cantidadPuertas);
    }
    
    
    
}
