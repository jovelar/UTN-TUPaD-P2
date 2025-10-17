/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6;

import Inventario.*;
import BibliotecaYLibros.*;
import Universidad.*;
import java.util.ArrayList;

/**
 *
 * @author isaia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void parteInventario(){
        Inventario inventario=new Inventario(new ArrayList<>());
        
        System.out.println("########## Ejercicios de productos e inventario ##########\n");
        
        //Punto 1
        Producto prod1 = new Producto("1", "Papas Fritas", 3500.00, 10, CategoriaProducto.ALIMENTOS);
        Producto prod2 = new Producto("2","Galletitas saborizadas",2000.00,45,CategoriaProducto.ALIMENTOS);
        Producto prod3 = new Producto("3","Palitos salados",1500.00,200,CategoriaProducto.ALIMENTOS);
        Producto prod4 = new Producto("4","Mini balanza",35000.00,5,CategoriaProducto.ELECTRONICA);
        Producto prod5 = new Producto("5","Remera roja",10500.00,25,CategoriaProducto.ROPA);
        
        inventario.agregarProducto(prod1);
        inventario.agregarProducto(prod2);
        inventario.agregarProducto(prod3);
        inventario.agregarProducto(prod4);
        inventario.agregarProducto(prod5);
        
        //Punto 2
        System.out.println("Punto 2");
        inventario.listarProductos();
        
        //Punto 3
           System.out.println("\nPunto 3");
        Producto referencia = inventario.buscarProductoPorId("");
        if(referencia!=null){
            System.out.println(referencia.toString());
        }
        
        //Punto 4
           System.out.println("\nPunto 4");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        
        //Punto 5
        System.out.println("\nPunto 5");
        inventario.eliminarProducto("4");
        inventario.listarProductos();
        
        //Punto 6
        System.out.println("\nPunto 6");
        inventario.actualizarStock("4",1200);
        //inventario.listarProductos();
        
        //Punto 7
        System.out.println("\nPunto 7");
        inventario.mostrarStock();
        
        //Punto 8
        System.out.println("\nPunto 8");   
        inventario.obtenerProductoConMayorStock();
        
        //Punto 9
        System.out.println("\nPunto 9");   
        inventario.filtrarProductosPorPrecio(0.00,2500.00);
        
        //Punto 10
        System.out.println("\nPunto 10");   
        inventario.mostrarCategoriasDisponibles();
              
  
    }
    
    public static void parteLibros(){
        //Punto 1
        Biblioteca biblioteca = new Biblioteca("Manuel Belgrano");
        
        //Punto 2
        Autor autor1 = new Autor("1","Stephen King","Estadounidense");
        Autor autor2 = new Autor("2","Jorge Luis Borges","Argentino");
        Autor autor3 = new Autor("3","Julio Cortazar","Argentino");
        
        //Punto 3
        biblioteca.agregarLibro("00456A", "El Resplandor", 1977, autor1);
        biblioteca.agregarLibro("00457A", "IT", 1986, autor1);
        biblioteca.agregarLibro("00458A", "La larga marcha", 1974, autor1);
        biblioteca.agregarLibro("00459A", "Ficciones", 1974, autor2);
        biblioteca.agregarLibro("00460A", "Rayuela", 1963, autor3);
        
        //Punto 4
        System.out.println("\nPunto 4");
        biblioteca.listarLibros();
        
        //Punto 5
        System.out.println("\nPunto 5");
        biblioteca.buscarLibroPorISBN("00458A");
        
        //Punto 6
        System.out.println("\nPunto 6");
        biblioteca.filtrarLibrosPorAnio(1986);
        
        //Punto7
        System.out.println("\nPunto 7");
        biblioteca.eliminarLibro("00460A");
        biblioteca.listarLibros();
        
        //Punto8
        System.out.println("\nPunto 8");
        biblioteca.obtenerCantidadLibros();
        
        //Punto9
        System.out.println("\nPunto 9");
        biblioteca.mostrarAutosresDisponibles();
        
    }
    
    public static void parteUniversidad(){
        
        Universidad universidad = new Universidad("UTN");
        //Punto 1
        Profesor prof1 = new Profesor("P1", "Roberto Diaz", "Ingeniero en Sistemas");
        Profesor prof2 = new Profesor("P2", "Diana Marquez", "Economista");
        Profesor prof3 = new Profesor("P3","Felicia Desos", "Contadora");
        
        Curso curso1 = new Curso("C1","Programacion 1");
        Curso curso2 = new Curso("C2","Diseño de bases de datos");
        Curso curso3 = new Curso("C3","Microeconomia");
        Curso curso4 = new Curso("C4","Macroeconomia");
        Curso curso5 = new Curso("C5","Contabilidad");
        
        //Punto 2
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        
        //Punto 3
        universidad.asignarProfesorACurso("C1","P1");
        universidad.asignarProfesorACurso("C2","P1");
        universidad.asignarProfesorACurso("C3","P2");
        universidad.asignarProfesorACurso("C4","P2");
        universidad.asignarProfesorACurso("C5","P3");
        
        //Punto 4
        
        System.out.println("\nPunto 4 \n ***Cursos con sus profesores***");
        universidad.listarCursos();
        System.out.println("\n***Profesores con sus cursos***");
        universidad.listarProfesores();
        
        //Punto 5
        System.out.println("\nPunto 5");
        universidad.reAsignarProfesor("C1", "P3");
        universidad.listarCursos();
        
        //Punto 6
        System.out.println("\nPunto 6 \n eliminado el curso Contabilidad");
        universidad.eliminarCurso("C5");
        universidad.listarCursos();
        universidad.listarProfesores();
        
        //Punto 7
        System.out.println("\nPunto 7 \n eliminando profesor Diana Marquez");
        universidad.eliminarProfesor("P2");
        universidad.listarProfesores();
        System.out.println();
        universidad.listarCursos();
        
        //Punto 8
        System.out.println("\nPunto 8");
        universidad.reporteCursosXProfesor();
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        //parteInventario();
        
        //parteLibros();
        
        parteUniversidad();
    }
    
}
