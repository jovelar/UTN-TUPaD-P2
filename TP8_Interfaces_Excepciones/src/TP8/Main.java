/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP8;

import Excepciones.EdadInvalidaException;
import Interfaces.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
        System.out.println("\n####### INTERFACES\n");
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
        
        
        //Punto 1
        System.out.println("####### PUNTO 1 EXCEPCIONES");
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
            
        //Punto 2
        System.out.println("\n####### PUNTO 2 EXCEPCIONES\n");
            s.nextLine();
            System.out.print("Ingrese un numero: ");
            String palabra=s.nextLine();
            
            int numero;
            
            try{
                numero=Integer.parseInt(palabra);
                System.out.println("El texto "+numero+" fue convertido a numero");
            }catch(NumberFormatException n){
                System.out.println("Error, no se puede convertir");
            }
        
        
        //Punto 3
        System.out.println("\n####### PUNTO 3 EXCEPCIONES\n");
        System.out.println("Ingrese el nombre del archivo a abrir: --MUPPETS.TXT--");
        String nArchivo=s.nextLine();
        FileReader fr=null;
        
        try{
            fr=new FileReader(nArchivo);
            int letra;
            
           while ((letra = fr.read()) != -1) {        
               System.out.println(letra);
            }
        }catch(FileNotFoundException f){
            System.out.println("ERROR, el archivo no existe");
        }catch(IOException e){
            System.out.println("hubo un error");
        }
        finally{
            
            try {
                if(fr!=null){
                    fr.close();
                }
            } catch (IOException ex) {
                System.getLogger(Main.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            
        }
        
        
        //Punto 4
        System.out.println("\n####### PUNTO 4 EXCEPCIONES\n");
        try{
            System.out.println("Ingrese una edad: ");
            int edad = s.nextInt();
                    if(edad<0){
                        throw new EdadInvalidaException("La edad no puede ser menor a 0");
            }
        }catch(EdadInvalidaException e){
            System.out.println(e.getMessage());
        }
        
        
        //Punto 5
        System.out.println("\n####### PUNTO 5 EXCEPCIONES\n");
        s.nextLine();
        System.out.println("Ingrese el nombre del archivo a abrir: --PLATEROYYO.TXT--");
        String nArchivo2=s.nextLine();
        FileReader fr2=null;
        
        try(BufferedReader br= new BufferedReader(new FileReader(nArchivo2))){
            String palabra2;
            while((palabra2=br.readLine())!=null){
                System.out.println(palabra2);
            }
        }catch(FileNotFoundException f){
            System.out.println("ERROR, el archivo no existe");
        }catch(IOException e){
            System.out.println("hubo un error");
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ejercicioPedidos();
        ejerciciosExcepciones(s);
        s.close();
    }
    
}
