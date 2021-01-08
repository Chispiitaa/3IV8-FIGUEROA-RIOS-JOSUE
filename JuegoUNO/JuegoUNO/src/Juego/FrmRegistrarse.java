

package Juego;

import javax.swing.JOptionPane;

/**
 *
 * @author Josue
 */
public class FrmRegistrarse extends javax.swing.JFrame {

    /** Creates new form FrmRegistrarse */
    public FrmRegistrarse() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblnombreusuario = new javax.swing.JLabel();
        txtRegistrarUsuarioV = new javax.swing.JTextField();
        lblIDRegistro = new javax.swing.JLabel();
        txtIDRegistrarse = new javax.swing.JTextField();
        txtGuardar = new javax.swing.JButton();
        txtIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("REGISTRARSE");

        lblnombreusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnombreusuario.setText("Ingrese un nombre de usuario:");

        lblIDRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIDRegistro.setText("Ingrese un ID de identificación:");

        txtGuardar.setText("GUARDAR");
        txtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuardarActionPerformed(evt);
            }
        });

        txtIniciar.setText("INICIAR SESIÓN");
        txtIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(151, 151, 151))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblnombreusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRegistrarUsuarioV)
                    .addComponent(lblIDRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIDRegistrarse, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(txtGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(txtIniciar)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo)
                .addGap(37, 37, 37)
                .addComponent(lblnombreusuario)
                .addGap(18, 18, 18)
                .addComponent(txtRegistrarUsuarioV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblIDRegistro)
                .addGap(18, 18, 18)
                .addComponent(txtIDRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGuardar)
                    .addComponent(txtIniciar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuardarActionPerformed
        String usuario = txtRegistrarUsuarioV.getText();
        int ID = Integer.parseInt(txtIDRegistrarse.getText());
        Usuario obj = new Usuario();
        if(Usuario.verificarUsuario(usuario)==-1){
            obj.setUsername(usuario);
        obj.setID(ID);
        Listausuario.agregar(obj);
            JOptionPane.showMessageDialog(this, "EL REGISTRO HA SIDO UN ÉXITO ROTUNDO, JUNTOS PA' LOS UNITES.");
        }else{
            JOptionPane.showMessageDialog(this, "EL USUARIO YA ESTA EN USO, PANITA.");
        }
    }//GEN-LAST:event_txtGuardarActionPerformed

    private void txtIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIniciarActionPerformed
        InicioJuego abrir = new InicioJuego();
        abrir.setVisible(true);
        this.dispose();
        FrmRegistrarse cerrar = new FrmRegistrarse();
        cerrar.setVisible(false);
    }//GEN-LAST:event_txtIniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblIDRegistro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblnombreusuario;
    private javax.swing.JButton txtGuardar;
    private javax.swing.JTextField txtIDRegistrarse;
    private javax.swing.JButton txtIniciar;
    private javax.swing.JTextField txtRegistrarUsuarioV;
    // End of variables declaration//GEN-END:variables

}
