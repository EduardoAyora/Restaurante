/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class VentanaCrearCliente extends javax.swing.JInternalFrame {
    
    private ControladorCliente controladorCliente;
    /**
     * Creates new form VentanaCrearMesero
     */
    public VentanaCrearCliente(ControladorCliente controladorCliente) {
        initComponents();
        this.controladorCliente=controladorCliente;
        tCodigo.setText(Integer.toString(this.controladorCliente.getCodigo()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lCodigo = new javax.swing.JLabel();
        lCedula = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        lDireccion = new javax.swing.JLabel();
        lTelefono = new javax.swing.JLabel();
        lEmail = new javax.swing.JLabel();
        tCodigo = new javax.swing.JTextField();
        tNombre = new javax.swing.JTextField();
        tCedula = new javax.swing.JTextField();
        tTelefono = new javax.swing.JTextField();
        tDireccion = new javax.swing.JTextField();
        tEmail = new javax.swing.JTextField();
        bCancelar = new javax.swing.JButton();
        bCrear = new javax.swing.JButton();

        setClosable(true);
        setTitle("Crear cliente");

        lCodigo.setText("Código:");

        lCedula.setText("Cédula:");

        lNombre.setText("Nombre:");

        lDireccion.setText("Dirección:");

        lTelefono.setText("Teléfono:");

        lEmail.setText("E-mail:");

        tCodigo.setEditable(false);

        tDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDireccionActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bCrear.setText("Crear");
        bCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lCodigo)
                    .addComponent(lDireccion)
                    .addComponent(lNombre)
                    .addComponent(lTelefono)
                    .addComponent(lCedula)
                    .addComponent(lEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addComponent(tDireccion)
                        .addComponent(tEmail)
                        .addComponent(tTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCancelar)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCodigo)
                    .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCedula)
                    .addComponent(tCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bCrear))
                .addContainerGap())
        );

        lCodigo.getAccessibleContext().setAccessibleName("lbCodigo");
        lCodigo.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleName("vCrearMesero");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDireccionActionPerformed

    }//GEN-LAST:event_tDireccionActionPerformed

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearActionPerformed
        // TODO add your handling code here:
        Cliente cliente=new Cliente();
        cliente.setNombre(tNombre.getText());
        cliente.setCedula(tCedula.getText());
        cliente.setDireccion(tDireccion.getText());
        cliente.setTelefono(tTelefono.getText());
        cliente.setCorreo(tEmail.getText());
        tNombre.setText("");
        tCedula.setText("");
        tDireccion.setText("");
        tTelefono.setText("");
        tEmail.setText("");
        controladorCliente.create(cliente);
        tCodigo.setText(Integer.toString(this.controladorCliente.getCodigo()));
        JOptionPane.showMessageDialog(this, "Cliente creado exitosamente", "Crear cliente", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_bCrearActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bCrear;
    private javax.swing.JLabel lCedula;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lDireccion;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lTelefono;
    private javax.swing.JTextField tCedula;
    private javax.swing.JTextField tCodigo;
    private javax.swing.JTextField tDireccion;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tTelefono;
    // End of variables declaration//GEN-END:variables
}
