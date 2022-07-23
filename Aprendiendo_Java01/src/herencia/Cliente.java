
package herencia;

import java.util.Date;

/**
 *
 * @author bryan
 */
public class Cliente extends humano {
    private int idCliente;
    private Date fecha;
    private boolean vip;
    private static int contadorcliente;

    public Cliente(Date fecha, boolean vip,String nombre,
            char genero, int edad, String direccion) {
        super(nombre,genero,edad,direccion);
        this.idCliente=Cliente.contadorcliente++;
        this.fecha = fecha;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fecha=").append(fecha);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
