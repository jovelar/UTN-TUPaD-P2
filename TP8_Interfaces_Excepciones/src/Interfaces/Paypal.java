/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Isaias
 */
public class Paypal implements PagoConDescuento{
    
    @Override
    public double aplicarDecuento(double costo) {
        return costo *0.8;
    }

    @Override
    public double procesarPago(double costo) {
        return aplicarDecuento(costo);
    }
    
}
