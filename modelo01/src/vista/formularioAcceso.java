package vista;

public class formularioAcceso extends javax.swing.JFrame {

    public formularioAcceso() {
        initComponents();
        configuracion();

    }

    public final void configuracion() {
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Acceso al Sistema");
        this.setSize(700, 500);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpIzquierdo = new javax.swing.JPanel();
        jlCentro = new javax.swing.JLabel();
        jlLogo1 = new javax.swing.JLabel();
        jpDerecho = new javax.swing.JPanel();
        jlLogo2 = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jlContrsenia = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 500));

        jpIzquierdo.setBackground(new java.awt.Color(255, 0, 255));
        jpIzquierdo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpIzquierdo.setPreferredSize(new java.awt.Dimension(175, 350));

        jlCentro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlCentro.setForeground(new java.awt.Color(255, 255, 255));
        jlCentro.setText("CENTRO DE ENSEÑANZA");

        jlLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escuela01.png"))); // NOI18N
        jlLogo1.setText("FIGURA");

        javax.swing.GroupLayout jpIzquierdoLayout = new javax.swing.GroupLayout(jpIzquierdo);
        jpIzquierdo.setLayout(jpIzquierdoLayout);
        jpIzquierdoLayout.setHorizontalGroup(
            jpIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIzquierdoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jpIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCentro))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jpIzquierdoLayout.setVerticalGroup(
            jpIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIzquierdoLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jlCentro)
                .addGap(18, 18, 18)
                .addComponent(jlLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jpDerecho.setBackground(new java.awt.Color(255, 255, 255));

        jlLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario01.png"))); // NOI18N
        jlLogo2.setText("logo");

        jlUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlUsuario.setText("Usuario");

        jlContrsenia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlContrsenia.setText("contraseña");

        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jButton1.setText("INICIAR SESION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDerechoLayout = new javax.swing.GroupLayout(jpDerecho);
        jpDerecho.setLayout(jpDerechoLayout);
        jpDerechoLayout.setHorizontalGroup(
            jpDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDerechoLayout.createSequentialGroup()
                .addGroup(jpDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDerechoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jpDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlUsuario)
                            .addComponent(jlContrsenia))
                        .addGap(18, 18, 18)
                        .addGroup(jpDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpDerechoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jlLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jpDerechoLayout.setVerticalGroup(
            jpDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDerechoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jlLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jpDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jpDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlContrsenia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpDerecho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        //Sin validaciones
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        //Sin validaciones
    }//GEN-LAST:event_txtContraseniaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // instancia de Formulario Principal
        formPrincipal principal = new formPrincipal();
        // Propieadad de visibilidad activada
        principal.setVisible(true);
        // cierre del formulario Acceso
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jlCentro;
    private javax.swing.JLabel jlContrsenia;
    private javax.swing.JLabel jlLogo1;
    private javax.swing.JLabel jlLogo2;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPanel jpDerecho;
    private javax.swing.JPanel jpIzquierdo;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
