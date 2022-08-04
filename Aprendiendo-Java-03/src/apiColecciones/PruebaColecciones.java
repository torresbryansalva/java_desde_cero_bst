
package apiColecciones;

import java.util.*;

/**
 *
 * @author bryan
 */
public class PruebaColecciones {
    public static void main(String[] args) {
        List milista =new ArrayList();
        milista.add("Lunes");
        milista.add("Martes");
        milista.add("Miercoles");
        milista.add("Jueves");
        milista.add("Viernes");
        milista.add("Sabado");
        
//        for(Object elemento:milista){
//            System.out.println("elemento:"+elemento);
//        }
//        milista.forEach(elemento ->{
//            System.out.println("elemento"+elemento);
//        });
        
        Set miSet=new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        
     //   imprimir(miSet);
     
     
       Map mimapa=new HashMap();
       mimapa.put("valor1", "Juana");
       mimapa.put("valor2", "carlos");
       mimapa.put("valor3", 2);
       
       String elemento =(String) mimapa.get("valor1");
        System.out.println("elemento:"+elemento);
       
        imprimir(mimapa.keySet());
        imprimir(mimapa.values());
        
    }
    public static void imprimir(Collection coleccion){
        for(Object x:coleccion){
            System.out.println("elemento:"+x);
        }
    }
}
