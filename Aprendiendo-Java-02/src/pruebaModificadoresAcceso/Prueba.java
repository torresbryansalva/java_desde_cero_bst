
package pruebaModificadoresAcceso;

import modificadoresAccesopaquete1.Clase1;
import modificadoresAccesopaquete2.Clasehija1;

/**
 *
 * @author bryan
 */
public class Prueba {
    public static void main(String[] args) {
       // Clase1 clase1=new Clase1("publico");
//        System.out.println("clase1 ="+clase1.atributoprotected);
//        clase1.metodoPublico();
        Clasehija1 clasehija1=new Clasehija1();
        System.out.println("clase hija= "+clasehija1);
    }
    
           
        
}
