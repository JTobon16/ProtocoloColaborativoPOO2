/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller9.Ejercicio1;



public class Empleado extends Persona{
    
    private String departamento;
    
    
 public Empleado (String nombre, double salario, String departamento){
     super(nombre, salario);
     this.departamento=departamento;
 }
 
    @Override
 public void mostrarDetalles(){
     super.mostrarDetalles();
     System.out.println("Departamento: "+departamento);
 }
    
}
