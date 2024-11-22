
package Taller9.Ejercicio1;




public class Persona {
    
    private String nombre;
    private double salario;
    
    public Persona (String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
    }
    
    public void mostrarDetalles(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Salario: $"+salario+" pesos");
    }
}
