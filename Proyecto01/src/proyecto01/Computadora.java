
package proyecto01;


/**
 *
 * @author bryan
 */
public class Computadora {

    private final int idcomputadora;
    private String nombre;
    private Pantalla pantalla;
    private Teclado teclado;
    private Raton raton;
    private static int contadorcompu;
    
    public Computadora(){
        this.idcomputadora=Computadora.contadorcompu++;
    }
    public Computadora(String nombre,Pantalla pantalla,Teclado teclado,Raton raton){
    this();
    this.nombre=nombre;
    this.pantalla=pantalla;
    this.teclado=teclado;
    this.raton=raton;
    }

    public int getIdcomputadora() {
        return idcomputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idcomputadora=" + idcomputadora + ", nombre=" + nombre +
                ", pantalla=" + pantalla + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
  
}
