/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Isaias
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;
    
    
    //Constructor vacio para que sea flexible a la hora de instanciar la clase
    public Estudiante(){
    }
    
    public Estudiante(String apellido, String nombre, String curso, int calificacion){
        this.apellido=apellido;
        this.nombre=nombre;
        this.curso=curso;
        this.calificacion=calificacion;
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCurso() {
        return curso;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
    public void mostrarInfo()
    {
        System.out.println(getApellido()+ ";" +getNombre()+ ";"+getCurso()+";"+getCalificacion());
    }
    
    public void subirCalifiacion(int puntos){
        setCalificacion(getCalificacion()+puntos);
    }
    
    public void bajarCalificacion(int puntos){
        if(puntos>getCalificacion())
        {
            setCalificacion(0);
        }
        else{
            setCalificacion(getCalificacion()-puntos);
        }
    }
}
