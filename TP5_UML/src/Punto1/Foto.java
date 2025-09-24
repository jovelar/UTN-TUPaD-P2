package Punto1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author isaia
 */
public class Foto {
    private String foto;
    private Pasaporte pasaporte;
    
    public Foto(String foto){
        this.foto=foto;
    }
    
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte=pasaporte;
        if(pasaporte!=null && pasaporte.getFoto()!=this){
            pasaporte.setFoto(this);
        }
    }
    
    public Pasaporte getPasaporte(){
        return pasaporte;
    }
}
