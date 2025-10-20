/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author isaia
 */
public class Cliente implements Notificable{
        private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void notificarCambio(String mensaje){
        System.out.println("Mensaje pedido: "+mensaje);
    }        
}
