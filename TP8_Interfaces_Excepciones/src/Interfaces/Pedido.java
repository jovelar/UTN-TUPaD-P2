/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Isaias
 */
public class Pedido implements Pagable{
    private List<Producto>productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    @Override
    public void calcularTotal() {
        double costoTotal=0;
        for(Producto p: productos){
            costoTotal+=p.getPrecio();
        }
        System.out.println("El costo total es de "+costoTotal);
    }
    
}
