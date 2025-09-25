package Punto4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Isaias Ovelar
 */
public class TarjetaDeCredito {
    private int numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;
    
    public TarjetaDeCredito(){
        
    }
    
    public TarjetaDeCredito(int numero, String fechaVencimiento, Banco banco){
        this.numero=numero;
        this.fechaVencimiento=fechaVencimiento;
        this.banco=banco;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
        if(cliente!=null && cliente.getTarjetaDeCredito()!=this){
            cliente.setTarjetaDeCredito(this);
        }
    }
    
    public Cliente getCliente(){
        return cliente;
    }
}
