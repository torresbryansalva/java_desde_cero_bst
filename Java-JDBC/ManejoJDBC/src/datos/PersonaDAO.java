
package datos;

import domain.Persona;
import java.util.*;
import java.sql.*;

/**
 *
 * @author bryan
 */
public class PersonaDAO {
 private static final String SQL_SELECT="SELECT id_persona,nombre,apellido,email,telefono FROM persona";
 
 public List<Persona> seleccionar(){
     Connection conn=null;
     PreparedStatement stmt=null; // aca PreparedStatment es una interface 
     ResultSet rs =null;
     Persona persona=null;
     List<Persona> personas =new ArrayList<>();
     
     try{
        conn=Conexion.getConnection();
        stmt=conn.prepareStatement(SQL_SELECT); // es un metod de la interface PreparedStatemnt
        rs=stmt.executeQuery();
        while(rs.next()){
            int idPersona=rs.getInt("id_persona");
            String nombre=rs.getString("nombre");
            String apellido=rs.getString("apellido");
            String email=rs.getString("email");
            String telefono=rs.getString("telefono");
            
            persona=new Persona(idPersona,nombre,apellido,email,telefono);
            personas.add(persona);
        }
        
     }catch(SQLException ex){
     ex.printStackTrace(System.out);
     }
     finally{
         try{
             Conexion.close(rs);
             Conexion.close(stmt);
             Conexion.close(conn);
         }catch(SQLException ex){
         ex.printStackTrace(System.out);
         }
     }
     return personas;
    } 
 
}
