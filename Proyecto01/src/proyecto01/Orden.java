
package proyecto01;

/**
 *
 * @author bryan
 */
public class Orden {
    private final int idorden;
    private Computadora computadoras[];
    private static int contadorOrden;
    private int contadorComputadoras;
    private static final int MAXcomputaras=10;
    
    public Orden(){
        this.idorden=Orden.contadorOrden++;
        computadoras =new Computadora[Orden.MAXcomputaras];
}
    public  void AgregarComputadora(Computadora computadoras){
    if(this.contadorComputadoras<Orden.MAXcomputaras){
        this.computadoras[this.contadorComputadoras++]=computadoras;
        }
    else{
        System.out.println("Has superado el limite: "+Orden.MAXcomputaras);
        }
    }

public void mostrarOrden(){
    System.out.println("Orden #:"+this.idorden);
    System.out.println("Computadoras de la orden #:"+this.idorden);
    for (int i = 0; i < this.contadorComputadoras; i++) {
        System.out.println(this.computadoras[i]);
    }
}    
}
