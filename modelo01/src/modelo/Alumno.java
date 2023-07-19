package modelo;

import java.sql.Date;
import java.util.ArrayList;

public class Alumno extends Persona{
    private ArrayList <Asignatura> matriculacion;

    public Alumno() {
    }
    public Alumno(String nombre, String apellido, String dni, Date fecNac, String direccion, String localidad, int codPos, String telefono) {
        super(nombre, apellido, dni, fecNac, direccion, localidad, codPos, telefono);
        this.matriculacion = new ArrayList<>();
    }
 






   
      
}
