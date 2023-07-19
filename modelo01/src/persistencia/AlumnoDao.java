package persistencia;

import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Alumno;

public final class AlumnoDao extends Dao {

 /*****************************************************************************************/
               //Metodo para Insertar alumno
/*****************************************************************************************/
    public void insertarAlumno(Alumno alumno) throws Exception {
        try {
            if (alumno == null) {
                throw new Exception("Debe enviar un alumno");

            }
            String consulta = "INSERT INTO alumnos(nombre, apellido, dni, fecNac, direccion, localidad, codPostal,telefono)"
                    + "VALUES  ('" + alumno.getNombre() + "','"
                    + alumno.getApellido() + "','"
                    + alumno.getDni() + "','"
                    + alumno.getFecNac() + "','"
                    + alumno.getDireccion() + "','"
                    + alumno.getLocalidad() + "','"
                    + alumno.getCodPos() + "','"
                    + alumno.getTelefono() + "');";

            insertarEliminarModificar(consulta);

        } catch (Exception e) {
            throw e;
        }
    }
/*****************************************************************************************/
               //Metodo para Actualizar alumno
/*****************************************************************************************/
   
    public void actualizarAlumno(Alumno alumno) throws Exception {
        
        try {
            if (alumno == null) {
                JOptionPane.showMessageDialog(null, "Se recibio un alumno vacio");
            }
            
            String consulta = "UPDATE alumnos SET nombre ='"+alumno.getNombre()+"', apellido ='"+alumno.getApellido()+"', dni ='"+alumno.getDni()+"' , fecNac ='"+alumno.getFecNac()+"', direccion ='"+alumno.getDireccion()+"', localidad ='"+alumno.getLocalidad()+"', codPostal ='"+alumno.getCodPos()+"', telefono ='"+alumno.getTelefono()+"' WHERE idAlumno ='"+alumno.getId()+"'";
            insertarEliminarModificar(consulta);
            
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el alumno");
        }
    }
/*****************************************************************************************/
               //Metodo para Eliminar alumno
/*****************************************************************************************/
  
    public void eliminarAlumno(int id) throws Exception {
        try {
            String consulta = "DELETE FROM alumnos WHERE idAlumno = '" + id + "'";
            insertarEliminarModificar(consulta);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el alumno");
        }
    }
/*****************************************************************************************/
               //Metodo para Buscar alumno
/*****************************************************************************************/
   
    public Alumno buscarAlumnoDNI(String dni ) throws Exception {
            String consulta = "SELECT idAlumno, nombre, apellido, dni, fecNac, direccion, localidad, codPostal, telefono FROM alumnos WHERE dni  = '" + dni + "'";
        try {
            consultarBase(consulta);
            Alumno alumno = new Alumno();

            while (resultado.next()) {
                alumno.setId(resultado.getInt(1));
                alumno.setNombre(resultado.getString(2));
                alumno.setApellido(resultado.getString(3));
                alumno.setDni(resultado.getString(4));
                alumno.setFecNac(resultado.getDate(5));
                alumno.setDireccion(resultado.getString(6));
                alumno.setLocalidad(resultado.getString(7));
                alumno.setCodPos(resultado.getInt(8));
                alumno.setTelefono(resultado.getString(9));
          }
            desconectarBase();
            return alumno;
        } catch (ClassNotFoundException | SQLException e) {
            desconectarBase();
            throw e;
        }
        
    }
/*****************************************************************************************/
               //Metodo para Listar todos los alumnos de la base
/*****************************************************************************************/
    public ArrayList <Alumno> listarAlumnos() throws Exception {
        try {
            String consulta = "SELECT idAlumno, nombre, apellido, dni, fecNac, direccion, localidad, codPostal, telefono FROM alumnos ";
            consultarBase(consulta);
            Alumno alumno = new Alumno();
            ArrayList<Alumno> alumnos = new ArrayList<>();

            while (resultado.next()) {
                
                alumno.setId(resultado.getInt(1));
                alumno.setNombre(resultado.getString(2));
                alumno.setApellido(resultado.getString(3));
                alumno.setDni(resultado.getString(4));
                alumno.setFecNac(resultado.getDate(5));
                alumno.setDireccion(resultado.getString(6));
                alumno.setLocalidad(resultado.getString(7));
                alumno.setCodPos(resultado.getInt(8));
                alumno.setTelefono(resultado.getString(9));
                alumnos.add(alumno);
           }
            desconectarBase();
                return alumnos;
        } catch (ClassNotFoundException | SQLException e) {
            desconectarBase();
            throw e;
            
        }
    }
}
