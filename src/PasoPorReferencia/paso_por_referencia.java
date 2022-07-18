
package PasoPorReferencia;
import clases.persona;

/**
 *
 * @author bryan
 */
public class paso_por_referencia {
    public static void main(String[] args) {
        persona persona1=new persona();
        persona1.setpersonanom("Angelica");
        System.out.println("el nombre del personal es="+persona1.getpersonanom());
        cambioValor(persona1);
        System.out.println("el nombre cambiado del personal es="+persona1.getpersonanom());
    }
    public static void cambioValor(persona persona2){
    persona2.setpersonanom("Bryan");
    }
}
