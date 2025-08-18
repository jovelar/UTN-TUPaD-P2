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
    
    //Variable del punto 10
    public static double variableGlobal = 0.10;
    
    
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
        System.out.println("### Punto 4 ###");
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
        System.out.println("### Punto 5 ###");
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
        System.out.println("### Punto 6 ###");
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
    
    public static void punto7(Scanner scan)
    {
        System.out.println("### Punto 7 ###");
        int numero=0;
        do{
            System.out.println("Ingrese un numero comprendido entre 0 y 10: ");
            numero=scan.nextInt();
            if(numero<0 || numero>10)
            {
                System.out.println("Numero Invalido");
            }
        }while(numero<0 || numero >10);
    }
    
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento)
    {
        double precioFinal=0;
        precioFinal=(precioBase*(1-(descuento/100))+(precioBase*(impuesto/100)));
        return precioFinal;
    }
    
    public static void punto8(Scanner scan)
    {
        System.out.println("### Punto 8 ###");
        double precioFinal;
        System.out.println("Ingrese el precio base del producto: ");
        double precio=scan.nextDouble();
        System.out.println("Ingrese el impuesto en porcentaje: ");
        double impuesto=scan.nextDouble();
        System.out.println("Ingrese el descuento en porcentaje: ");
        double descuento=scan.nextDouble();
        precioFinal=calcularPrecioFinal(precio,impuesto, descuento);
        System.out.println("El precio final es de "+precioFinal);
    }
    
    public static double calcularCostoEnvio(double peso, String zona){
        double costo=0;
        
        if(zona.toUpperCase().equals("NACIONAL")){
            costo=peso*5;
        }
        else{
            costo=peso*10;
        }
        return costo;
    }
    
    public static double calcularTotalCompra(double precioProducto,double costoEnvio){
        double costoTotal=precioProducto + costoEnvio;
        return costoTotal;
    }
    
    public static void punto9(Scanner scan)
    {
        System.out.println("### Punto 9 ###");
        double precioFinal=0;
        System.out.println("Ingrese el precio del producto: ");
        double precio=scan.nextDouble();
        System.out.println("Ingrese el peso del paquete en Kilos: ");
        double peso=scan.nextDouble();
        scan.nextLine();
        System.out.println("Ingrese la zona de envio Nacional/Internacional: ");
        String zona=scan.nextLine();
        
        precioFinal=calcularTotalCompra(precio,calcularCostoEnvio(peso, zona));
        
        System.out.println("El costo del envio es de "+calcularCostoEnvio(peso, zona));
        System.out.println("El precio final es de :"+precioFinal);
    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock=0;
        nuevoStock=stockActual-cantidadVendida+cantidadRecibida;
        return nuevoStock;
    }
    
    public static void punto10(Scanner scan)
    {
        System.out.println("### Punto 10 ###");
        System.out.println("Ingrese el stock actual del producto: ");
        int stockActual=scan.nextInt();
        
        System.out.println("Ingrese la cantidad vendida: ");
        int cantidadVendida=scan.nextInt();
        
        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida=scan.nextInt();
        
        int nuevoStock=actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: "+nuevoStock);
    }
    
    public static void calcularDescuentoEspecial(double precio){
        
        double descuentoAplicado=precio*variableGlobal;
        System.out.println("El descuento especial aplicado es: "+descuentoAplicado);
        System.out.println("El precio final con descuento es "+(precio*(1-variableGlobal)));
    }
    
    public static void punto11(Scanner scan){
        System.out.println("### Punto 11 ###");
        System.out.println("Ingrese el precio: ");
        double precio=scan.nextDouble();
        calcularDescuentoEspecial(precio);
    }
    
    public static void punto12(){
        System.out.println("### Punto 12 ###");
        //A- Declarando arreglo.
        double[] precios={199.99,299.5,149.75,399.0,89.99};
        
        //B- Mostrando los valores originales
        System.out.println("Precios originales: ");
        for(double precio:precios)
        {
            System.out.println("Precio $"+precio);
        }
        
        //C- Modificando un precio
        precios[2]=129.99;
        
        //D- Mostrando la lista modificada
        System.out.println("Precios modificados: ");
        for(double precio:precios)
        {
            System.out.println("Precio $"+precio);
        }
    }
    
    public static void mostrarRecursivo(double precios[], int posicion){
        if(posicion<precios.length)
        {
            System.out.println("Precio: "+precios[posicion]);
            posicion++;
            mostrarRecursivo(precios,posicion);
        }
    }
    public static void punto13(){
        System.out.println("### Punto 13 ###");
        //A- Declarando arreglo.
        double[] precios={199.99,299.5,149.75,399.0,89.99};
        
        //B- Mostrando los valores originales
        mostrarRecursivo(precios, 0);
        
        //C- Modificando un precio
        precios[2]=129.99;
        
        //D- Mostrando la lista modificada
        System.out.println("Precios modificados: ");
        mostrarRecursivo(precios, 0);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        punto1(scan);
        punto2(scan);
        punto3(scan);
        punto4(scan);
        punto5(scan);
        punto6(scan);
        punto7(scan);
        punto8(scan);
        punto9(scan);
        punto10(scan);
        punto11(scan);
        punto12();
        punto13();
        scan.close();
    }
    
}
