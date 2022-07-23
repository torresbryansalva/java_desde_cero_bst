
package ObtenerValoresDeLasClases;

/**
 *
 * @author Bryan
 */
public class PruebaArregloObejetos {
    public static void main(String[] args) {
       PruebaArreglos pa[]=new PruebaArreglos[2];
       pa[0]=new PruebaArreglos("Maria");
       pa[1]=new PruebaArreglos("Juan");
       
        System.out.println("perosna 0="+pa[0].getNombre());
        System.out.println("perosna 0="+pa[1].toString());
       for(int i=0;i<pa.length;i++){
           System.out.println("persona["+i+"]="+pa[i].getNombre());
       }
    }
}
