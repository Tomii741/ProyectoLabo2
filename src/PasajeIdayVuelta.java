
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Turbioh
 */
public class PasajeIdayVuelta extends PASAJE {

    @Override
    public void setVuelta(Date dato) {
        Vuelta.setTime(dato);
    }
    
}
