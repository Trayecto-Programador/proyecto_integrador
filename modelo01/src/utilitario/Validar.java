package utilitario;

import javax.swing.JOptionPane;

public class Validar {

    public static boolean validarTexto(String datos, int longitud) {
        boolean respuesta = true;
        if (datos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo esta vacio");
            respuesta = false;
        }

        if (datos.length() > longitud) {
            JOptionPane.showMessageDialog(null, "El campo acepta un maximo hasta " + longitud);
            respuesta = false;
        }

        return respuesta;

    }
}
