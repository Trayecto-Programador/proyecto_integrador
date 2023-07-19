package servicio;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Alumno;
import persistencia.AlumnoDao;

public class AlumnoServicio {
   
    private AlumnoDao aluDao = new AlumnoDao();
    
    
/*****************************************************************************************/
                //Metodo crear Alumno - sin parametros - con parametros
/*****************************************************************************************/
    
    public Alumno crearAlumno() {
        return new Alumno();
    }

    
    public Alumno crearAlumno(String nombre, String apellido, String dni, Date FecNac, String direccion, String localidad, int codPos, String telefono) {
        return new Alumno(nombre, apellido, dni, FecNac, direccion, localidad, codPos, telefono);
    }

  /*****************************************************************************************/
                //Metodo para Insertar un alumno en la base
 /*****************************************************************************************/
    
    public void guardarAlumno(Alumno alumno) throws Exception {
        if (existeAlumnoDni(alumno.getDni())) {
            aluDao.insertarAlumno(alumno);
            JOptionPane.showMessageDialog(null, "Dato Correctamente Ingresado");
        } else {
            JOptionPane.showMessageDialog(null, "El alumno esta registrado en la base de Datos");
        }
    }
/*****************************************************************************************/
                //Metodo para verificar la existencia del Alumno
/*****************************************************************************************/
    
    private boolean existeAlumnoDni(String dni) throws Exception {
        return aluDao.buscarAlumnoDNI(dni) != null;
    }
/*****************************************************************************************/
                // Metodo para Enviar DNI de Alumno
/*****************************************************************************************/
    
    public Alumno enviarDni(String dni) throws Exception {
        return aluDao.buscarAlumnoDNI(dni);

    }
/*****************************************************************************************/
                //Metodo para Enviar una Coleccion de Alumnos
/*****************************************************************************************/
    
    public ArrayList<Alumno> enviarListaAlumno() throws Exception {
        return aluDao.listarAlumnos();
    }
/*****************************************************************************************/
                //Metodo para modificar datos del alumno
/*****************************************************************************************/
    
    public void modificarAlumno(Alumno alumno) throws Exception{
        System.out.println(alumno.toString());
        aluDao.actualizarAlumno(alumno);
        
    }
    
/*****************************************************************************************/
               //Metodo para borrar alumno
/*****************************************************************************************/
    
    public void borrarAlumno(int id) throws Exception{
        aluDao.eliminarAlumno(id);
    }
}
