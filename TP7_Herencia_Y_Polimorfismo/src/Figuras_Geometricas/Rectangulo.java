/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras_Geometricas;

/**
 *
 * @author Isaias
 */
public class Rectangulo extends Figura {
    private double base;
    private int altura;

    public Rectangulo(double base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(double base, int altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea(){
        System.out.println("El area del rectangulo "+super.toString()+" es de " +base*altura);
    }
    
}
