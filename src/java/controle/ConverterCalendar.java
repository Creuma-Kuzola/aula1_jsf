/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author creuma
 */

@FacesConverter(value = "converterCalendar")

public class ConverterCalendar implements Serializable, Converter {

    SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
    
    @Override // converte da tela para o controle
    public Object getAsObject(FacesContext arg0, UIComponent arg1, String string) {
        
        if( string == null){
          return  null;
        }
        try {
            
            Calendar obj = Calendar.getInstance();
            obj.setTime(simpleDate.parse(string));
            return obj;
            
        }catch (Exception e){
            return null;
        }
    }

    @Override // converte do controle para a tela
    public String getAsString(FacesContext arg0, UIComponent arg1, Object obj) {
        
        Calendar object = (Calendar) obj ;
        return simpleDate.format(object.getTime());
    }
    
}
