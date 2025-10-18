/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP7;
import Vehiculos.*;
import Figuras_Geometricas.*;
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
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ejercicioVehiculos();
        
        ejercicioFiguras();
    }
    
}
