
package Taller9.Ejercicio2;


public class Pez extends Animal{
    
    String tipoDeAgua;

   
    public Pez(String especie, String tipoDeAgua) {
       
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }

    
    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); 
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}
