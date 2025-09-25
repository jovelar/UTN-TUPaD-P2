package Punto4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Isaias
 */
public class Banco {
    private String nombre;
    private String cuit;  //Se asume el cuit como String por los guiones
    
    public Banco(){
        
    }
    
    public Banco(String nombre, String cuit){
        this.nombre=nombre;
        this.cuit=cuit;
    }
}
