
package pruebita;

import proyecto01.*;

/**
 *
 * @author bryan
 */
public class PruebasDeProyecto {
    public static void main(String[] args) {
        Pantalla pt1=new Pantalla("HP",20);
        Teclado tl1=new Teclado("Teclado","Lenovo");
        Raton rt1=new Raton("Raton","Apple");
        Computadora hp=new Computadora("Computadora Hp",pt1,tl1,rt1);
        
        Pantalla pt2=new Pantalla("GG",30);
        Teclado tl2=new Teclado("Teclado","hp");
        Raton rt2=new Raton("Raton","samsung");
        Computadora hp1=new Computadora("Computadora GG",pt2,tl2,rt2);
       //-------------------- 
        Orden orden1=new Orden();
        orden1.AgregarComputadora(hp);
        orden1.AgregarComputadora(hp1);
        
        orden1.mostrarOrden();
        //------------------------
        Orden orden2=new Orden();
        orden2.AgregarComputadora(hp);
        orden2.AgregarComputadora(hp1);
        
        orden2.mostrarOrden();
        
    }
}
