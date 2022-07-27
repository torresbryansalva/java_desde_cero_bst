
package modificadoresAccesopaquete1;

/**
 *
 * @author bryan
 */
public class Clase1 {
   // public String atributoPublico="valor atributo publico";
    protected String atributoprotected="valor atributo protected";
//    public Clase1(){
//        System.out.println("Constructor Publico");   
//    }
//    public void metodoPublico(){
//        System.out.println("Metodo Publico");
//    }
    
    protected Clase1(){
        System.out.println("Constructor Protected");   
    }
    public Clase1(String arg){
        System.out.println("Constructor Publico");
    }
    protected void metodoProtected(){
        System.out.println("Metodo Protected");
    }
    
    
}
