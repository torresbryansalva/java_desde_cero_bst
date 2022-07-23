
package uso_return;

/**
 * el valor que recibe se puede modificar 
 * @author bryan
 */
public class usos_return {
    public static int Suma(int a,int b){
        int suma=a+b;
        return suma;
    }
    public static void main(String[] args) {
        int x=23;
        int y=13;
        System.out.println("la suma es "+Suma(x,y));
    }
}
