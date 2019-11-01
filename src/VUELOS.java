
import java.sql.Time;
import java.util.Date;


public class VUELOS {
    private int asientosLibres;
    private String Origen;
    private String Destino;
    private Date FechaSalida = new Date();
    private Date FechaLlegada = new Date();
    private int precio;

    public VUELOS(String Origen, String Destino, Date Salida, Date Llegada) {
        this.Origen = Origen;
        this.Destino = Destino;
        this.FechaSalida = Salida;
        this.FechaLlegada = Llegada;
        this.precio = (int)(Math.random()*300) + 100;
    }

    public int getPrecio() {
        return precio;
    }

    public int getAsientosLibres() {
        return asientosLibres;
    }

    public String getOrigen() {
        return Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public Date getFechaLlegada() {
        return FechaLlegada;
    }

 
}
