
package claseObject;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + this.sueldo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.sueldo != other.sueldo) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
}

