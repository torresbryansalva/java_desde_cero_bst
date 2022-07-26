
package partes;

/**
 *
 * @author Bryan
 */
public class Componentes {
   private String tipo;
   private String proveedor;
   private int idcomponentes;
   private static int contadorcomponentes;
   
   public Componentes(){
   this.idcomponentes=Componentes.contadorcomponentes++;
   }
   
   public Componentes(String proveedor,String tipo){
   this();
   this.proveedor=proveedor;
   this.tipo=tipo;
   }
 
   public String getTipo(){
   return tipo;
   }
   public String getProveedor(){
   return proveedor;
   }
   public int getIdcomponentes() {
   return idcomponentes;
   }
   public void setTipo(String tipo){
   this.tipo=tipo;
   }
   public void setProveedor(String proveedor){
   this.proveedor=proveedor;
   }
   
   @Override
   public String toString(){
   return "El id es:"+idcomponentes+", proveedor es: "+proveedor+", aporta: "+tipo;
   }
}
