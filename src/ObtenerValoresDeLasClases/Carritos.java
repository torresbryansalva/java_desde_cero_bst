
package ObtenerValoresDeLasClases;
import ContextoExtatico.Carro;
/**
 *
 * @author Bryan
 */
public class Carritos {
    public static void main(String[] args) {
        Carro carro1=new Carro("Mercedes");
        System.out.println("El primer carro se llama: "+carro1.toString());
        Carro carro2=new Carro("Lamborgini");
        System.out.println("El segundo carro se llama: "+carro2);
    }
    
}
