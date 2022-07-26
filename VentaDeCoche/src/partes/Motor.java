
package partes;

/**
 *
 * @author Lenovo
 */
public class Motor extends Componentes{
    private int cantidad;
    private int idmotor;
    private static int contadormotor;
    private String color;
    
    public Motor(){
    }

    public Motor(int cantidad, String color, String proveedor, String tipo) {
        super(proveedor, tipo);
        this.idmotor=Motor.contadormotor++;
        this.cantidad = cantidad;
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdmotor() {
        return idmotor;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString(){
    return "El Id motor es:"+idmotor+", una cantidad de:"+cantidad+", el color del coche es:"+color+", que provee:"+super.toString();
    }
    
}
