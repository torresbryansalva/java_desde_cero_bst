
package AutroboixingInboxing;

/**
 *
 * @author bryan
 */
public class PruebaAutoUnboxing {
    public static void main(String[] args) {
        //clases envolventes de tipos primitos
        /*
            int -Integer
            long- Long
            float- Float
            double- Double
        */
        Integer entero=10;
        System.out.println("entero ="+entero);
        System.out.println("entero ="+entero.toString());
        System.out.println("entero double ="+entero.doubleValue());
        
        int entero2=entero;
        System.out.println("entero2 "+entero2);
    }
}
