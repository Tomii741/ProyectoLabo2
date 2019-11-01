
import java.sql.Time;
import java.util.Date;


public class VUELOS {
    private int asientosLibres;
    private String Origen;
    private String Destino;
    private Date FechaSalida = new Date();
    private Date FechaLlegada = new Date();
    private int precio;

    public VUELOS(String Origen, String Destino) {
        this.Origen = Origen;
        this.Destino = Destino;
        this.precio = (int)(Math.random()*300) + 100;
    }

    public int getPrecio() {
        return precio;
    }

 
}
