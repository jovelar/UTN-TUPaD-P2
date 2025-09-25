/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto13;

/**
 *
 * @author isaia
 */
public class GeneradorQR {
    
    public GeneradorQR(){
        
    }
    
    public void generar(String valor, Usuario usuario){
        CodigoQR codigoNuevo = new CodigoQR(valor);
        codigoNuevo.setUsuario(usuario);
    }
    
}
