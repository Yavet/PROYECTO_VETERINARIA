/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iberotec.edu.pe.forms;

import com.sun.awt.AWTUtilities;
import iberotec.edu.pe.Clases.ConexionBD;
import iberotec.edu.pe.Clases.ProgresoCarga;
import java.awt.Color;

/**
 *
 * @author Yavet
 */
public class Principal extends javax.swing.JFrame {
    ProgresoCarga hilo;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        setTitle("Inicialisando ...");
        setLocationRelativeTo(null);
        setResizable(false);
        
        iniciarSplash();
         hilo = new ProgresoCarga(pbProgreso);
        //Iniciamos el Hilo
        hilo.start();
        //Liberamos recursos
        hilo = null;
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
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        pbProgreso = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VETERINARIA.png"))); // NOI18N

        pbProgreso.setBackground(new java.awt.Color(255, 255, 0));
        pbProgreso.setForeground(new java.awt.Color(255, 0, 0));
        pbProgreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pbProgresoStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(pbProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap(332, Short.MAX_VALUE)
                .addComponent(pbProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void iniciarSplash() {
        this.getjProgressBar1().setBorderPainted(true);
        this.getjProgressBar1().setForeground(new Color(25, 1, 1));//color del progreso que abansa
        this.getjProgressBar1().setBackground(new Color(255,128,0));//color de fondo del progreso 
        this.getjProgressBar1().setStringPainted(true);
    }
    private void pbProgresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pbProgresoStateChanged
        // TODO add your handling code here:
         ConexionBD cone = new ConexionBD();
        if (pbProgreso.getValue()==100){
            if (cone.conexion() != null){
            SeleccionModoUso conectado = new SeleccionModoUso();
            conectado.setVisible(true);
            dispose();
            } 
            else{
                dispose();
            }
        }
    }//GEN-LAST:event_pbProgresoStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanelBeanInfo jcMousePanelBeanInfo1;
    private javax.swing.JProgressBar pbProgreso;
    // End of variables declaration//GEN-END:variables
public javax.swing.JProgressBar getjProgressBar1() {
        return pbProgreso;
    }
}
