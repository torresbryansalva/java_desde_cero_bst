
package ObtenerValoresDeLasClases;

/**
 *
 * @author Bryan Salva
 */
public class PruebaMatriz {
    public static void main(String[] args) {
        // creando  nueva matriz con objetos
        PruebaArreglos pm[][]=new PruebaArreglos[2][2];
        pm[0][0]=new PruebaArreglos("Bryan");
        pm[0][1]=new PruebaArreglos("Sharon");
        pm[1][0]=new PruebaArreglos("Lessli");
        pm[1][1]=new PruebaArreglos("Jaime");
        //System.out.println("haber="+pm.length);
        
       imprimir(pm);
    }

    private static void imprimir(PruebaArreglos[][] arreglo) {
        for (int i = 0; i<arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                System.out.println("el valor de los elementos son["+i+"]["+j+"]="+arreglo[i][j].getNombre());
            }
        }
    }
}
