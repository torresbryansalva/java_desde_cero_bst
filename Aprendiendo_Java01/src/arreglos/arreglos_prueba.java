
package arreglos;

/**
 *
 * @author bryan
 */
public class arreglos_prueba {
    public static void main(String[] args) {
        int pesos[]=new int[4];
        pesos[0]=3;
        pesos[1]=5;
        pesos[2]=45;
        pesos[3]=32;
//        System.out.println("arreglo en la posicion "+pesos[0]);
  for(int i=0;i<pesos.length;i++){
      System.out.println("pesos["+i+"]= "+pesos[i]);
     }
  
       String arboles[]={"Caoba","Morata","Cedro","Pino"};
        for (int i = 0; i <arboles.length; i++) {
            System.out.println("Los arboles son["+i+"]="+arboles[i]);
        }
       
    }
}
