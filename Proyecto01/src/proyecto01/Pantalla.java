
package proyecto01;

/**
 *
 * @author bryan
 */
public class Pantalla {
    private int idpantalla;
    private String marca;
    private double tamano;
    protected static int contador;
    
    public Pantalla(){
    }
    
    public Pantalla(String marca,double tamano){
    this.idpantalla=Pantalla.contador++;
    this.marca=marca;
    this.tamano=tamano;
    }

    public int getIdpantalla() {
        return idpantalla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Pantalla{");
        sb.append("idpantalla=").append(this.idpantalla);
        sb.append(",marca=").append(this.marca);
        sb.append(",tamaño=").append(this.tamano);
        sb.append("}");
    return sb.toString();
    }
    
}

