/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author isaias ovelar
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    List<Curso> cursos;
    
    public Profesor(){
        this.cursos=new ArrayList<>();
    }
    
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    
    
    public List<Curso>getCursos(){
        return cursos;
    }
    
    public void agregarCurso(Curso c){
        if(c!= null && !cursos.contains(c)){
            cursos.add(c);
            if(c.getProfesor() !=this){
                c.setProfesor(this);
            }
        }
    }
    
    public void eliminarCurso(Curso c){
        if(cursos.remove(c) && c.getProfesor()==this){
            c.setProfesor(null);
        }
    }
    
    public void listarCursos(){
        for(Curso c: cursos){
            c.mostrarInfo();
        }
    }
    
    public void mostrarInfo(){
        System.out.println("ID:"+id+",NOMBRE: "+nombre+",ESPECIALIDAD: "+especialidad);
    }
    
    @Override
    public String toString(){
        return("ID:"+id+",NOMBRE: "+nombre+",ESPECIALIDAD: "+especialidad);
    }
    
    
}
