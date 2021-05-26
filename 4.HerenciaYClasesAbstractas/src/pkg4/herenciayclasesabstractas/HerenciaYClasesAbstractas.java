/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.herenciayclasesabstractas;

/**
 *
 * @author alex
 */
public class HerenciaYClasesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleados[] = new Empleado[4];
        EAsalariado asal1 = new EAsalariado("569587A", "Javier", "Gomez", 2015, 1225);
        empleados[0] = asal1;
        
        EComision ecom1 = new EComision("695235B", "Eva", "Nieto", 2010, 179, 8.10);
        empleados[1] = ecom1;
        
        EComision ecom2 = new EComision();                
        ecom2.setDni("741258C");
        ecom2.setNombre("José");
        ecom2.setApellidos("Ruiz");
        ecom2.setYearIngreso(2012);
        ecom2.setClientesCaptados(81);
        ecom2.setMontoPorCliente(7.90);
        empleados[2] = ecom2;
        
        EAsalariado asal2 = new EAsalariado();
        asal2.setDni("896325D");
        asal2.setNombre("Maria");
        asal2.setApellidos("Nuñez");
        asal2.setYearIngreso(2013);
        asal2.setSalarioBase(1155);
        empleados[3] = asal2;
        sueldoMayor(empleados);
        mostrarTodos(empleados);
    }
    
    public static void sueldoMayor(Empleado empleados[]){
        int empMayor = 0; double salarioMayor = 0;
        for (int i = 0; i < empleados.length; i++){
            try{
                if (empleados[i].obtenerSalario() > salarioMayor){
                    empMayor = i;
                    salarioMayor = empleados[i].obtenerSalario();
                }
            }catch(Exception e){
                System.out.print(empleados[i].getNombre() + " " + empleados[i].getApellidos() + ": ");
                System.out.println(e.getMessage());
            }
        }
        System.out.printf("\nEl empleado con mayor salario es " 
                + empleados[empMayor].getNombre()+" "+empleados[empMayor].getApellidos() + 
                " con salario %.2f\n", salarioMayor);
        System.out.println();
    }
    
    public static void mostrarTodos(Empleado empleados[]){
        System.out.println("___Todos los empleados:____\n");
        for (int i = 0; i < empleados.length; i++){
            empleados[i].imprimir();            
        }
    }
    
}
