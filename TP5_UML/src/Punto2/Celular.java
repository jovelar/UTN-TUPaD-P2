package Punto2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Isaias Ovelar
 */
public class Celular {
    private int imei;
    private String modelo;
    private String marca;
    private Bateria bateria;
    private Usuario usuario;
    
    public Celular(){
        
    }
    
    public Celular(int imei, String modelo, String marca, Bateria bateria){
        this.imei=imei;
        this.modelo=modelo;
        this.marca=marca;
        this.bateria=bateria;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario=usuario;
        if(usuario!=null && usuario.getCelular()!=this){
            usuario.setCelular(this);
        }
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    
}
