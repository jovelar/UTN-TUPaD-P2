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
    private Pago medioDePago;
    private Notificable notificador;
    private String estadoPedido;

    public Pedido() {
        this.productos = new ArrayList<>();
        this.estadoPedido="pendiente";
    }
    
    public void agregarAPedido(Producto p){
        productos.add(p);
    }

    public void setFormaDePago(Pago formaDePago){
        this.medioDePago=formaDePago;
    }
    
    public void setNotficador(Notificable notificador){
        this.notificador=notificador;
    }
    
    public void cambiarEstado(String estado){
        this.estadoPedido=estado;
        System.out.println("ESTADO CAMBIO, ACTUAL: "+estado);
    }
    
    @Override
    public void calcularTotal() {
        double costoTotal=0;
        for(Producto p: productos){
            costoTotal+=p.getPrecio();
        }
        System.out.println("El costo total es de "+medioDePago.procesarPago(costoTotal));
    }
    
}
