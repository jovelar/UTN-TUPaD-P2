/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP8;

import Interfaces.*;
import java.util.Scanner;
/**
 *
 * @author Isaias
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void ejercicioPedidos(){
        Pedido pedido= new Pedido();
        pedido.agregarAPedido(new Producto("12 Empanadas carne horno", 14400.00));
        pedido.agregarAPedido(new Producto("1 Muzza grande", 18000.00));
        pedido.agregarAPedido(new Producto("4 Cervezas litro", 20000.00));
        pedido.agregarAPedido(new Producto("1 Faina", 10000.00));
        pedido.agregarAPedido(new Producto("2 Coca cola 2l ", 7000.00));
        pedido.agregarAPedido(new Producto("6 empanadas jamon y queso", 6600.00));
        pedido.agregarAPedido(new Producto("1 Fernet 3/4", 12500.00));
        
        //Pago con tarjeta de credito
        pedido.setFormaDePago(new TarjetaCredito());
        pedido.calcularTotal();
        
        //Pago con paypal
        pedido.setFormaDePago(new Paypal());
        pedido.calcularTotal();
        
        Cliente c1= new Cliente("Pepe Argento");
        pedido.cambiarEstado("Enviado!");
        
    }
    public static void ejerciciosExcepciones(Scanner s){
            int n1;
            int n2;
            
            int resultado=0;
            
            System.out.println("Ingrese el primer numero entero: ");
            n1=s.nextInt();
            System.out.println("Ingrese el segundo numero entero: ");
            n2=s.nextInt();
            
            try{
                resultado=n1/n2;
                System.out.println("El resultado es "+resultado);
            }catch (ArithmeticException a){
                System.out.println("No se puede dividir por 0");
            }
            
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //ejercicioPedidos();
        ejerciciosExcepciones(s);
    }
    
}
