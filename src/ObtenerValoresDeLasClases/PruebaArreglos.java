
package ObtenerValoresDeLasClases;

/**
 *
 * @author Bryan
 */
public class PruebaArreglos {
    private String nombre;

    public PruebaArreglos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "PruebaArreglos{" + "nombre=" + nombre + '}';
    }
    
}
