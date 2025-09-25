/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto6;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Isaias Ovelar
 */
public class Reserva {
    private LocalTime hora;
    private LocalDate fecha;
    private Cliente cliente;
    private Mesa mesa;
    
    public Reserva(){
        
    }
    
    public Reserva(LocalDate fecha, LocalTime hora, int numero, int capacidad){
        this.fecha=fecha;
        this.hora=hora;
        this.mesa=new Mesa(numero,capacidad);
    }
    
    public void setCliente(Cliente cliente){
        this.cliente=cliente;

    }
}
