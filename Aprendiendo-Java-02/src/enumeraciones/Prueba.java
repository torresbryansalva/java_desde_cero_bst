
package enumeraciones;

/**
 *
 * @author bryan
 */
public class Prueba {
    public static void main(String[] args) {
//        System.out.println("el dia 1:"+Dias.LUNES);
//        indicarDiaSemana(Dias.MIERCOLES);
        System.out.println("Continente nro.3 "+Continentes.ASIA);
        System.out.println("Numero de paises en el nro3:"+
                Continentes.ASIA.getPaises());
        System.out.println("Cantidad de habitantes del nro3: "+
                Continentes.ASIA.getCantidad());

    }
    private static void indicarDiaSemana(Dias dias){
    switch(dias){
        case LUNES:
            System.out.println("primer dia de la semana:");
            break;
        case MARTES:
            System.out.println("segundo dia de la semana:");
            break;
        case MIERCOLES:
            System.out.println("tercer dia de la semana:");
            break;
        case JUEVES:
            System.out.println("cuarto dia de la semana:");
            break;
        case VIERNES:
            System.out.println("quinto dia de la semana:");
            break;
        case SABADO:
            System.out.println("sexto dia de la semana:");
            break;
        case DOMINGO:
            System.out.println("septimo dia de la semana:");
            break;
    }
    }
}
