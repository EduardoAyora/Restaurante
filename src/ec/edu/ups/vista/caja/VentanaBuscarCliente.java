/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.caja;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class VentanaBuscarCliente extends javax.swing.JInternalFrame {

    private ControladorCliente controladorCliente;
    private ResourceBundle mensajes;

    /**
     * Creates new form VentanaBuscarMesero
     */
    public VentanaBuscarCliente(ControladorCliente controladorCliente,ResourceBundle mensajes) {
        
        this.controladorCliente = controladorCliente;
        this.mensajes=mensajes;
        initComponents();
        cambiarIdioma(mensajes);
        
    }
     public void cambiarIdioma(ResourceBundle mensajes){
        
        titulo.setText(mensajes.getString("titulo.cliente.buscar"));   
        lNombre.setText(mensajes.getString("txt.nombre"));
        lCedula.setText(mensajes.getString("cliente.cedula"));
        lDireccion.setText(mensajes.getString("cliente.direccion"));
        lTelefono.setText(mensajes.getString("cliente.telefono"));
        lEmail.setText(mensajes.getString("txt.correo"));
        bCancelar.setText(mensajes.getString("boton.cancelar"));
        bBuscar.setText(mensajes.getString("boton.buscar"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        tCedula = new javax.swing.JTextField();
        lCedula = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        lDireccion = new javax.swing.JLabel();
        lTelefono = new javax.swing.JLabel();
        tTelefono = new javax.swing.JTextField();
        tDireccion = new javax.swing.JTextField();
        tNombre = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        lEmail = new javax.swing.JLabel();
        tEmail = new javax.swing.JTextField();

        titulo.setText(mensajes.getString("titulo.cliente.buscar")
        );

        setClosable(true);
        setTitle(titulo.getText());
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        lCedula.setText("Cédula:");

        lNombre.setText("Nombre:");

        lDireccion.setText("Dirección:");

        lTelefono.setText("Teléfono:");

        tTelefono.setEditable(false);

        tDireccion.setEditable(false);

        tNombre.setEditable(false);

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        lEmail.setText("E-mail:");

        tEmail.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lCedula, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tNombre)
                                        .addComponent(tDireccion)
                                        .addComponent(tTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bBuscar))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lEmail)
                                .addGap(18, 18, 18)
                                .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(bCancelar)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCedula)
                    .addComponent(tCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombre)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDireccion)
                    .addComponent(tDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTelefono)
                    .addComponent(tTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEmail)
                    .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(bCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        tNombre.setText("");
        tCedula.setText("");
        tDireccion.setText("");
        tTelefono.setText("");
        tEmail.setText("");
        this.dispose();

    }//GEN-LAST:event_bCancelarActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        if (tCedula.getText().equals("") == false) {
            String cedula = tCedula.getText();
            Cliente cliente = controladorCliente.readCedula(cedula);
            if (cliente != null) {
                tNombre.setText(cliente.getNombre());
                tDireccion.setText(cliente.getDireccion());
                tTelefono.setText(cliente.getTelefono());
                tEmail.setText(cliente.getCorreo());
            } else {
                JOptionPane.showMessageDialog(this, "Error", "Valor", JOptionPane.ERROR_MESSAGE);
                tNombre.setText("");
                tCedula.setText("");
                tDireccion.setText("");
                tTelefono.setText("");
                lEmail.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error", "Valor", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JLabel lCedula;
    private javax.swing.JLabel lDireccion;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lTelefono;
    private javax.swing.JTextField tCedula;
    private javax.swing.JTextField tDireccion;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tTelefono;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
