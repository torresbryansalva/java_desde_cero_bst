
package partes;

/**
 *
 * @author Bryan
 */
public class Bloque {
    private String tipo;
    
    public Bloque(){
    }
    public Bloque(String tipo){
        this.tipo=tipo;
    }
    public String getTipo(){
    return this.tipo;
    }
    public void setTipo(String tipo){
    this.tipo=tipo;
    } 
}
