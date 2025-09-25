/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto9;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author isaias Ovelar
 */
public class CitaMedica {
    private LocalDate fecha;
    private LocalTime hora;
    private Paciente paciente;
    private Profesional profesional;
    
    public CitaMedica(){
        
    }
    
    public CitaMedica(LocalDate fecha, LocalTime hora ){
        this.fecha=fecha;
        this.hora=hora;
    }
    
    public void setPaciente(Paciente paciente){
        this.paciente=paciente;
    }
    
    public void setProfesional(Profesional profesional){
        this.profesional=profesional;
    }
}
