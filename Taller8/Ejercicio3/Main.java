
package Taller8.Ejercicio3;


public class Main {

    
    public static void main(String[] args) {
   
        
        Empleado empleado1 = new Empleado("Jonathan",1500000);
        Gerente gerente1 = new Gerente ("Andres", 3000000, "Finanzas");
        
        
    empleado1.mostrarDetalles();
        System.out.println("\n");
    gerente1.mostrarDetalles();
    
    }
    
 
}
