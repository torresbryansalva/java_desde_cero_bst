
package proyecto01;

/**
 *
 * @author bryan
 */
public class Raton extends DispositivoDeEntrada{
    private int idraton;
    private static int contador;
    
    public Raton(String tipo,String marca){
        super(tipo,marca);
        this.idraton=Raton.contador++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{");
        sb.append("idraton=").append(idraton);
        sb.append("--").append(super.toString());
        sb.append('}');
        return sb.toString();
    }


    
}
