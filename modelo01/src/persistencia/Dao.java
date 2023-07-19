package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public abstract class Dao {
//*****************************************************************************************
    //Datos Globales para conexion
//*****************************************************************************************
    //Atributos Globales 
    protected Connection conexion = null;// crea una conexion nula a la base de datos
    protected ResultSet resultado = null;
    protected Statement sentencia = null;//Permite crear sentencias mysql

    //Constantes con Datos necesaria para la conexion con la base
    private final String USUARIO = "root";
    private final String CLAVE = "";
    private final String BASE = "cfp";
    private final String DOMINIO = "com.mysql.jdbc.Driver";

 //*****************************************************************************************
                           //Metodo para conectarse a la base 
 //*****************************************************************************************
    
    protected void conectarBase() throws SQLException, ClassNotFoundException {
        try {
               
            String urlBaseDatos = "jdbc:mysql://localhost:3306/" + BASE + "?useSSl=false";
            conexion = DriverManager.getConnection(urlBaseDatos, USUARIO, CLAVE);

        } catch (SQLException e) {
            throw e;
        }
    }
//****************************************************************************************/
                        //Metodo para desconectarse a la base 
//*****************************************************************************************
    protected void desconectarBase() throws SQLException {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
            
            JOptionPane.showMessageDialog(null, "la conexion se desconecto de la base...");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo desconectar la conexion..." + e);
        }
    }
//*****************************************************************************************
         //metodo para realizar inserciones, eliminar, modificar datos a la base de datos
//*****************************************************************************************
    protected void insertarEliminarModificar(String consulta) throws ClassNotFoundException, SQLException {

        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(consulta);

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            desconectarBase();
        }

    }
//*****************************************************************************************
                    //Metodo para extraer registros en la base de datos
//*****************************************************************************************
    protected void consultarBase(String consulta) throws ClassNotFoundException, SQLException {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(consulta);
           

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {

        }
    }
}
