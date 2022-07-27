
package bloquesdeinicializacion;

/**
 *
 * @author bryan
 */
public class Prueba {
    public static void main(String[] args) {
        Persona persona1=new Persona();
        System.out.println("el valor del id es: "+persona1.getIdpersona());
        System.out.println(persona1.toString());
        System.out.println(" ");
        Persona persona2=new Persona();
        System.out.println("el valor del id es:"+persona2.getIdpersona());
    }
}
