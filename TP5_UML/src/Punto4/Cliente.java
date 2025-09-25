/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto4;

/**
 *
 * @author Isaias Ovlear
 */
public class Cliente {
    private int dni;
    private String nombre;
    private TarjetaDeCredito tarjetaDeCredito;
    
    public Cliente(){
        
    }
    
    public Cliente(int dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
    }
    
    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito){
        this.tarjetaDeCredito=tarjetaDeCredito;
        if(tarjetaDeCredito!=null && tarjetaDeCredito.getCliente()!=this){
        tarjetaDeCredito.setCliente(this);
        }
    }
    
    public TarjetaDeCredito getTarjetaDeCredito(){
        return tarjetaDeCredito;
    }
}
