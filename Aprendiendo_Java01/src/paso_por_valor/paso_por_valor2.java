
package paso_por_valor;

/**
 *
 * @author bryan
 */
public class paso_por_valor2 {
    public static void main(String[] args) {
     float a=(float) 3.1416; 
     System.out.println("El valor de a es="+a);
     Provando(a);
    System.out.println("pero el valor original de a"+a);
    }
     public static void Provando(float b){
     System.out.println("el valor por paso de valor de a="+b);
      b=(float)3.3;
     System.out.println("podemos cambiar el valor de paso "+b); 
     }
}
