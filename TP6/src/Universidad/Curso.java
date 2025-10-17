/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;

/**
 *
 * @author isaia
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    public Curso(){
        
    }
    
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public Curso(String codigo, String nombre, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
public void setProfesor(Profesor p) {
    this.profesor = p;
    if (p != null && !p.getCursos().contains(this)) {
        p.agregarCurso(this);
    }
}
    
    public Profesor getProfesor(){
        return profesor;
    }
    
    public void mostrarInfo(){
        if(this.profesor==null){            
            System.out.println("COD: "+codigo+",CURSO: "+nombre+", PROFESOR: Sin Asignar! ");
        
        }else{
            
           System.out.println("COD: "+codigo+",CURSO: "+nombre+", PROFESOR: "+profesor.toString());
        }

    }
}
