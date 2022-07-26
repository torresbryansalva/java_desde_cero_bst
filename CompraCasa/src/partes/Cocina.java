
package partes;

/**
 *
 * @author Bryan
 */
public class Cocina extends Bloque{
    private int cantidad;
    public Cocina(){
    }

    public Cocina(int cantidad,String tipo) {
        super(tipo);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String infoCocina(){
    return ", consta de: "+cantidad+" "+super.getTipo();
    }
    
}
