
package partes;

/**
 *
 * @author Bryan
 */
public class OrdenCompra {
    private Coche coche[];
    private int idordencompra;
    private static int contadorordencompra;
    private int cantcoche;
    private static final int MAX_COCHES=3;
    
    public OrdenCompra(){
    this.idordencompra=OrdenCompra.contadorordencompra++;
    coche=new Coche[OrdenCompra.MAX_COCHES];
    }
    public void Agregar(Coche coche){
    if(this.cantcoche<OrdenCompra.MAX_COCHES){
        this.coche[this.cantcoche++]=coche;
    }else{
        System.out.println("Has exedido el maximo numero de compras por hoy");
    }
    }
    public void Mostrar(){
        System.out.println("El id de la compra es:"+idordencompra+"y has comprado "+cantcoche);
        for (int i = 0; i <this.cantcoche; i++) {
            System.out.println(this.coche[i]);
        }
    }
}
