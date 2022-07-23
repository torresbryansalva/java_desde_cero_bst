
package paso_por_valor;
import encapsulamiento.Persona;
/**
 *
 * @author bryan
 */
public class personitax {
    
    public static void main(String[] args) {
        Persona persona1 =new Persona("Bryan",1000,false);
        System.out.println("el nombre es:"+persona1.getNombre());
        persona1.setNombre("Jaime watson");
        System.out.println("el nuevo nombre es:"+persona1.getNombre());
        System.out.println("el sueldo es:"+persona1.getSueldo());
        System.out.println("esta despedido "+persona1.isOk());
        persona1.setOk(true);
        System.out.println("esta despedido :"+persona1.isOk());
        System.out.println("Datos Generales"+persona1.toString());
        
    }
}
