
package Taller8.Ejercicio1;

public class Vehiculo {
    
    private String marca;
    private double velocidadMaxima;
    
    
    public Vehiculo(String marca, double velocidadMaxima){
        this.marca=marca;
        this.velocidadMaxima=velocidadMaxima;
    }
    
    public void mostrarInformacion (){
        System.out.println("Marca:  "+marca);
        System.out.println("Velocidad Maxima es de : "+velocidadMaxima+" kilometros por hora");
    
    }
}
