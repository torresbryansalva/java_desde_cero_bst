
package partes;

/**
 *
 * @author Bryan
 */
public class Dormitorio extends Bloque{
    private int cantidad;

    public Dormitorio() {
    }

    public Dormitorio(int cantidad, String tipo) {
        super(tipo);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    } 
    
    public String InfoDormitorio(){
    return "consta de: "+cantidad+" "+super.getTipo();
    }
  
}
