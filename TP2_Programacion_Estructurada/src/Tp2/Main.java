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
        float precioBase=scan.nextFloat();
        String opcion="x";
        do{
            System.out.println("Ingrese la clase de producto. A B C");
            opcion=scan.nextLine();
            if(!opcion.toUpperCase().equals("A") && !opcion.toUpperCase().equals("B") && !opcion.toUpperCase().equals("C"))
            {
                System.out.println("Opcion invalida");
            }
        }
        while(!opcion.toUpperCase().equals("A") && !opcion.toUpperCase().equals("B") && !opcion.toUpperCase().equals("C"));
        float precioFinal;
        int porcentajeDescuento;
        if(opcion.toUpperCase().equals("A"))
        {
            precioFinal=precioBase*(float)0.90;
            porcentajeDescuento=10;
        }
        else if(opcion.toUpperCase().equals("b"))
        {
            precioFinal=precioBase*(float)0.85;
            porcentajeDescuento=15;
        }
        else
        {
            precioFinal=precioBase*(float)0.8;
            porcentajeDescuento=20;
        }
        System.out.println("Precio Base: "+precioBase+"\n Porcentaje descuento: "+porcentajeDescuento+" \n Precio Final: "+precioFinal);
    }
    
    public static void punto5(Scanner scan)
    {
        int numero;
        int suma=0;
        do{
            System.out.println("Ingrese un numero (0 para salir): ");
            numero=scan.nextInt();
            if(numero%2==0)
            {
                suma+=numero;
            }
        }while(numero!=0);
        System.out.println("Suma: "+suma);
    }
    
    public static void punto6(Scanner scan)
    {
        int numero;
        int positivo=0;
        int negativo=0;
        int cero=0;
        
        for(int x=0;x<10;x++)
        {
            System.out.println("Ingrese un numero ("+(x+1)+"/10");
            numero=scan.nextInt();
            if(numero>0)
            {
                positivo++;
            }
            else if(numero<0)
            {
                negativo++;
            }
            else
            {
                cero++;
            }
        }
        System.out.println("Positivos: "+positivo+"\n Negativos: "+negativo+"\n Ceros: "+cero);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //punto1(scan);
        //punto2(scan);
        //punto3(scan);
        //punto4(scan);
        //punto5(scan);
        punto6(scan);
        
        scan.close();
    }
    
}
