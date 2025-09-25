/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto8;

import java.time.LocalDate;

/**
 *
 * @author isaia Ovelar
 */
public class FirmaDigital {
    private int codigoHash;
    private LocalDate fecha;
    private Usuario usuario;
    
    public FirmaDigital(){
        
    }
    
    public FirmaDigital(int codigoHash,LocalDate fecha, Usuario usuario){
        this.codigoHash=codigoHash;
        this.fecha=fecha;
        this.usuario=usuario;
    }
}
