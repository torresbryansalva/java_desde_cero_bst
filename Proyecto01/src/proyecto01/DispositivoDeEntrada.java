
package proyecto01;

/**
 *
 * @author Bryan
 */
public class DispositivoDeEntrada {
    private String tipoEntrada;
    private String marca;
    
    public DispositivoDeEntrada(String tipoEntrada,String marca){
        this.tipoEntrada=tipoEntrada;
        this.marca=marca;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispositivoDeEntrada{");
        sb.append("tipoEntrada=").append(tipoEntrada);
        sb.append(", marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }
   
}
