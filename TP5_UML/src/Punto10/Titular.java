/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto10;

/**
 *
 * @author isaias Ovelar
 */
public class Titular {
    private String titular;
    private int DNI;
    private CuentaBancaria cuentaBancaria;
    
    public Titular(){
        
    }
    
    public Titular(String titular, int dni){
        this.DNI=dni;
        this.titular=titular;
    }
    
    public void setCuentaBancaria(CuentaBancaria cuentaBancaria){
        this.cuentaBancaria=cuentaBancaria;
        if(cuentaBancaria!=null && cuentaBancaria.getTitular()!=this){
            cuentaBancaria.setTitular(this);
        }
    }
    
    public CuentaBancaria getCuentaBancaria(){
        return cuentaBancaria;
    }
}
