/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller13.Ejercicio1;

/**
 *
 * @author altoc
 */
public abstract class Figura {
    
        //metodo abstracto para las clases 
    public abstract double calcularArea();
    
    //metodo que me mostrara el area
    public void mostrarArea(){
        System.out.println("El area es: "+calcularArea());}
         
    
    
}
