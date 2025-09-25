/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto2;

/**
 *
 * @author Isaias Ovelar
 */
public class Usuario {
    private String nombre;
    private int DNI;
    private Celular celular;
    
    public Usuario(){
        
    }
    
    public Usuario(int DNI, String nombre){
        this.DNI=DNI;
        this.nombre=nombre;
    }
    
    public void setCelular(Celular celular){
        this.celular=celular;
        if(celular!=null && celular.getUsuario()!=this){
            celular.setUsuario(this);
        }
    }
    
    public Celular getCelular(){
        return celular;
    }
    
}
