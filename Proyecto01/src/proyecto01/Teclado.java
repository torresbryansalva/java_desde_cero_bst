
package proyecto01;

/**
 *
 * @author bryan
 */
public class Teclado extends DispositivoDeEntrada{
    private int idteclado;
    private static int contador;
    
    public Teclado(String tipo, String marca){
        super(tipo,marca);
        this.idteclado=Teclado.contador++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{");
        sb.append("idteclado=").append(idteclado);
        sb.append("--").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
