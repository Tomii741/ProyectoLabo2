
import java.util.Calendar;
import java.util.Date;


public class VUELOS {
    private int asientosLibres;
    private String Origen;
    private String Destino;
    private Calendar FechaSalida = Calendar.getInstance();
    private Calendar FechaLlegada = Calendar.getInstance();
    private int precio;
    private final int costoFijo = 150;
    private int aux;

    public VUELOS(String Origen, String Destino, Date Salida, Date Llegada) {
        this.Origen = Origen;
        this.Destino = Destino;
        this.FechaSalida.setTime(Salida);
        aux = (int)(Math.random()*23)+1;
        this.FechaSalida.set(Calendar.HOUR_OF_DAY,aux);
        this.FechaLlegada.setTime(Llegada);
        aux = (int)(Math.random()*23)+1;
        this.FechaLlegada.set(Calendar.HOUR_OF_DAY,aux);
        this.precio = (int)(Math.random()*300) + costoFijo;               
    }
    public VUELOS(String Origen, String Destino, Date Salida) {
        this.Origen = Origen;
        this.Destino = Destino;
        this.FechaSalida.setTime(Salida);
        aux = (int)(Math.random()*23)+1;
        this.FechaSalida.set(Calendar.HOUR_OF_DAY,aux);
        this.precio = costoFijo;               
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
        return FechaSalida.getTime();
    }

    public Date getFechaLlegada() {
        return FechaLlegada.getTime();
    }


 
}
