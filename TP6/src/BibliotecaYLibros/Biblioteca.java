/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BibliotecaYLibros;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isaia
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    
    public Biblioteca(String nombre){
        this.libros = new ArrayList<>();
    }
    
    public Biblioteca(String nombre, List<Libro> libros) {
        this.libros = new ArrayList<>();
        this.nombre = nombre;
    }
    
    public void agregarLibro(String ISBN,String titulo,int anioPublicacion,Autor autor){
        libros.add(new Libro(ISBN,titulo,anioPublicacion,autor));
    }
    
    public void listarLibros(){
        for(Libro l:libros){
            l.mostrarInfo();
        }
    }
    
    public void buscarLibroPorISBN(String ISBN){
        for(Libro l: libros){
            if(l.getIsbn().equals(ISBN)){
                l.mostrarInfo();
            }
        }
    }
    
    public void eliminarLibro(String ISBN){
        for(int x=0; x<libros.size();x++){
            if(libros.get(x).getIsbn().equals(ISBN)){
                libros.remove(x);
            }
        }
    }
    
    public void obtenerCantidadLibros(){
        //Indices comienzan en 0, por eso se suma 1
        System.out.println("En la biblioteca hay "+(libros.size()+1)+" libros.");
    }
    
    public void filtrarLibrosPorAnio(int anio){
        for(Libro l:libros){
            if(l.getAnioPublicacion()==anio){
                l.mostrarInfo();
            }
        }
    }

    public void mostrarAutosresDisponibles(){
        List<String>autores=new ArrayList<>();
        for(int x =0; x<libros.size();x++){
            String nombreAutor=libros.get(x).getAutor().getNombre();
            if(!autores.contains(nombreAutor))
            {
                autores.add(nombreAutor);
            }
        }
        for(String s: autores){
            System.out.println(s);
        }
    }
}
