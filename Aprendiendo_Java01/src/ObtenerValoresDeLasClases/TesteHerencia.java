
package ObtenerValoresDeLasClases;
import herencia.Cliente;
import herencia.Empleado;
import java.util.Date;
/**
 *
 * @author bryan
 */
public class TesteHerencia {
    public static void main(String[] args) {
//        Empleado empleado1=new Empleado("Maria",400);
//        System.out.println("el empleado es:"+empleado1.toString());
Cliente cliente =new Cliente(new Date(),true,"Ana",'F',28,"luna llena");
        System.out.println("Cliente"+cliente);
    }
}
