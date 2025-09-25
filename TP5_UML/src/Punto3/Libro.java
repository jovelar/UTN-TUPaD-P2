package Punto3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Isaias
 */
public class Libro {
    private String titulo;
    private String ISBN;
    private Autor autor;
    private Editorial editorial;
     public Libro(){
         
     }
     
     public Libro(String titulo, String ISBN, Editorial editorial){
         this.titulo=titulo;
         this.ISBN=ISBN;
         this.editorial=editorial;
     }
     
     public void setAutor(Autor autor){
         this.autor=autor;
     }
}
