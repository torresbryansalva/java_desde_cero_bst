
package presentacion;

import java.util.Scanner;
import servicio.*;

/**
 *
 * @author bryan
 */
public class CatalogoPresentacion {
    public static void main(String[] args) {
        var opcion=-1;
        var scanner=new Scanner(System.in);
        ICatalogoPeliculas catalogo=new CatalogoPeliculasImpl();
        
        while(opcion !=0){
            System.out.println("Elige una opcion: \n"
                    + "1. Iniciar catalogo peliculas\n"
                    + "2. Agregar pelicula\n"
                    + "3. Listar peliculas\n"
                    + "4. Buscar pelicula\n"
                    + "0. Salir");
            opcion=Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la pelicula");
                    var nombrePelicula =scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce una pelicula a buscar");
                    var buscar =scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;    
                default:
                    System.out.println("Opcion no Valida");
            }
            
        }
    }
}
