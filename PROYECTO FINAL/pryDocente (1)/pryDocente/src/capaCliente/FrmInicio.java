/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaCliente;

import capaDatos.ListaUsuario;
import capaLogica.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue
 */
public class FrmInicio extends javax.swing.JFrame {

   
    
    
    
    public FrmInicio() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEtiquetaTitulo = new javax.swing.JLabel();
        lblInicioN = new javax.swing.JLabel();
        lblInicioC = new javax.swing.JLabel();
        txtInicioN = new javax.swing.JTextField();
        txtInicioC = new javax.swing.JPasswordField();
        btnInicio = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEtiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEtiquetaTitulo.setText("INICIO DE SESIÓN");
        getContentPane().add(lblEtiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 0, -1, -1));

        lblInicioN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblInicioN.setText("Introduce tu nombre de usuario:");
        getContentPane().add(lblInicioN, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        lblInicioC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblInicioC.setText("Introduce tu contraseña:");
        getContentPane().add(lblInicioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));
        getContentPane().add(txtInicioN, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 200, -1));
        getContentPane().add(txtInicioC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 200, -1));

        btnInicio.setBackground(new java.awt.Color(204, 204, 204));
        btnInicio.setText("INICIAR SESION");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 160, 50));

        btnRegistro.setText("REGISTRARSE");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 120, 30));

        jLabel2.setText("¿Eres nuevo? Da click en el boton de abajo para crearse un usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sin título.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -20, 430, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInicio.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1540, -480, 1970, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        FrmRegistro abrir = new FrmRegistro();
        abrir.setVisible(true);
        this.dispose();
        FrmInicio cerrar = new FrmInicio();
        cerrar.setVisible(false);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        
    }//GEN-LAST:event_btnInicioActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblEtiquetaTitulo;
    private javax.swing.JLabel lblInicioC;
    private javax.swing.JLabel lblInicioN;
    private javax.swing.JPasswordField txtInicioC;
    private javax.swing.JTextField txtInicioN;
    // End of variables declaration//GEN-END:variables
}