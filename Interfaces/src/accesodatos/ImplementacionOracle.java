
package accesodatos;

/**
 *
 * @author Lenovo
 */
public class ImplementacionOracle implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde oracle");
    }
    
}
