
package partes;

/**
 *
 * @author Bryan
 */
public class Llanta extends Componentes{
    private int cantidad;
    private int idllanta;
    private static int contadorllanta;
    
    public Llanta(){
    }
    public Llanta(String proveedor,String tipo,int cantidad){
    super(proveedor,tipo);
    this.idllanta=Llanta.contadorllanta++;
    this.cantidad=cantidad;
    }
    public int getCantidad(){
    return cantidad;
    }
    public int getIdllanta(){
    return idllanta;
    }
    public void setCantidad(int cantidad){
    this.cantidad=cantidad;
    }
    
    @Override
    public String toString(){
    return "El Id llantas es:"+idllanta+", una cantidad de:"+cantidad+", que provee:"+super.toString();
    }
}
