
package prueba;

import accesodatos.*;

/**
 *
 * @author bryan
 */
public class Prueba {
    public static void main(String[] args) {
        IAccesoDatos datos =new ImplementacionMYSQL();
        //datos.listar();
        //imprimir(datos);
        
        datos =new ImplementacionOracle();
        //datos.insertar();
        imprimir(datos);
        
    }
    
    public static void imprimir(IAccesoDatos datos){
    datos.listar();
    }
}
