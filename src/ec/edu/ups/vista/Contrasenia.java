/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import com.sun.glass.events.KeyEvent;
import ec.edu.ups.controlador.ControladorMesa;
import ec.edu.ups.controlador.ControladorMesero;
import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.ClaveGerente;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario-Pc
 */
public class Contrasenia extends javax.swing.JFrame {

    private VistaGerente vistaGerente;
    private ControladorProducto controladorProducto;
    private ControladorMesa controladorMesa;
    private ControladorMesero controladorMesero;
    private ClaveGerente claveGerente;
    private ResourceBundle mensajes;

    /**
     * Creates new form Contrasenia
     */
    public Contrasenia(ControladorProducto controladorProducto,
            ControladorMesero controladorMesero, ControladorMesa controladorMesa,
            ClaveGerente claveGerente, ResourceBundle mensajes) {
        initComponents();
        cambiarIdiomas(mensajes);
        this.setLocationRelativeTo(null);
        this.controladorProducto = controladorProducto;
        this.controladorMesero = controladorMesero;
        this.controladorMesa = controladorMesa;
        this.claveGerente = claveGerente;
        this.mensajes = mensajes;

    }

    public void cambiarIdiomas(ResourceBundle mensajes) {
        lContrasena.setText(mensajes.getString("txt.contraseña"));
        btnIngresar.setText(mensajes.getString("boton.ingresar"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pClave = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        lContrasena = new javax.swing.JLabel();

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        pClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pClaveKeyPressed(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        lContrasena.setText("Contraseña:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(lContrasena)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pClave, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lContrasena))
                .addGap(18, 18, 18)
                .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        char clave[] = pClave.getPassword();
        String clavedef = new String(clave);
        if (vistaGerente == null) {
            if (clavedef.equals(claveGerente.getClave())) {
                this.dispose();
                JOptionPane.showMessageDialog(null, "bienvenido", "Aprobado", JOptionPane.INFORMATION_MESSAGE);
                vistaGerente = new VistaGerente(controladorProducto, controladorMesero, controladorMesa, mensajes);
                vistaGerente.toFront();
                vistaGerente.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Error de clave", "Denegado", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            this.dispose();
            vistaGerente.toFront();
        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void pClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pClaveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            char clave[] = pClave.getPassword();
            String clavedef = new String(clave);
            if (vistaGerente == null || vistaGerente.isVisible() == false) {
                if (clavedef.equals(claveGerente.getClave())) {
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "bienvenido", "Aprobado", JOptionPane.INFORMATION_MESSAGE);
                    vistaGerente = new VistaGerente(controladorProducto, controladorMesero, controladorMesa, mensajes);
                    vistaGerente.toFront();
                    vistaGerente.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Error de clave", "Denegado", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                this.dispose();
                vistaGerente.toFront();
            }
        }
    }//GEN-LAST:event_pClaveKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE && this.isFocused()) {
            this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lContrasena;
    private javax.swing.JPasswordField pClave;
    // End of variables declaration//GEN-END:variables
}
