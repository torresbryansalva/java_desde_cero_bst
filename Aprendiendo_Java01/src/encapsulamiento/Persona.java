
package encapsulamiento;

/**
 *
 * @author bryan
 */
public class Persona {
    private String nombre;
    private double sueldo;
    private boolean ok;
    
    public Persona(String nombre,double sueldo, boolean ok){
    this.nombre=nombre;
    this.sueldo=sueldo;
    this.ok=ok;
    }
    
    public String getNombre(){// Recuperamos el nombre ya guardado
    return this.nombre;
    }
    public void setNombre(String nombre){ //ingresamos un nombre o modificamos
     this.nombre=nombre;
    }
    
    public double getSueldo(){
    return this.sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }
    
    public boolean isOk(){
    return this.ok;
    }
    public void setOk(boolean ok){
    this.ok=ok;
    }
    
    public String toString(){
    return "El nombre de la persona es "+this.nombre+
            " con sueldo "+this.sueldo+
            " y esta desempleado "+this.ok;
    }
}
