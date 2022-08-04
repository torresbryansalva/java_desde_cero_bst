
package accesodatos;

/**
 *
 * @author Lenovo
 */
public class ImplementacionMYSQL implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("insertar desde mysql");      
    }

    @Override
    public void listar() {
        System.out.println("listar desde mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar desde mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde mysql");
    }
    
}
