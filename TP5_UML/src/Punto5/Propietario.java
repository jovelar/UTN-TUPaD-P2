/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto5;

/**
 *
 * @author Isaias
 */
public class Propietario {
    private int dni;
    private String nombre;
    private Computadora computadora;
    
    public Propietario(){
        
    }
    
    public Propietario(int dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
    }
    
    public void setComputadora(Computadora computadora){
        this.computadora=computadora;
        if(computadora!=null && computadora.getPropietario()!=this)
        {
            computadora.setPropietario(this);
        }
    }
    
    public Computadora getComputadora()
    {
        return computadora;
    }
}
