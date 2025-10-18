/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP7;
import Vehiculos.*;
import Figuras_Geometricas.*;
import Empleados.*;
import Animales.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Isaias Ovelar
 */
public class Main {

    public static void ejercicioVehiculos(){
        Auto auto1=new Auto(3,"FIAT", "Palio 98");
        auto1.mostrarInfo();
    }
    
    public static void ejercicioFiguras(){
        List<Figura>figuras = new ArrayList<>();
        figuras.add(new Circulo(9.9,"Circulo 1"));
        figuras.add(new Circulo(13.2, "Circulo 2"));
        figuras.add(new Rectangulo(12, 8, "Rectangulo 1"));
        figuras.add(new Rectangulo(88, 2, "Rectangulo 2"));
        
        for(Figura f:figuras){
            f.calcularArea();
        }
    }
    
    public static void ejercicioEmpleados(){
        List<Empleado>empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta(70000.00, 24, "Julio"));
        empleados.add(new EmpleadoTemporal(45000, 20, "Antonio"));
        empleados.add(new EmpleadoTemporal(35000, 15, "Alan"));
        empleados.add(new EmpleadoPlanta(70000.00, 24, "Miguel"));
        empleados.add(new EmpleadoPlanta(55000.00, 24, "Daniel"));
        empleados.add(new EmpleadoPlanta(85000.00, 24, "Mauricio"));
        empleados.add(new EmpleadoTemporal(35000, 15, "Miguel"));
        empleados.add(new EmpleadoTemporal(55000, 15, "Hector"));
        empleados.add(new EmpleadoPlanta(65000.00, 24, "Carla"));
        empleados.add(new EmpleadoPlanta(100000.00, 24, "Cesar"));
        empleados.add(new EmpleadoTemporal(45000, 10, "Marcelo"));
        empleados.add(new EmpleadoTemporal(35000, 15, "Roberto"));
        empleados.add(new EmpleadoTemporal(65000, 15, "Matias"));
        empleados.add(new EmpleadoPlanta(73000.00, 24, "Veronica"));
        
        
        
        System.out.println("Calculando primeros los sueldos de los empleados de planta permanente");
        for(Empleado p: empleados){
            if(p instanceof EmpleadoPlanta){
                p.calcularSueldo();
            }
        }
        
        System.out.println("\nCalculando ahora los sueldos de los empleados temporales");
        for(Empleado t: empleados){
            if(t instanceof EmpleadoTemporal){
                t.calcularSueldo();
            }
        }
        
    }
    
    public static void ejercicioAnimales(){
        List<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Perro color marron"));
        animales.add(new Gato("Gato marmolado"));
        animales.add(new Vaca("Vaca lechera"));
        
        for(Animal a: animales){
            a.describirAnimal();
            a.hacerSonido();
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ejercicioVehiculos();
        
        //ejercicioFiguras();
        
        //ejercicioEmpleados();
        
        ejercicioAnimales();
    }
    
}
