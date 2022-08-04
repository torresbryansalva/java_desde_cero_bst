
package pruebas;

import javabeans.Persona;

/**
 *
 * @author bryan
 */
public class pruebaJavaBeans {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.setNombre("juan");
        persona.setApellido("salva");
        System.out.println("persona nombre:"+persona.getNombre());
        System.out.println("Persona apellido:"+persona.getApellido());
    }
}
