
package partes;

/**
 *
 * @author Bryan
 */
public class Baños extends Bloque{
    private int cantidad;

    public Baños() {
    }

    public Baños(int cantidad, String tipo) {
        super(tipo);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String infoBaño(){
    return ", consta de: "+cantidad+" "+super.getTipo();
    }
}
