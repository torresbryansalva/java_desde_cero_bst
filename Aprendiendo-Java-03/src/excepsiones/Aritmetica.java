
package excepsiones;

/**
 *
 * @author 
 */
public class Aritmetica {
    public static int division(int num,int deno) 
            throws OperacionExcepcion{
        if(deno==0){
        throw new OperacionExcepcion("Division entre cero");
        }
        return num/deno;
    }
}
