/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller8.Ejercicio2;

/**
 *
 * @author altoc
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    
    
    public Persona (String nombre, String apellido, int edad){
        
        this.edad = edad;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    public void mostrarDetalles (){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
    }
}
