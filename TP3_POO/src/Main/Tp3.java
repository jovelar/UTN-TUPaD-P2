/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import Main.Estudiante;
import Main.Mascota;
import Main.Libro;
import Main.Gallina;
import Main.NaveEspacial;
/**
 *
 * @author Isaias
 */
public class Tp3 {
    
    public static void ejercicio1(){
        System.out.println("### EJERCICIO 1 ###");
        Estudiante nuevoEstudiante= new Estudiante("Argento", "pepe", "5A", 7);
        nuevoEstudiante.mostrarInfo();
        nuevoEstudiante.subirCalifiacion(3);
        nuevoEstudiante.bajarCalificacion(5);
        
        //Mostramos nuevamante los datos para comprobar que la nota cambio
        
        nuevoEstudiante.mostrarInfo();
    }
    
    public static void ejercicio2(){
        System.out.println("\n### EJERCICIO 2 ###");
        Mascota tobi=new Mascota("Tobi", "Ovejero Aleman", 4);
        tobi.mostrarInfo();
        tobi.cumplirAnios(2);
        tobi.mostrarInfo();
    }
    
    public static void ejercicio3(){
        System.out.println("\n### EJERCICIO 3 ###");
        Libro nuevoLibro = new Libro("El principito", "Jesus", 1994);
        System.out.println(nuevoLibro.getTitulo()+";"+nuevoLibro.getAutor()+";"+nuevoLibro.getAnioPublicacion());
        
        //Intentamos cambiar por un año invalido, luego mostramos para indicar que no cambio
        nuevoLibro.setAnioPublicacion(-1400);
        System.out.println(nuevoLibro.getTitulo()+";"+nuevoLibro.getAutor()+";"+nuevoLibro.getAnioPublicacion());
        
        nuevoLibro.setAnioPublicacion(2072);
        System.out.println(nuevoLibro.getTitulo()+";"+nuevoLibro.getAutor()+";"+nuevoLibro.getAnioPublicacion());
        
        //Intentamos con un año valido
        nuevoLibro.setAnioPublicacion(1998);
        System.out.println(nuevoLibro.getTitulo()+";"+nuevoLibro.getAutor()+";"+nuevoLibro.getAnioPublicacion());
        
    }
    
    
    public static void ejercicio4(){
        System.out.println("\n### EJERCICIO 4 ###");
        Gallina turuleca = new Gallina(7, 1, 40);
        Gallina deOro = new Gallina(8, 2, 500);
        
        turuleca.mostrarEstado();
        deOro.mostrarEstado();
        
        turuleca.envejecer(4);
        turuleca.ponerHuevo(1500);
        
        deOro.envejecer(2);
        deOro.ponerHuevo(750);
        
        turuleca.mostrarEstado();
        deOro.mostrarEstado();
    }
    
    public static void ejercicio5(){
        System.out.println("\n### EJERCICIO 4 ###");
        System.out.println("NOTA: La nave consume 25 unidades en cada avanze");
        NaveEspacial planetExpress = new NaveEspacial("Planet Express",50);
        planetExpress.avanzar();
        planetExpress.avanzar();
        planetExpress.avanzar();
        
        planetExpress.recargar(10);
        
        planetExpress.avanzar();
        
        planetExpress.recargar(40);
        
        planetExpress.avanzar();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }
    
}
