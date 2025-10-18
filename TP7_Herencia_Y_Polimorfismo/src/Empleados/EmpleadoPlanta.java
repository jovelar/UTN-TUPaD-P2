/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author isaia
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoDiario;
    private int diasTrabajados;
    private String nombre;

    public EmpleadoPlanta(double sueldoDiario, int diasTrabajados, String nombre) {
        this.sueldoDiario = sueldoDiario;
        this.diasTrabajados = diasTrabajados;
        this.nombre = nombre;
    }
    
    public void calcularSueldo(){
        System.out.println("NOMBRE: "+nombre+", DIAS TRABAJADOS: "+diasTrabajados+"SUELDO: "+diasTrabajados*sueldoDiario+" |PLANTA|");
    }
}
