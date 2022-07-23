
package clases;

/**
 *
 * @author bryan
 */
public class persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    public void setpersonanom(String new_nombre){
    nombre=new_nombre;
    }
    public void setpersonap(String new_apellido){
    apellido=new_apellido;
    }
    public void setEdad(int new_edad){
    edad=new_edad;
    }
    public String getpersonanom(){
    return nombre;
    }
    public String getpersonap(){
    return apellido;
    }
    public int getedad(){
    return edad;
    }
}
