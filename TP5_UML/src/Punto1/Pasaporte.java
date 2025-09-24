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
    private Foto foto;
    public Pasaporte()
    {
    }
    
    public Pasaporte(int numero,String fechaEmision){
        this.numero=numero;
        this.fechaEmision=fechaEmision;
    }
    
    public void setFoto(Foto foto){
        this.foto=foto;
        if(foto!=null && foto.getPasaporte()!=this){
            foto.setPasaporte(this);
        }
    }
    
    public Foto getFoto(){
        return foto;
    }
}
