package paso_por_valor;

/**
 *
 * @author bryan salva torres
 * este paso solo hace una copia de su valor y lo envia a otro metodo
 */
public class PasoPorValor {
    public static void main(String[] args) {
        int x=12;
        System.out.println("x="+x);
        cambioValor(x);
    }
    
    public static void cambioValor(int arg1){
        System.out.println("el argumento:"+arg1+" este es el paso de valor de X");
        arg1=11;
        System.out.println("el argumente al final es:"+arg1);
    }
}
