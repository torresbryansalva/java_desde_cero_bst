
package modificadoresAccesopaquete2;

import modificadoresAccesopaquete1.Clase1;

/**
 *
 * @author bryan
 */
public class Clasehija1 extends Clase1{
        
    public Clasehija1(){
    super();
    this.atributoprotected="Modificacion atributo protected";
        System.out.println("Atributo Protegido"+this.atributoprotected);
    this.metodoProtected();
    }
}
