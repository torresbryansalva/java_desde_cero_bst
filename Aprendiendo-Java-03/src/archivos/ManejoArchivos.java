
package archivos;
import java.io.*;



/**
 *
 * @author bryan
 */
public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo) {
    File archivo =new File(nombreArchivo);
    try{
   PrintWriter salida =new PrintWriter(archivo);
   salida.close();
        System.out.println("Se creo el archivo");
    }catch(FileNotFoundException ex){
     ex.printStackTrace(System.out);
    }
    }
    
    public static void escribirArchivo(String nombreArchivo,String contenido){
     File archivo =new File(nombreArchivo);
    try{
   PrintWriter salida =new PrintWriter(archivo);
   salida.println(contenido);
   salida.close();
        System.out.println("Se ha escrito en el archivo");
    }catch(FileNotFoundException ex){
     ex.printStackTrace(System.out);
    }   
    }
    
    
    public static void anexarArchivos(String nombreArchivo, String contenido){
     File archivo =new File(nombreArchivo);
    try{
        PrintWriter salida =new PrintWriter(new FileWriter(archivo,true));
        salida.println(contenido);
        salida.close();
        System.out.println("Se anexo en el archivo");
    }catch(FileNotFoundException ex){
     ex.printStackTrace(System.out);
    }catch(IOException ex) {   
    ex.printStackTrace(System.out);
    }   
    }
    
    
    public static void leerArchivo(String nombreArchivo){
     File archivo =new File(nombreArchivo);
    try{
        BufferedReader entrada = new BufferedReader(new FileReader(archivo));
        var lectura =entrada.readLine();
        while(lectura !=null){
            System.out.println("lectura="+lectura);
            lectura=entrada.readLine();
        }
        entrada.close();
        System.out.println("Se leyo exitosamente");
    }catch(FileNotFoundException ex){
     ex.printStackTrace(System.out);
    }catch(IOException ex) {   
    ex.printStackTrace(System.out);
    }   
    }
    
    
}
