
package enumeraciones;

/**
 *
 * @author bryan
 */
public enum Continentes {
    AFRICA(53,"1.2 billones"),
    EUROPA(46,"1.3 billones"),
    ASIA(44,"1 billon"),
    AMERICA(34,"1.5 billones"),
    OCEANIA(14,"500 millones");
    
    private final int paises;
    private final String cantidad;
    
    Continentes(int paises,String cantidad){
        this.paises=paises;
        this.cantidad=cantidad;
    }
    public int getPaises(){
    return this.paises;
    }
    public String getCantidad(){
    return this.cantidad;
    }
    
}
