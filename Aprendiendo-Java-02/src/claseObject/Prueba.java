
package claseObject;



/**
 *
 * @author bryan
 */
public class Prueba {
    public static void main(String[] args) {
    Empleado empleado1=new Empleado("juan",1200);
    Empleado empleado2=new Empleado("juan",1200);
    Empleado empleado3=new Empleado("Bryan",2233);
    
    if (empleado1==empleado2){
        System.out.println("tienen la misma referencia en memoria");    
    }
    else{
        System.out.println("No tienen la misma referencia en memoria");
    }
    
        if (empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales en contenido");
        }
        else{
            System.out.println("Los objetos no son iguales en contenido");
        }
        
        
     if (empleado1.hashCode()==empleado2.hashCode()){
         System.out.println("el valor hashcode es igual");
     }else{
         System.out.println("el valor hashcode es distinto");
     }
    }
}
