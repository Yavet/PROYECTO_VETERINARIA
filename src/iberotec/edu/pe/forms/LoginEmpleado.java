/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iberotec.edu.pe.forms;

import iberotec.edu.pe.Clases.LoginEmpleadoBD;
import iberotec.edu.pe.Clases.Sonido;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Yavet
 */
public class LoginEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form ConectadoBD
     */
    public LoginEmpleado() {
        initComponents();
        setTitle("Veterinaria Y y Y");
        setResizable(false);
        setLocationRelativeTo(null);
        Sonido sonido = new Sonido(this.btnAtras);
        Sonido sonido1 = new Sonido( this.btnSalir);
        Sonido sonido2 = new Sonido( this.btnLogin);
        Sonido sonido3 = new Sonido( this.txtUser );
        Sonido sonido4 = new Sonido( this.txtPassword );
        Sonido sonido5 = new Sonido( this.lblUser );
        Sonido sonido6 = new Sonido( this.lblPassword );
        Sonido sonido7 = new Sonido( this.lblTitle );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanelBeanInfo1 = new jcMousePanel.jcMousePanelBeanInfo();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        lblTitle = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnSalir = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jcMousePanel2 = new jcMousePanel.jcMousePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back1.jpg"))); // NOI18N

        lblTitle.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        lblTitle.setText("Iniciar Sesión Empleado");

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.jpg"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUser.setText("Nombre :");
        lblUser.setToolTipText("");

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPassword.setText("Contraseña :");

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/door_in.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        btnLogin.setToolTipText("");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jcMousePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/medico.jpg"))); // NOI18N

        javax.swing.GroupLayout jcMousePanel2Layout = new javax.swing.GroupLayout(jcMousePanel2);
        jcMousePanel2.setLayout(jcMousePanel2Layout);
        jcMousePanel2Layout.setHorizontalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );
        jcMousePanel2Layout.setVerticalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(57, 57, 57))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                .addComponent(jcMousePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                                .addComponent(lblPassword)
                                                .addGap(56, 56, 56)
                                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                                .addComponent(lblUser)
                                                .addGap(88, 88, 88)
                                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitle)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUser)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAtras)
                            .addComponent(btnSalir))
                        .addGap(37, 37, 37))
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jcMousePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void login(){
        LoginEmpleadoBD metodoslogin = new LoginEmpleadoBD();
    
    if(metodoslogin.login()==1){
        RegistroEmpleados login = new RegistroEmpleados();
        login.setVisible(true);
        dispose();
    }
    else{
        JOptionPane.showMessageDialog(null, "Acceso denegado:\n Por favor ingrese un usuario y/o contraseña correctos", "Acceso denegado",JOptionPane.ERROR_MESSAGE);
        txtPassword.setText("");
        txtUser.setText("");
    } 
    }
    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
                if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                        login();
                    }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
                SeleccionModoUso volver = new SeleccionModoUso();
                volver.setVisible(true);
                 dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
         login();
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LoginEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFelblTitletion ex) {
//            java.util.logging.Logger.getLogger(LoginEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LoginEmpleado().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel2;
    private jcMousePanel.jcMousePanelBeanInfo jcMousePanelBeanInfo1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    public static javax.swing.JPasswordField txtPassword;
    public static javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
