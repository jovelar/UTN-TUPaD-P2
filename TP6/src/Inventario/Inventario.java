/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario;
import Inventario.CategoriaProducto;
import java.util.ArrayList;



/**
 *
 * @author isaia
 */
public class Inventario {
    private ArrayList<Producto>productos;

    public Inventario(){
        
    }
    
    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public void listarProductos(){
        for(Producto p:productos){
            p.mostrarInfo();
        }
    }
    
    public void eliminarProducto(String id){
         for(Producto p: productos ){
             if(p.getId().equals(id)){
                 productos.remove(p);
             }
         }
    }
    
    public void actualizarStock(String id, int nuevaCantidad){
        for(Producto p: productos){
            if(p.getId().equals(id))
            {
                p.setCantidad(nuevaCantidad);
            }
        }
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria){
        for(Producto p:productos){
            if(p.getCategoria().equals(categoria)){
                System.out.println(p.toString());
            }
        }
    }
    
    public void mostrarStock(){
        int stock=0;
        for(Producto p: productos){
            stock+=p.getCantidad();
        }
        
        System.out.println("El stock total es de "+stock);
    }
    
    public void obtenerProductoConMayorStock(){
        Producto mayor=new Producto();
        for(Producto p: productos){
            if(p.getCantidad()>mayor.getCantidad()){
                mayor=p;
            }
        }
        System.out.println("El producto con mayor stock es "+mayor.toString());
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        for(Producto p: productos){
            if(p.getPrecio()>=min && p.getPrecio()<=max){
                productosFiltrados.add(p);
            }
        }
        return productosFiltrados;
    }
    
    public void mostrarCategoriasDisponibles(){
        CategoriaProducto categorias[]= CategoriaProducto.values();
        for(CategoriaProducto cat: categorias){
            System.out.println(cat.toString());
        }
    }
}
