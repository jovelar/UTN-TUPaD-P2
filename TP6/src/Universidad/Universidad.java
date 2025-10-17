/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universidad;
import java.util.List;
import java.util.ArrayList;
import Universidad.*;
/**
 *
 * @author isaia
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    public Universidad(){
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public Universidad(String nombre){
        this.nombre=nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor p){
        if(!profesores.contains(p)){
            profesores.add(p);
        }
    }
    
    public void agregarCurso(Curso c){
        if(!cursos.contains(c)){
            cursos.add(c);
        }
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        
        int pos=0;
        Profesor prof=null;
        while(pos<profesores.size() && prof==null){
            profesores.get(pos).toString();
            if(profesores.get(pos).getId().equals(idProfesor)){
                prof=profesores.get(pos);
            }
            pos++;
        }
        
        pos=0;
        Curso cur=null;
        while(pos<cursos.size() && cur==null){
            if(cursos.get(pos).getCodigo().equals(codigoCurso)){
                cur=cursos.get(pos);
            }
            pos++;
        }
        
        if(cur!=null && prof!=null){
            cur.setProfesor(prof);
        }
        else if(cur==null && prof==null){
            System.out.println("No se encontro ni el curso ni el profesor");
        }
        else if(prof==null){
            System.out.println("No se encontro el profesor");
        }
        else{
            System.out.println("No se encontro el curso");
        }
    }
    
    public void listarProfesores(){
        for(Profesor p: profesores){
            p.mostrarInfo();
            p.listarCursos();
        }
    }
    
    public void listarCursos(){
        for(Curso c: cursos){
            c.mostrarInfo();
        }
    }
    
    public void buscarProfesorPorId(String id){
        
    }
    
    public void eliminarCurso(String codigo){
        
        int index=0;
        Curso cursoAEliminar=null;
        while(index<cursos.size() && cursoAEliminar==null){
            if(cursos.get(index).getCodigo().equals(codigo)){
                    cursoAEliminar=cursos.get(index);
            }
            index++;
        }
        
        if(cursoAEliminar!=null){
            cursoAEliminar.setProfesor(null);
            cursos.remove(cursoAEliminar);
        }
        
        
    }
    
    
}
