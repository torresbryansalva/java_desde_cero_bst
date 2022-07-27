
package sobreEscritura;

/**
 *
 * @author Bryan
 */
public class Empleado {
    protected String nombre;
    protected int sueldo;
    
    public Empleado(String nombre,int sueldo){
    this.nombre=nombre;
    this.sueldo=sueldo;
    }
    
    public String InfoEmpleado(){
    return "Nombre del empleado: "+this.nombre+" y el sueldo es: "+this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
