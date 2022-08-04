
package datos;

import Excepsiones.*;
import cuerpo.Pelicula;
import java.util.List;
/**
 *
 * @author Bryan
 */
public interface IAccesoDatos {
    boolean existe(String nombreRecurso) throws AccesoDatosEx;
    
    List<Pelicula>listar(String nombreRecurso) throws LecturaDatosEx;
    
    void escribir(Pelicula pelicula,String nombreRecurso,boolean anexar)throws EscrituraDatosEx;

    String buscar(String nombreRecurso,String buscar) throws LecturaDatosEx;
    
    void crear(String nombreRecurso) throws AccesoDatosEx;
    
    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
