/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Isaias
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    
    public NaveEspacial(){
    }
    
    public NaveEspacial(String nombre, int combustible){
        this.nombre=nombre;
        this.combustible=combustible;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    public boolean despegar(){
        boolean estado=true;
        if(combustible<=0)
        {
            estado=false;
        }
        return estado;
    }
    
    /**
     * Mueve la nave, consume 25 de combustible cada vez que avanza
     * 
     */
    public void avanzar(){
        if(despegar() && getCombustible()>=25){
            System.out.println("Avanzando!");
            setCombustible(getCombustible()-25);
        }
        else{
            System.out.println("No se puede avanzar debido a que no se pudo despegar, por que no hay combustible!. Debe recarar");
        }
    }
    
    public void recargar(int combustible){
        if((getCombustible()+combustible)>50){
            setCombustible(50);
            System.out.println("Solo se lleno hasta 50 unidades, tanque lleno al maximo");
        }
        else{
            setCombustible(getCombustible()+combustible);
            System.out.println("Se recargo "+combustible+" unidades. Capacidad total: "+getCombustible());
        }
    }
}
