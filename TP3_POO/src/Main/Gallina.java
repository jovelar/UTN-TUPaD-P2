 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Isaias
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina(){
        
    }
    
    public Gallina(int idGallina,int edad, int huevosPuestos){
        this.idGallina=idGallina;
        this.edad=edad;
        this.huevosPuestos=huevosPuestos;
    }

    public int getIdGallina() {
        return idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }    

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    public void ponerHuevo(int huevos){
        setHuevosPuestos(getHuevosPuestos()+huevos);
    }
    
    public void envejecer(int tiempoAnios){
        setEdad(getEdad()+tiempoAnios);
    }
    
    public void mostrarEstado(){
        System.out.println("ID: "+getIdGallina()+";Edad: "+getEdad()+";Huevos Puestos: "+getHuevosPuestos());
    }
}
