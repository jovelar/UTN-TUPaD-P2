/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto1;

/**
 *
 * @author isaias ovelar
 */
public class Titular {
    private String nombre;
    private int DNI;
    private Pasaporte pasaporte;
    
    public Titular(){
        
    }
    
    public Titular(String nombre,int DNI){
        this.nombre=nombre;
        this.DNI=DNI;
    }
    
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte=pasaporte;
        if(pasaporte!=null && pasaporte.getTitular()!=this){
            pasaporte.setTitular(this);
        }
    }
    
    public Pasaporte getPasaporte(){
        return pasaporte;
    }
    
}
