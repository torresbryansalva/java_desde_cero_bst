
package test;

import java.sql.*;

/**
 *
 * @author bryan
 */
public class Test {
    public static void main(String[] args){
      String url="jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";    
      try{
      // Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conexion=DriverManager.getConnection(url,"root","bryan1993");
          Statement instruccion =conexion.createStatement();
          String sql="SELECT id_persona,nombre,apellido,email,telefono FROM persona";
          ResultSet resultado=instruccion.executeQuery(sql);
          
          while(resultado.next()){
              System.out.print(" Id Persona: "+resultado.getInt("id_persona"));
              System.out.print(" Nombre: "+resultado.getNString("nombre"));
              System.out.print(" Apellido: "+resultado.getNString("apellido"));
              System.out.print(" Email: "+resultado.getNString("email"));
              System.out.print(" Telefono: "+resultado.getNString("telefono"));
              System.out.println("");
          }
          resultado.close();
          instruccion.close();
          conexion.close();
      }catch(SQLException ex){
      ex.printStackTrace(System.out);
      }
    }
}
