
package Taller13.Ejercicio3;

/**
 *
 * @author altoc
 */
public class Carro implements Vehiculo{
    
    @Override
    public void acelerar() {
        System.out.println("El coche está arrancando.");
    }

    
    @Override
    public void frenar() {
        System.out.println("El coche se ha detenido.");
    }
    //
    
}
