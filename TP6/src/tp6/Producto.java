/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

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
    public void mostrarInfo(){
        System.out.println("ID: "+id+",NOMBRE: "+nombre+",PRECIO: "+precio+",CANTIDAD: "+", CATEGORIA: "+categoria.getDescripcion());
    }
    
    @Override
    public String toString(){
        return ("ID: "+id+",NOMBRE: "+nombre+",PRECIO: "+precio+",CANTIDAD: "+", CATEGORIA: "+categoria.getDescripcion());
    }
    
}
