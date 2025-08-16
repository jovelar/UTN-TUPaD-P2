/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author isaia
 */
public class HolaMundo {

    public static void punto2()
    {
        System.out.println("### Punto 2 ###");
        System.out.println("!Hola, Java!");
    }
    
    public static void punto3()
    {
        System.out.println("### Punto 3 ###");
        String nombre="Juan Lucas";
        int edad=38;
        double altura=1.73;
        boolean estudiante=true;
        
        System.out.println(nombre+" "+edad+" "+altura+" "+estudiante);
    }
    
    public static void punto4(Scanner scan)
    {
        System.out.println("### Punto 4 ###");
        System.out.println("Ingrese su nombre: ");
        String nombre=scan.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad=scan.nextInt();
        
        System.out.println("Nombre: "+nombre+", Edad: "+edad);
    }
    
    public static void punto5(Scanner scan)
    {
        System.out.println("### Punto 5 ###");
        System.out.println("Ingrese el primer numero: ");
        int numero1=scan.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numero2=scan.nextInt();
        
        System.out.println("Suma: "+(numero1+numero2));
        System.out.println("Resta: "+(numero1-numero2));
        System.out.println("Multiplicacion: "+(numero1*numero2));
        System.out.println("Division: "+(numero1/numero2));
    }
    
    public static void punto6(Scanner scan)
    {
        System.out.println("### Punto 6 ###");
        System.out.println("Nombre: Juan Perez \n Edad: 30 años \n Direccion: \"Calle Falsa 123\"");
    }
    /**
     * @param args the command line arguments
     */
    
    public static void punto7()
    {
        System.out.println("### Punto 7 ###");
        int x=10;
        x=x+5;
        System.out.println(x);
        
        //Lineas 1 y 2 contienen instrucciones
        
    }
    
    public static void punto8()
    {
        System.out.println("### Punto 8 ###");
        int numero1=10;
        int numero2=7;
        
        System.out.println(numero1/numero2);
        
        System.out.println((float)(numero1/numero2));
    }
    
    public static void punto9(Scanner scan)
    {
        System.out.println("### Punto 9 ###");
        System.out.println("Ingresa tu nombre: ");
        String nombre=scan.nextLine();
        System.out.println("Hola, "+nombre);
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        punto2();
       /*
        punto3();
        punto4(scan);
        punto5(scan);
        punto6(scan);
        punto7();
        punto8();
        scan.nextLine();
        punto9(scan);
        */
        
        scan.close();
    }
    
}
