
import java.util.Calendar;
import java.util.Date;



public abstract class PASAJE {
    
    protected Calendar Salida = Calendar.getInstance();
    protected Calendar Vuelta = Calendar.getInstance();
    
    //protected Date Salida = new Date();
    
    //protected Date Vuelta = new Date();
    protected int numButaca;
    protected String Origen;
    protected String Destino;
    protected int Cantidad;

/*    public Date getSalida() {
        return Salida;
    }

    public Date getVuelta() {
        return Vuelta;
    }
 */   
    public void setSalida(Date dato)
    {
        Salida.setTime(dato);
    }

    public abstract void setVuelta(Date dato);
    

    public Date getSalida() {
        return Salida.getTime();
    }

    public Date getVuelta() {
        return Vuelta.getTime();
    }
    
    
}
