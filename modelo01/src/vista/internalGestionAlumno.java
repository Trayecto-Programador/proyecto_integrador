package vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Alumno;
import servicio.AlumnoServicio;
import utilitario.Conversor;

public class internalGestionAlumno extends javax.swing.JInternalFrame {

    private String dni;
    AlumnoServicio aluService = new AlumnoServicio();
    

    public internalGestionAlumno() throws Exception {
        initComponents();
        establecerPropiedades();
        cargarTablaAlumnos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlNombre2 = new javax.swing.JLabel();
        lbNuevoAlumno = new javax.swing.JLabel();
        jpIzquierda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        txtCodPostal = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtFecNac = new javax.swing.JTextField();
        txt_precio6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        fondoEscritorio = new javax.swing.JLabel();

        jlNombre2.setBackground(new java.awt.Color(255, 255, 255));
        jlNombre2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlNombre2.setForeground(new java.awt.Color(255, 255, 255));
        jlNombre2.setText("Nombre");

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNuevoAlumno.setBackground(new java.awt.Color(255, 255, 255));
        lbNuevoAlumno.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbNuevoAlumno.setForeground(new java.awt.Color(255, 255, 255));
        lbNuevoAlumno.setText("ADMINISTRAR ALUMNOS");
        getContentPane().add(lbNuevoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 350, -1));

        jpIzquierda.setBackground(new java.awt.Color(255, 255, 255));
        jpIzquierda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jpIzquierda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlumnos);

        jpIzquierda.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 330));

        getContentPane().add(jpIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 660, 350));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizar.setBackground(new java.awt.Color(255, 51, 204));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, 40));

        btnEliminar.setBackground(new java.awt.Color(255, 51, 204));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 240, 350));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("DNI");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Localidad");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Id Alumno");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Telefono");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 90, -1));

        txtDni.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 170, -1));

        txtLocalidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 170, -1));

        txtCodPostal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtCodPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 170, -1));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 170, -1));

        txtId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 170, -1));

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 170, -1));

        txtFecNac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtFecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 170, -1));

        txt_precio6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_precio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 170, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Codigo Pos");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 90, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("FecNac");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 90, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Direccion");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 90, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 920, 110));

        fondoEscritorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_2.png"))); // NOI18N
        fondoEscritorio.setText("jLabel1");
        getContentPane().add(fondoEscritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 1030, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        //Instanciando 
        Alumno alu = aluService.crearAlumno();
        
        alu.setId(Integer.parseInt(txtId.getText()));
        alu.setNombre(txtNombre.getText());
        alu.setApellido(txtApellido.getText());
        alu.setDni(txtDni.getText());
        alu.setFecNac(Conversor.convertirDateSql(txtFecNac.getText()));
        alu.setDireccion(txtDireccion.getText());
        alu.setLocalidad(txtLocalidad.getText());
        alu.setCodPos(Integer.parseInt(txtCodPostal.getText()));
        alu.setTelefono(txtTelefono.getText());
        
        try {
            aluService.modificarAlumno(alu);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se puede actualizar el registro selecionado");
        }
        try {
            cargarTablaAlumnos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar la tabla");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id = Integer.parseInt(txtId.getText());
        System.out.println("id");
        try {
            aluService.borrarAlumno(id);
            cargarTablaAlumnos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar la tabla");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    private void jTableAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlumnosMouseClicked
                
    }//GEN-LAST:event_jTableAlumnosMouseClicked

//Metodos Personalizados
    private void establecerPropiedades() {
        setSize(1000, 600);// Establezco las dimensiones del formulario
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y);
        setTitle("Gestion de Alumnos");// Titulo de la barra de Titulo

    }
    private void cargarTablaAlumnos() throws Exception {
        /* Genero una Instancia de la clase DefaulTable Model
        *para manipular los datos de la Jtable*/
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"id", "Nombre", "Apellido", "Dni", "FecNac", "Direccion", "Localidad", "CodPostal", "Tel"});
        this.jTableAlumnos = new JTable(modelo);
        this.jScrollPane1.setViewportView(this.jTableAlumnos);

        // Recorre un Arraylist y garga los datos en filas del JTable
        for (Alumno alumno : aluService.enviarListaAlumno()) {
            modelo.addRow(new Object[]{alumno.getId(), alumno.getNombre(), alumno.getApellido(), alumno.getDni(), alumno.getFecNac(), alumno.getDireccion(), alumno.getLocalidad(), alumno.getCodPos(), alumno.getTelefono()});
        }
        
        /*************************Obtener el dato de dni de la tabla****************************************/
             
        jTableAlumnos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTableAlumnos.rowAtPoint(e.getPoint());
                int columna_point = 3;

                if (fila_point > -1) {
                    dni = jTableAlumnos.getValueAt(fila_point, columna_point).toString();
                    
                    enviarDatosDni(dni);
                }
            }
        });
        
        /*****************************************************************/
    }

    // Metodo Enviar Datos al panel Inferior
    private Alumno enviarDatosDni(String dni) {
        Alumno alumno = null;
        try {
           alumno = aluService.enviarDni(dni);
           
           //Carga de los campos de texto
           txtId.setText(String.valueOf(alumno.getId()));
           txtNombre.setText(alumno.getNombre());
           txtApellido.setText(alumno.getApellido());
           txtDni.setText(alumno.getDni());
           txtFecNac.setText(alumno.getFecNac().toString());
           txtDireccion.setText(alumno.getDireccion());
           txtLocalidad.setText(alumno.getLocalidad());
           txtCodPostal.setText(String.valueOf(alumno.getCodPos()));
           txtTelefono.setText(alumno.getTelefono());
           
           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se recibio el Alumno verifique el dni");
        }
        return alumno;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel fondoEscritorio;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlumnos;
    private javax.swing.JLabel jlNombre2;
    private javax.swing.JPanel jpIzquierda;
    private javax.swing.JLabel lbNuevoAlumno;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodPostal;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFecNac;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txt_precio6;
    // End of variables declaration//GEN-END:variables
}
