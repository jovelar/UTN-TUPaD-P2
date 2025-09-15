/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_pooii;

/**
 *
 * @author isaia
 */
public class MAIN {
    /**
     * @param args the command line arguments
     */
    private static int idEmpleado=0;
    
    //Metodo para generar el ID de los empleados de forma automatica e autoincremental
    public static int generarID(){
        return ++idEmpleado;
    }
    //Metodo para mostrar todos los empleados mediante .toString()
    public static void mostrarEmpleados(Empleado[] empleados){
        for(Empleado empleado:empleados){
            System.out.println(empleado.toString());
        }
    }
    public static void main(String[] args) {
        int id=0;
        
        Empleado[] empleados={
          new Empleado(generarID(),"Pepe Argento","Vendedor",1200000),
          new Empleado(generarID(),"Moni Argento","RRHH",250000),
          new Empleado(generarID(),"Jesus Cristo","Consultor",1600000),
          new Empleado(generarID(),"Pablo Lampone","Logistica",1900000)
        };
        
        //Todos los elementos del arreglo almacenan el mismo valor, por lo cual es indiferente cual de ellos del arreglo se puede utilizar para
        //consultar el total de empleados
        System.out.println("Cantidad de empleados: ");
        Empleado.mostrarTotalEmpleados(empleados[0]);
        mostrarEmpleados(empleados);
        
        System.out.println("Ahora hacemos uso de los metodos y lo volvemos a mostrar para afirmar cambios");
        
        //Aumento en un 40%
        empleados[0].actualizarSalario(40);
        //Aumento nominal del salario en +350000
        empleados[1].actualizarSalario(350000);
        //Aumentos porcentual
        empleados[2].actualizarSalario(90);
        //Aumento nominal
        empleados[3].actualizarSalario(50000);
        
        mostrarEmpleados(empleados);
        
        
    }
}
