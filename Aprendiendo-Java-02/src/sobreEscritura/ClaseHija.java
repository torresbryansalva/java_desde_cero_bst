
package sobreEscritura;

/**
 *
 * @author bryan
 */
public class ClaseHija extends EmpleadoH{
    private String depa;
    
    public ClaseHija(String nombre, int sueldo,String depa){
    super(nombre,sueldo);
    this.depa=depa;
    }
    
    @Override
    public String InfoEmpleado(){
    return super.InfoEmpleado()+"y del departamento de "+this.depa;
    }
}
