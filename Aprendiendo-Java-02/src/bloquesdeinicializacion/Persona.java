
package bloquesdeinicializacion;

/**
 *
 * @author Bryan
 */
// tenemos dos tipos de bloques staticos y no estaticos
public class Persona {
    private final int idpersona;
    private static int contadorpersona;
    
    static{// es es el bloque que se inicializa antes del constructor
        System.out.println("Ejecucion bloque estatico");
        Persona.contadorpersona++;              
    }
    // bloque de inicializacion no estatico
    {
        System.out.println("Ejecucion del bloque NO estatico");
        this.idpersona=Persona.contadorpersona++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdpersona() {
        return idpersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idpersona=" + idpersona + '}';
    }
    
    
    
}
