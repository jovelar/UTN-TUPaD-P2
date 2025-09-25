/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto14;

/**
 *
 * @author isaias Ovelar
 */
public class EditorVideo {
    public EditorVideo(){
        
    }
    
    public void exportar(String formato, Proyecto proyecto){
        Render render = new Render(formato);
        render.setProyecto(proyecto);
    }
}
