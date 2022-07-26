
package partes;

/**
 *
 * @author Bryan
 */
public class Puerta extends Componentes{
    private int cantidad;
    private int idpuerta;
    private static int contadorpuerta;
    
    public Puerta(){
    }

    public Puerta(int cantidad, String proveedor, String tipo) {
        super(proveedor, tipo);
        this.idpuerta=Puerta.contadorpuerta++;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdpuerta() {
        return idpuerta;
    }

    @Override
    public String toString(){
    return "El Id puerta es:"+idpuerta+", una cantidad de:"+cantidad+", que provee:"+super.toString();
    }
    
}
