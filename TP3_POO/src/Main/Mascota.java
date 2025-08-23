/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Isaias
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    public Mascota(){
        
    }
    
    public Mascota(String nombre, String especie, int edad){
        this.nombre=nombre;
        this.especie=especie;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        System.out.println(getNombre()+";"+getEspecie()+";"+getEdad());
    }
    
    public void cumplirAnios(int edad){
        setEdad(getEdad()+edad);
    }
                                 
}
