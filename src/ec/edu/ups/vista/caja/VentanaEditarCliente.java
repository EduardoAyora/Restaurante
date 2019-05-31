/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.caja;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class VentanaEditarCliente extends javax.swing.JInternalFrame {

    private ControladorCliente controladorCliente;
    private ResourceBundle mensajes;

    /**
     * Creates new form VentanaEditarMesero
     */
    public VentanaEditarCliente(ControladorCliente controladorCliente, ResourceBundle mensajes) {
        initComponents();
        this.controladorCliente = controladorCliente;
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
    }

    public void cambiarIdioma(ResourceBundle mensajes) {

        bBuscar.setText(mensajes.getString("boton.buscar"));
        lNombre.setText(mensajes.getString("txt.nombre"));
        lCedula.setText(mensajes.getString("cliente.cedula"));
        lDireccion.setText(mensajes.getString("cliente.direccion"));
        lTelefono.setText(mensajes.getString("cliente.telefono"));
        lEmail.setText(mensajes.getString("txt.correo"));
        bCancelar.setText(mensajes.getString("boton.cancelar"));
        bActualizar.setText(mensajes.getString("boton.actualizar"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lCedula = new javax.swing.JLabel();
        tCedula = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        lNombre = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        tDireccion = new javax.swing.JTextField();
        lDireccion = new javax.swing.JLabel();
        lTelefono = new javax.swing.JLabel();
        tTelefono = new javax.swing.JTextField();
        bCancelar = new javax.swing.JButton();
        bActualizar = new javax.swing.JButton();
        lEmail = new javax.swing.JLabel();
        tCorreo = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Editar cliente");

        lCedula.setText("Cédula:");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        lNombre.setText("Nombre:");

        lDireccion.setText("Dirección:");

        lTelefono.setText("Teléfono:");

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bActualizar.setText("Actualizar");
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

        lEmail.setText("E-mail:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(bCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lCedula, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(tDireccion)
                                .addComponent(tTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bBuscar)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lEmail)
                .addGap(18, 18, 18)
                .addComponent(tCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
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
                    .addComponent(tCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bActualizar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
        tNombre.setText("");
        tCedula.setText("");
        tDireccion.setText("");
        tTelefono.setText("");
        lEmail.setText("");
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
                tCorreo.setText(cliente.getCorreo());
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

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        // TODO add your handling code here:
        Cliente cliente = controladorCliente.readCedula(tCedula.getText());
        cliente.setNombre(tNombre.getText());
        cliente.setDireccion(tDireccion.getText());
        cliente.setTelefono(tTelefono.getText());
        cliente.setCorreo(tCorreo.getText());
        controladorCliente.update(cliente);
        tNombre.setText("");
        tCedula.setText("");
        tDireccion.setText("");
        tTelefono.setText("");
        tCorreo.setText("");
        JOptionPane.showMessageDialog(this, "Cliente Actualizado Exitosamente", "Actualizar cliente", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_bActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JLabel lCedula;
    private javax.swing.JLabel lDireccion;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lTelefono;
    private javax.swing.JTextField tCedula;
    private javax.swing.JTextField tCorreo;
    private javax.swing.JTextField tDireccion;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tTelefono;
    // End of variables declaration//GEN-END:variables
}
