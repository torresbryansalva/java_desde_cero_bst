
package partes;

/**
 *
 * @author Bryan
 */
public class Casa{
    private boolean sotano;
    private Dormitorio dormitorio;
    private Cocina cocina;
    private Baños baño;
    public Casa(){
    }

    public Casa(boolean sotano, Dormitorio dormitorio, Cocina cocina, Baños baño) {
        this.sotano = sotano;
        this.dormitorio = dormitorio;
        this.cocina = cocina;
        this.baño = baño;
    }

    public boolean isSotano() {
        return sotano;
    }

    public void setSotano(boolean sotano) {
        this.sotano = sotano;
    }

    public Dormitorio getDormitorio() {
        return dormitorio;
    }

    public void setDormitorio(Dormitorio dormitorio) {
        this.dormitorio = dormitorio;
    }

    public Cocina getCocina() {
        return cocina;
    }

    public void setCocina(Cocina cocina) {
        this.cocina = cocina;
    }

    public Baños getBaño() {
        return baño;
    }

    public void setBaño(Baños baño) {
        this.baño = baño;
    }
    
    public String infoCasa(){
    return "La casa "+dormitorio.InfoDormitorio()+" "+baño.infoBaño()+
            " "+cocina.infoCocina()+", sotano:"+sotano;
    }
    
}
