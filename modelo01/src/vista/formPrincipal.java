package vista;

import java.util.logging.Level;
import java.util.logging.Logger;

public class formPrincipal extends javax.swing.JFrame {

    public formPrincipal() {
        initComponents();
        establecerPropiedades();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuAlumno = new javax.swing.JMenu();
        miNuevoAlumno = new javax.swing.JMenuItem();
        imGestionAlumno = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        menuAsignatura = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        MenuAula = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        menuCurso = new javax.swing.JMenu();
        contentMenuItem1 = new javax.swing.JMenuItem();
        aboutMenuItem1 = new javax.swing.JMenuItem();
        menuProfesor = new javax.swing.JMenu();
        contentMenuItem2 = new javax.swing.JMenuItem();
        aboutMenuItem2 = new javax.swing.JMenuItem();
        menuRegistro = new javax.swing.JMenu();
        contentMenuItem3 = new javax.swing.JMenuItem();
        aboutMenuItem3 = new javax.swing.JMenuItem();
        menuRegistro1 = new javax.swing.JMenu();
        contentMenuItem4 = new javax.swing.JMenuItem();
        aboutMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alunnno_iconos.png"))); // NOI18N
        menuAlumno.setMnemonic('f');
        menuAlumno.setText("Alumno");
        menuAlumno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuAlumno.setPreferredSize(new java.awt.Dimension(150, 70));

        miNuevoAlumno.setMnemonic('o');
        miNuevoAlumno.setText("Nuevo Alumno");
        miNuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNuevoAlumnoActionPerformed(evt);
            }
        });
        menuAlumno.add(miNuevoAlumno);

        imGestionAlumno.setMnemonic('s');
        imGestionAlumno.setText("Gestionar Alumno");
        imGestionAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imGestionAlumnoActionPerformed(evt);
            }
        });
        menuAlumno.add(imGestionAlumno);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        menuAlumno.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        menuAlumno.add(exitMenuItem);

        menuBar.add(menuAlumno);

        menuAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asignatura_iconos.png"))); // NOI18N
        menuAsignatura.setMnemonic('e');
        menuAsignatura.setText("Asignatura");
        menuAsignatura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuAsignatura.setPreferredSize(new java.awt.Dimension(150, 70));

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Nueva Asignatura");
        menuAsignatura.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Gestionar Asignatura");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        menuAsignatura.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        menuAsignatura.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        menuAsignatura.add(deleteMenuItem);

        menuBar.add(menuAsignatura);

        MenuAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aula_iconos.png"))); // NOI18N
        MenuAula.setMnemonic('h');
        MenuAula.setText("Aula");
        MenuAula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MenuAula.setPreferredSize(new java.awt.Dimension(150, 70));

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Nueva Aula");
        MenuAula.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Gestionar Aula");
        MenuAula.add(aboutMenuItem);

        menuBar.add(MenuAula);

        menuCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/curso_iconos.png"))); // NOI18N
        menuCurso.setMnemonic('h');
        menuCurso.setText("Curso");
        menuCurso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuCurso.setPreferredSize(new java.awt.Dimension(150, 70));

        contentMenuItem1.setMnemonic('c');
        contentMenuItem1.setText("Nuevo Curso");
        menuCurso.add(contentMenuItem1);

        aboutMenuItem1.setMnemonic('a');
        aboutMenuItem1.setText("Gestionar Curso");
        menuCurso.add(aboutMenuItem1);

        menuBar.add(menuCurso);

        menuProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profesor_iconos.png"))); // NOI18N
        menuProfesor.setMnemonic('h');
        menuProfesor.setText("Profesor");
        menuProfesor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuProfesor.setPreferredSize(new java.awt.Dimension(150, 70));

        contentMenuItem2.setMnemonic('c');
        contentMenuItem2.setText("Nuevo Profesor");
        menuProfesor.add(contentMenuItem2);

        aboutMenuItem2.setMnemonic('a');
        aboutMenuItem2.setText("Gestionar Profesor");
        menuProfesor.add(aboutMenuItem2);

        menuBar.add(menuProfesor);

        menuRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registro_iconos.png"))); // NOI18N
        menuRegistro.setMnemonic('h');
        menuRegistro.setText("Registro");
        menuRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuRegistro.setPreferredSize(new java.awt.Dimension(150, 70));

        contentMenuItem3.setMnemonic('c');
        contentMenuItem3.setText("Contents");
        menuRegistro.add(contentMenuItem3);

        aboutMenuItem3.setMnemonic('a');
        aboutMenuItem3.setText("About");
        menuRegistro.add(aboutMenuItem3);

        menuBar.add(menuRegistro);

        menuRegistro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar_sesion_icono.png"))); // NOI18N
        menuRegistro1.setMnemonic('h');
        menuRegistro1.setText("Cerrar Sesion");
        menuRegistro1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menuRegistro1.setPreferredSize(new java.awt.Dimension(170, 70));

        contentMenuItem4.setMnemonic('c');
        contentMenuItem4.setText("Contents");
        menuRegistro1.add(contentMenuItem4);

        aboutMenuItem4.setMnemonic('a');
        aboutMenuItem4.setText("About");
        menuRegistro1.add(aboutMenuItem4);

        menuBar.add(menuRegistro1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void miNuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNuevoAlumnoActionPerformed
        internalAlumno intAlumno = new internalAlumno();
        escritorio.add(intAlumno);
        intAlumno.setVisible(true);
    }//GEN-LAST:event_miNuevoAlumnoActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed

    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void imGestionAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imGestionAlumnoActionPerformed
        try {
            internalGestionAlumno gestionAlumno;
            gestionAlumno = new internalGestionAlumno();
            escritorio.add(gestionAlumno);
            gestionAlumno.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(formPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_imGestionAlumnoActionPerformed

//Metodos Personalizados
    private void establecerPropiedades() {
        setSize(1200, 700);// Establezco las dimensiones del formulario
        setExtendedState(MAXIMIZED_BOTH); //se establece el estado de maximizado de la ventana
        setLocationRelativeTo(null);// se establece el centrado del formulario
        setTitle("Centro de Formación");// Titulo de la barra de Titulo

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAula;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem aboutMenuItem1;
    private javax.swing.JMenuItem aboutMenuItem2;
    private javax.swing.JMenuItem aboutMenuItem3;
    private javax.swing.JMenuItem aboutMenuItem4;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem contentMenuItem1;
    private javax.swing.JMenuItem contentMenuItem2;
    private javax.swing.JMenuItem contentMenuItem3;
    private javax.swing.JMenuItem contentMenuItem4;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem imGestionAlumno;
    private javax.swing.JMenu menuAlumno;
    private javax.swing.JMenu menuAsignatura;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCurso;
    private javax.swing.JMenu menuProfesor;
    private javax.swing.JMenu menuRegistro;
    private javax.swing.JMenu menuRegistro1;
    private javax.swing.JMenuItem miNuevoAlumno;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    // End of variables declaration//GEN-END:variables

}
