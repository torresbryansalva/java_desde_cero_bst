
package ContextoExtatico;

/**
 *
 * @author Bryan
 */
public class Carro {

   private String nombre;
   private int idCarro;
   private static int contador; // aqui el static se asocia con la clase y no con el ojebto
   
   public Carro(String nombre){
   this.nombre=nombre;
   // cada vez que creamos un obejto se incrementa autmaticamente el valor
   Carro.contador++;
   //hayq ue almacenar el valor obtenido
   this.idCarro=Carro.contador;
   }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }
    
    public static int getContador() {
        return contador;
    }

    public static void setContador(int aContador) {
        contador = aContador;
    }

    @Override
    public String toString() {
        return "Carro{" + "nombre=" + nombre + ", idCarro=" + idCarro + '}';
    }
    
}
