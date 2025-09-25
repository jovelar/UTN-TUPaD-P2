/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto8;

import java.time.LocalDate;

/**
 *
 * @author isaias Ovelar
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    
    public Documento(){
        
    }
    
    public Documento(String titulo, String contenido, int codigoHash, LocalDate fecha, Usuario usuario){
        this.titulo=titulo;
        this.contenido=contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }
}
