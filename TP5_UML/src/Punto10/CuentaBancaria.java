/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto10;

import java.time.LocalDateTime;

/**
 *
 * @author isaias Ovelar
 */
public class CuentaBancaria {
    private int cbu;
    private float saldo;
    private Titular titular;
    private ClaveSeguridad claveSeguridad;
    
    public CuentaBancaria(){
        
    }
    
    public CuentaBancaria(int cbu, float saldo, String codigo, LocalDateTime ultimaModificacion){
        this.cbu=cbu;
        this.saldo=saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo,ultimaModificacion);
    }
    
    public void setTitular(Titular titular){
        this.titular=titular;
        if(titular!=null && titular.getCuentaBancaria()!=this){
            titular.setCuentaBancaria(this);
        }
    }
    
    public Titular getTitular(){
        return titular;
    }
}
