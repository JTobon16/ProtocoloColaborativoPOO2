/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller13.Ejercicio1;

/**
 *
 * @author altoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // Crear un objeto Rectangulo
        Rectangulo rectangulo = new Rectangulo(5, 10);
        System.out.println("area del rectangulo: " + rectangulo.calcularArea());

        // Crear un objeto Triangulo
        Triangulo triangulo = new Triangulo(4, 8);
        System.out.println("area del triangulo: " + triangulo.calcularArea());
    }
    
    
}
