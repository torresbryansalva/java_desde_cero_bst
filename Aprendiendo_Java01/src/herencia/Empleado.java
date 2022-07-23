
package herencia;

/**
 *
 * @author  bryan
 */
public class Empleado extends humano{

    private int idEmpleado;
    private double sueldo;
    private static int contador;
  
     public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado=Empleado.contador++;
        this.sueldo = sueldo;
    }   

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(" ").append(super.toString());
        sb.append(", sueldo=").append(this.sueldo);
        sb.append('}');
        return sb.toString();
    }

    
     
}
