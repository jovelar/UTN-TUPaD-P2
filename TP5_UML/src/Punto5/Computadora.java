/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto5;

/**
 *
 * @author Isaias Ovelar
 */
public class Computadora {
    private String marca;
    private int numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;
    
    public Computadora(){
        
    }
    
    public Computadora(String marca, int numeroSerie, String modelo, String chipset){
     this.marca=marca;
     this.numeroSerie=numeroSerie;
     this.placaMadre=new PlacaMadre(modelo,chipset);
    }
    
    public void setPropietario(Propietario propietario){
        this.propietario=propietario;
        if(propietario!=null && propietario.getComputadora()!=this){
            propietario.setComputadora(this);
        }
    }
    
    public Propietario getPropietario(){
        return propietario;
    }
}
