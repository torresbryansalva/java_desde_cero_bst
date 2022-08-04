
package clasesAbstractas;

/**
 *
 * @author Lenovo
 */
public class Rectangulo extends FiguraGeometrica {
    public Rectangulo(String tipoFigura){
    super(tipoFigura);
    }
    @Override
    public void dibujar(){
        System.out.println("Se imprimer un: "+this.getClass().getSimpleName());
    }
}
