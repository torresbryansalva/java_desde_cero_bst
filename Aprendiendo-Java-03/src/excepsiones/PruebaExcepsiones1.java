
package excepsiones;

/**
 *
 * @author bryan
 */
public class PruebaExcepsiones1 {
    public static void main(String[] args) {
        int resultado=0;
        try{
        //resultado =10/0;
        resultado=Aritmetica.division(10,0);
        }catch(Exception e){
          //  e.printStackTrace(System.out);
            System.out.println("Error tipo:"+e.getMessage());
        }
        System.out.println("Resultado:"+resultado);
    }
    
}
