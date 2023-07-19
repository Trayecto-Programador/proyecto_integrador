package utilitario;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Conversor {

    public static Date convertirDateSql(String fecha) {
        String fechaString = fecha;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        try {
            java.util.Date fechaUtil = formato.parse(fechaString);
            Date fechaSQL = new Date(fechaUtil.getTime());
            return fechaSQL;
    
        } catch (ParseException ex) {
            return null;
        }
        
    }
}
