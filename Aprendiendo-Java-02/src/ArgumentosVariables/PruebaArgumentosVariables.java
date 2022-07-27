
package ArgumentosVariables;

/**
 *
 * @author Bryan
 */
public class PruebaArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2,3,3,4,4,5);
        variosParametros("Bryan", 2,5,9,3);
    }
    // no se especifica el numero de argumentos
    private static void variosParametros(String nombre,int... num){
        System.out.println("nombre="+nombre);
        imprimirNumeros(num);
    }
    
    private static void imprimirNumeros(int... numeros ){
        for (int i = 0; i <numeros.length; i++) {
            System.out.println("elemento:"+numeros[i]);
        }
    }
}
