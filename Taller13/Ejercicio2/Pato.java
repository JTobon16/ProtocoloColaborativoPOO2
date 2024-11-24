/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller13.Ejercicio2;

/**
 *
 * @author altoc
 */
public class Pato implements Nadador, Volador {
     
    
    // creo el metodo de nadar
    @Override
    public void nadar() {
        System.out.println("El pato esta nadando en el lago");
    }

    // creo el metodo de volar
    @Override
    public void volar() {
        System.out.println("El pato esta volando sobre el campo");
        }   
}