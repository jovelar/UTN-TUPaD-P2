/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras_Geometricas;

/**
 *
 * @author Isaias
 */
public class Circulo extends Figura {
    private final double pi=3.14;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public void calcularArea(){
        double area=(pi*radio)*(pi*radio);
        System.out.println("El area del circulo "+super.toString()+" es de "+area);
    }
}
