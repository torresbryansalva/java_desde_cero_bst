
package compracasa;
import partes.*;
/**
 *
 * @author Bryan
 */
public class CompraCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dormitorio dormitorio=new Dormitorio(3,"Domitorios");
        Baños baño=new Baños(2,"Baños");
        Cocina cocina=new Cocina(2,"Cocinas");
        Casa casa=new Casa(true,dormitorio,cocina,baño);
        System.out.println(casa.infoCasa());
//        System.out.println(dormitorio.InfoDormitorio());
//        System.out.println(baño.infoBaño());
//        System.out.println(cocina.infoCocina());
    }
    
}
