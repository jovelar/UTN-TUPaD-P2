/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tp2;
import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class Main {
    
    public static boolean validaBisiesto(int anio)
    {
        boolean bisiesto=false;
        if((anio%4==0 && anio%100!=0)||(anio%400==0))
        {
            bisiesto=true;
        }
        
        return bisiesto;
    }
    
    public static void punto1(Scanner scan)
    {
        System.out.println("### Punto 1 ###");
        System.out.println("Ingrese el anio: ");
        int anio=scan.nextInt();
        if(validaBisiesto(anio))
        {
            System.out.println("Es bisiesto");
        }
        else
        {
            System.out.println("No es bisiesto");
        }
    }
    
    public static void punto2(Scanner scan)
    {
        System.out.println("### Punto 2 ###");
       System.out.println("Ingrese el primer numero: ");
       int numero=scan.nextInt();
       int mayor=numero;
       
       System.out.println("Ingrese el segundo numero");
       numero=scan.nextInt();
       if(numero>mayor)
       {
           mayor=numero;
       }
       System.out.println("Ingrese el tercer numero: ");
       numero=scan.nextInt();
       if(numero>mayor)
       {
           mayor=numero;
       }
       
       System.out.println("El mayor es "+mayor);
    }
    
    public static void punto3(Scanner scan)
    {
        System.out.println("### Punto 3 ###");
        System.out.println("Ingrese su edad: ");
        int edad=scan.nextInt();
        if(edad>=60)
        {
            System.out.println("Adulto mayor");
        }
        else if(edad>=18 && edad<=59)
        {
            System.out.println("Adulto");
        }
        else if(edad>=12 && edad<=17)
        {
            System.out.println("Adolescente");
        }
        else
        {
            System.out.println("Niño");
        }
    }
    
    public static void punto4(Scanner scan)
    {
        System.out.println("### Punto 1 ###");
        System.out.println("Ingrese el precio del producto: ");
        String opcion="x";
        do{
            try{
                System.out.println("Ingrese la clase de producto. A B C");
                opcion=scan.nextLine();
            }
            catch(Exception e)
            {
                System.out.println("Opcion invalida, solo A B C");
            }
        }
        while(!opcion.equals("a") && !opcion.equals("b") && !opcion.equals("c"));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //punto1(scan);
        //punto2(scan);
        //punto3(scan);
        punto4(scan);
        
        scan.close();
    }
    
}
