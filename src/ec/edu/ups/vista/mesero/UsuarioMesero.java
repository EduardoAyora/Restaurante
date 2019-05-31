/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.mesero;

import com.sun.glass.events.KeyEvent;
import ec.edu.ups.controlador.ControladorMesa;
import ec.edu.ups.controlador.ControladorMesero;
import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Mesero;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Ayora
 */
public class UsuarioMesero extends javax.swing.JFrame {

    private ControladorMesero controladorMesero;
    private ControladorMesa controladorMesa;
    private ControladorProducto controladorProducto;
    public static VistaMesero vistaMesero;
    private ResourceBundle mensajes;

    /**
     * Creates new form EscogerMesero
     */
    public UsuarioMesero(ControladorMesero controladorMesero, ControladorMesa controladorMesa, ControladorProducto controladorProducto, ResourceBundle mensajes) {
        initComponents();
        this.controladorMesa = controladorMesa;
        this.controladorMesero = controladorMesero;
        this.controladorProducto = controladorProducto;
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
        setLocationRelativeTo(null);
    }

    public void cambiarIdioma(ResourceBundle mensajes) {

        lblMesero.setText(mensajes.getString("txt.mesero") + ":");
        lblCodigo.setText(mensajes.getString("txt.codigo"));
        lblContraseña.setText(mensajes.getString("txt.contraseña"));
        btnAceptar.setText(mensajes.getString("btn.aceptar"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        lblMesero = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCodigo.setText("Código:");

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });

        lblContraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblContraseña.setText("Contraseña:");

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceptar);

        lblMesero.setText("Mesero:");

        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(txtContraseña))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMesero)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMesero)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(txtContraseña))))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        String aprob;
        String deneg;
        String bienvenido;
        String errorPass;
        if (txtCodigo.getText().equals("") == false) {
            String pass = "";
            char[] password = txtContraseña.getPassword();
            for (int i = 0; i < password.length; i++) {
                pass += password[i];
            }
            int codigo = Integer.parseInt(txtCodigo.getText());
            Mesero mesero = controladorMesero.read(codigo);
            if (pass.equals(mesero.getContraseña())) {
                JOptionPane.showMessageDialog(null, bienvenido = mensajes.getString("option.bienvenido"), aprob = mensajes.getString("option.aprobado"), JOptionPane.INFORMATION_MESSAGE);
                vistaMesero = new VistaMesero(mesero, controladorMesa, controladorProducto, mensajes);
                vistaMesero.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña no es correcta", "Contraseña incorrecta", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, errorPass = mensajes.getString("option.errorpass"), deneg = mensajes.getString("option.denegado"), JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        // TODO add your handling code here:
        try {
            lblNombre.setText(controladorMesero.read(Integer.parseInt(txtCodigo.getText())).getNombre());
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_txtCodigoFocusLost

    private void txtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtCodigo.getText().equals("") == false) {
                String pass = "";
                char[] password = txtContraseña.getPassword();
                for (int i = 0; i < password.length; i++) {
                    pass += password[i];
                }
                int codigo = Integer.parseInt(txtCodigo.getText());
                Mesero mesero = controladorMesero.read(codigo);
                if (pass.equals(mesero.getContraseña())) {
                    JOptionPane.showMessageDialog(null, "Bienvenido", "Contraseña correcta", JOptionPane.INFORMATION_MESSAGE);
                    vistaMesero = new VistaMesero(mesero, controladorMesa, controladorProducto, mensajes);
                    vistaMesero.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña no es correcta", "Contraseña incorrecta", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error", "Valor", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtContraseñaKeyPressed

    public void setMensajes(ResourceBundle mensajes) {
        this.mensajes = mensajes;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblMesero;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JPasswordField txtContraseña;
    // End of variables declaration//GEN-END:variables
}
