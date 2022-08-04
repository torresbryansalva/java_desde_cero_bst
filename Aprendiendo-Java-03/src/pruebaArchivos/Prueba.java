
package pruebaArchivos;

import static archivos.ManejoArchivos.*;

/**
 *
 * @author bryan
 */
public class Prueba {
    public static void main(String[] args) {
        var nombreArchivo="Prueba.txt";
        //crearArchivo(nombreArchivo);
//        escribirArchivo(nombreArchivo, "hola desde Java, estamos en el archivo");
//        anexarArchivos(nombreArchivo, "Adios" );
        leerArchivo(nombreArchivo);
    }
}
