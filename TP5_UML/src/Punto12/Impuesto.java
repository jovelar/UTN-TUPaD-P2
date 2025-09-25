/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto12;

/**
 *
 * @author isaias Ovelar
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;
    
    public Impuesto(){
        
    }
    
    public Impuesto(double monto){
        this.monto=monto;
    }
    
    public void setContribuyente(Contribuyente contribuyente){
        this.contribuyente=contribuyente;
    }
    

}

