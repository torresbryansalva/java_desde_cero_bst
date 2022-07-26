
package compra;
import partes.*;
/**
 *
 * @author bryan
 */
public class Compra {
    public static void main(String[] args) {
       Llanta llanta1=new Llanta("Tesla","llantas",4); 
       Puerta puerta1=new Puerta(2,"Lamboguini","puertas");
       Motor motor1=new Motor(1,"Verde","Volvo","motor");
//        System.out.println(llanta1.toString());
//        System.out.println(puerta1.toString());
//        System.out.println(motor1.toString());
        
       Llanta llanta2=new Llanta("volvo","llantas",4); 
       Puerta puerta2=new Puerta(2,"Lambo","puertas");
       Motor motor2=new Motor(1,"plomo","Volvo","motor");
       
        Coche coche1=new Coche("Torres",llanta2,puerta2,motor2);
         Coche coche2=new Coche("Torres",llanta2,puerta2,motor2);
          Coche coche3=new Coche("Torres",llanta1,puerta2,motor1);
           Coche coche4=new Coche("Torres",llanta1,puerta1,motor2);
 //       System.out.println(coche1.toString());
 
        OrdenCompra orden1=new OrdenCompra();
        OrdenCompra orden2=new OrdenCompra();
        
 
        orden1.Agregar(coche1);
        orden1.Agregar(coche2);
        orden1.Agregar(coche3);
        orden1.Agregar(coche4);
        
        orden2.Agregar(coche1);
        orden2.Agregar(coche2);
        
        orden1.Mostrar();
        orden2.Mostrar();
    }
    
}
