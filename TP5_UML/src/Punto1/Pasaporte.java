package Punto1;


import Punto1.Foto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isaias
 */
public class Pasaporte {
    private int numero;
    private String fechaEmision;
    private Titular titular;
    private Foto foto;
    
    public Pasaporte(){
        
    }
    
    public Pasaporte(int numero, String fechaEmision, String imagen, String formato){
        this.numero=numero;
        this.fechaEmision=fechaEmision;
        this.foto=new Foto(imagen, formato);
    }
    
    public void setTitular(Titular titular){
        this.titular=titular;
        if(titular!=null && titular.getPasaporte()!=this){
            titular.setPasaporte(this);
        }
    }
    
    public Titular getTitular(){
        return titular;
    }
}
