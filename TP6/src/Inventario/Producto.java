/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario;

import Inventario.CategoriaProducto;

/**
 *
 * @author isaias ovelar
 */
public class Producto {
    
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    
    public Producto(){
        
    }

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }
    
    
    
    public void mostrarInfo(){
        System.out.println("ID: "+id+",NOMBRE: "+nombre+",PRECIO: "+precio+",CANTIDAD: "+cantidad+", CATEGORIA: "+categoria.getDescripcion());
    }
    
    @Override
    public String toString(){
        return ("ID: "+id+",NOMBRE: "+nombre+",PRECIO: "+precio+",CANTIDAD: "+cantidad+", CATEGORIA: "+categoria.getDescripcion());
    }
    
}
