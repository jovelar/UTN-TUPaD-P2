/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_pooii;

/**
 *
 * @author isaia
 */

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    
    //Constructor por defecto
    public Empleado(){};
    
    public Empleado(int id, String nombre, String puesto, double salario, int totalEmpleados){
        this.id=id;
        this.nombre=nombre;
        this.puesto=puesto;
        this.salario=salario;
        this.totalEmpleados+= totalEmpleados;
    }
    
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id=id;
        this.nombre=nombre;
        this.puesto=puesto;
        this.salario=salario;
        this.totalEmpleados+=1;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }
    
    public int getCantidadEmpleados(){
        return totalEmpleados;
    }

    public double getSalario() {
        return salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Recibe porcentaje
    public void actualizarSalario(float porcentaje){
        setSalario(getSalario()*((porcentaje/100)+1));
    }
    
    //Recibe monto nominal
    public void actualizarSalario(double incremento){
        setSalario(getSalario()+incremento);
    }
    
    @Override
    public String toString(){
        return("ID:"+this.id+",Nombre: "+this.nombre+", Puesto:"+this.puesto+", Salario: "+this.salario);
    }
    
    public static void mostrarTotalEmpleados(Empleado empleado){
        System.out.println(empleado.getCantidadEmpleados());
    }
}
    
    
