
package partes;

/**
 *
 * @author Bryan
 */
public class Coche {
    private String marca;
    private Llanta llantas;
    private Puerta puertas;
    private Motor motores;
    private int idcoche;
    private static int contadorcoche;
    
    public Coche(){
    this.idcoche=Coche.contadorcoche++;
    }

    public Coche(String marca, Llanta llantas, Puerta puertas, Motor motores) {
        this.marca = marca;
        this.llantas = llantas;
        this.puertas = puertas;
        this.motores = motores;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Llanta getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta llantas) {
        this.llantas = llantas;
    }

    public Puerta getPuertas() {
        return puertas;
    }

    public void setPuertas(Puerta puertas) {
        this.puertas = puertas;
    }

    public Motor getMotores() {
        return motores;
    }

    public void setMotores(Motor motores) {
        this.motores = motores;
    }

    public int getIdcoche() {
        return idcoche;
    }
    
    @Override
    public String toString(){
    return "La marca es:"+marca+", que se compone de:"+llantas+"--"+puertas+"--"+motores;
    }
    
}
