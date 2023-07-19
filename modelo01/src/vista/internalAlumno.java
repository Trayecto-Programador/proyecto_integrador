package vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Date;
import javax.swing.JOptionPane;
import modelo.Alumno;
import servicio.AlumnoServicio;
import utilitario.Conversor;

public class internalAlumno extends javax.swing.JInternalFrame {

    public internalAlumno() {
        initComponents();
        establecerPropiedades();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlNombre2 = new javax.swing.JLabel();
        lbNuevoAlumno = new javax.swing.JLabel();
        jlNombre1 = new javax.swing.JLabel();
        jApellido = new javax.swing.JLabel();
        jlDni = new javax.swing.JLabel();
        jlFecNac = new javax.swing.JLabel();
        jlDireccion = new javax.swing.JLabel();
        Localidad = new javax.swing.JLabel();
        jlCodigoPostal = new javax.swing.JLabel();
        jlCodigoPostal1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtFecNac = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        txtCodigoPostal = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jlAsideDerecho = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        fondoEscritorio = new javax.swing.JLabel();

        jlNombre2.setBackground(new java.awt.Color(255, 255, 255));
        jlNombre2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNombre2.setForeground(new java.awt.Color(255, 255, 255));
        jlNombre2.setText("Nombre");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNuevoAlumno.setBackground(new java.awt.Color(255, 255, 255));
        lbNuevoAlumno.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbNuevoAlumno.setForeground(new java.awt.Color(255, 255, 255));
        lbNuevoAlumno.setText("INGRESO ALUMNO");
        getContentPane().add(lbNuevoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 240, -1));

        jlNombre1.setBackground(new java.awt.Color(255, 255, 255));
        jlNombre1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNombre1.setForeground(new java.awt.Color(255, 255, 255));
        jlNombre1.setText("Nombre");
        getContentPane().add(jlNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 90, 30));

        jApellido.setBackground(new java.awt.Color(255, 255, 255));
        jApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jApellido.setForeground(new java.awt.Color(255, 255, 255));
        jApellido.setText("Apellido");
        getContentPane().add(jApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 90, 30));

        jlDni.setBackground(new java.awt.Color(255, 255, 255));
        jlDni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDni.setForeground(new java.awt.Color(255, 255, 255));
        jlDni.setText("DNI");
        getContentPane().add(jlDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 90, 30));

        jlFecNac.setBackground(new java.awt.Color(255, 255, 255));
        jlFecNac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlFecNac.setForeground(new java.awt.Color(255, 255, 255));
        jlFecNac.setText("Fecha Nacimiento");
        getContentPane().add(jlFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 150, 30));

        jlDireccion.setBackground(new java.awt.Color(255, 255, 255));
        jlDireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jlDireccion.setText("Direccion");
        getContentPane().add(jlDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 90, 30));

        Localidad.setBackground(new java.awt.Color(255, 255, 255));
        Localidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Localidad.setForeground(new java.awt.Color(255, 255, 255));
        Localidad.setText("Localidad");
        getContentPane().add(Localidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 90, 30));

        jlCodigoPostal.setBackground(new java.awt.Color(255, 255, 255));
        jlCodigoPostal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCodigoPostal.setForeground(new java.awt.Color(255, 255, 255));
        jlCodigoPostal.setText("Codigo Postal");
        getContentPane().add(jlCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 110, 30));

        jlCodigoPostal1.setBackground(new java.awt.Color(255, 255, 255));
        jlCodigoPostal1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlCodigoPostal1.setForeground(new java.awt.Color(255, 255, 255));
        jlCodigoPostal1.setText("Telefono");
        getContentPane().add(jlCodigoPostal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 110, 30));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 190, 30));

        txtApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 190, 30));

        txtDni.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 190, 30));

        txtFecNac.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 190, 30));

        txtDireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 190, 30));

        txtLocalidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 190, 30));

        txtCodigoPostal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 190, 30));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 190, 30));

        jlAsideDerecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estudiantes_01_aside.png"))); // NOI18N
        jlAsideDerecho.setText("jLabel1");
        getContentPane().add(jlAsideDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 320, 480));

        btnGuardar.setBackground(new java.awt.Color(102, 0, 255));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 110, 40));

        btnCancelar.setBackground(new java.awt.Color(102, 0, 255));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 110, 40));

        fondoEscritorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_1.png"))); // NOI18N
        fondoEscritorio.setText("jLabel1");
        getContentPane().add(fondoEscritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            // Crear una instancia de Servicio Alumno
            AlumnoServicio servAlumno = new AlumnoServicio();
            Alumno alumno = servAlumno.crearAlumno();

            //Setear atributos del Alumno
            alumno.setNombre(txtNombre.getText().trim());
            alumno.setApellido(txtApellido.getText().trim());
            alumno.setDni(txtDni.getText().trim());

            //Conversion de String a  Date SQL
            Date convercion = Conversor.convertirDateSql(txtFecNac.getText().trim());

            alumno.setFecNac(convercion);
            alumno.setDireccion(txtDireccion.getText().trim());
            alumno.setLocalidad(txtLocalidad.getText().trim());
            alumno.setCodPos(Integer.parseInt(txtCodigoPostal.getText().trim()));
            alumno.setTelefono(txtTelefono.getText().trim());

            // Envio el objeto Alumno al metodo Guardar Alumno
            servAlumno.guardarAlumno(alumno);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la conversion");
            
        }
        limpiarCampos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

//Metodos Personalizados
    private void establecerPropiedades() {
        setSize(1000, 600);// Establezco las dimensiones del formulario
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y);
        setTitle("Alta Alumnos");// Titulo de la barra de Titulo

    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        txtFecNac.setText("");
        txtDireccion.setText("");
        txtLocalidad.setText("");
        txtCodigoPostal.setText("");
        txtTelefono.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Localidad;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel fondoEscritorio;
    private javax.swing.JLabel jApellido;
    private javax.swing.JLabel jlAsideDerecho;
    private javax.swing.JLabel jlCodigoPostal;
    private javax.swing.JLabel jlCodigoPostal1;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlFecNac;
    private javax.swing.JLabel jlNombre1;
    private javax.swing.JLabel jlNombre2;
    private javax.swing.JLabel lbNuevoAlumno;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFecNac;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
