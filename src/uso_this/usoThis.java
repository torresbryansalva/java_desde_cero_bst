
package uso_this;

/**
 *
 * @author bryan
 */
public class usoThis {
    public static void main(String[] args) {
    Persona persna=new Persona("Juan","Perez",23);
        System.out.println("persona es:"+ persna);
        System.out.println("nombre "+persna.nombre);
         System.out.println("Apellido "+persna.apellido);
         System.out.println("peso "+persna.peso);
    }
}

class Persona{  // crean una clase dentro de un paquete
String nombre;
String apellido;
int peso;

  Persona(String nombre,String apellido,int peso){ // este es su constructr
this.nombre=nombre;
this.apellido=apellido;
this.peso=peso;
      System.out.println("ingresandoa al objeto creado"+this);
      new Mostrar().mostrar(this);
  }
}

class Mostrar{
public void mostrar(Persona persna){
    System.out.println("persona desde mostrar"+persna);
    System.out.println("impresion del objeto actual(this)"+this);
}
}
