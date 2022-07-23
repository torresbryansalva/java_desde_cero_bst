
package pruebita;

import proyecto01.Raton;
import proyecto01.Teclado;
import proyecto01.Pantalla;

/**
 *
 * @author Lenovo
 */
public class test {
    public static void main(String[] args) {
        Raton raton=new Raton("Raton","asus");
        Teclado teclado1= new Teclado("teclado","Raixor");
        Pantalla pantalla1=new Pantalla("Asus",1200);
        
//        System.out.println("El primer dispositivo es: "+raton.getTipoEntrada());
//        System.out.println("El primer dispositivo es: "+raton.getMarca());
//        System.out.println("El primer dispositivo es: "+raton.toString());
//        
//        System.out.println("El primer dispositivo es: "+teclado1.getTipoEntrada());
//        System.out.println("El primer dispositivo es: "+teclado1.getMarca());
//        System.out.println("El primer dispositivo es: "+teclado1.toString());
        System.out.println("El primer dispositivo es: "+pantalla1.getMarca());
        System.out.println("El primer dispositivo es: "+pantalla1.getTamano());
        System.out.println("El primer dispositivo es: "+pantalla1.toString());
        
        
    }
    
}
