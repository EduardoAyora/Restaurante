/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorMesero;
import ec.edu.ups.modelo.Mesero;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class VentanaEliminarMesero extends javax.swing.JInternalFrame {

    private ControladorMesero controladorMesero;
    private ResourceBundle mensajes;
    private JLabel titulo;
    private String nofound;
    private String bumesero;
    private String elimesero;

    /**
     * Creates new form VentanaEliminarMesero
     */
    public VentanaEliminarMesero(ControladorMesero controladorMesero, ResourceBundle mensajes) {
        titulo = new JLabel(mensajes.getString("mesero.eliminar"));
        initComponents();
        this.controladorMesero = controladorMesero;
        this.mensajes = mensajes;
        cambiarIdiomas(mensajes);
        bEliminar.setEnabled(false);
    }

    public void cambiarIdiomas(ResourceBundle mensajes) {
        titulo.setText(mensajes.getString("mesero.eliminar"));
        nofound = mensajes.getString("option.nomesero");
        bumesero = mensajes.getString("mesero.buscar");
        elimesero = mensajes.getString("option.elimesero");
        lCodigo.setText(mensajes.getString("txt.codigo"));
        lCedula.setText(mensajes.getString("cliente.cedula"));
        lNombre.setText(mensajes.getString("txt.nombre"));
        lDireccion.setText(mensajes.getString("cliente.direccion"));
        lTelefono.setText(mensajes.getString("cliente.telefono"));
        bEliminar.setText(mensajes.getString("boton.eliminar"));
        bBuscar.setText(mensajes.getString("boton.buscar"));
        bCancelar.setText(mensajes.getString("boton.cancelar"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tCodigo = new javax.swing.JTextField();
        lCodigo = new javax.swing.JLabel();
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
        bEliminar = new javax.swing.JButton();

        setTitle(titulo.getText());
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        lCodigo.setText("Código:");

        lCedula.setText("Cédula:");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        lNombre.setText("Nombre:");

        tDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDireccionActionPerformed(evt);
            }
        });

        lDireccion.setText("Dirección:");

        lTelefono.setText("Teléfono:");

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lCodigo)
                                .addGap(18, 18, 18)
                                .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(bBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lCedula, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(tDireccion)
                                    .addComponent(tTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCodigo)
                    .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bEliminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDireccionActionPerformed

    }//GEN-LAST:event_tDireccionActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed

        this.dispose();

    }//GEN-LAST:event_bCancelarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        int cod = Integer.parseInt(tCodigo.getText());
        controladorMesero.delete(cod);
        JOptionPane.showMessageDialog(this,
                elimesero = mensajes.getString("option.elimesero"),
                titulo.getText(), JOptionPane.YES_OPTION);
        tCedula.setText("");
        tNombre.setText("");
        tDireccion.setText("");
        tTelefono.setText("");

    }//GEN-LAST:event_bEliminarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        if (tCodigo.getText().equals("") == false) {
            int cod = Integer.parseInt(tCodigo.getText());
            Mesero buscarMesero = controladorMesero.read(cod);
            if (buscarMesero != null) {
                tCedula.setText(buscarMesero.getCedula());
                tNombre.setText(buscarMesero.getNombre());
                tDireccion.setText(buscarMesero.getDireccion());
                tTelefono.setText(buscarMesero.getTelefono());
                bEliminar.setEnabled(true);
            } else {
                tCedula.setText("");
                tNombre.setText("");
                tDireccion.setText("");
                tTelefono.setText("");
                JOptionPane.showMessageDialog(this,
                        nofound = mensajes.getString("option.nomesero"),
                        bumesero = mensajes.getString("mesero.buscar"),
                        JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error", "Valor", JOptionPane.ERROR_MESSAGE);
            tCedula.setText("");
            tNombre.setText("");
            tDireccion.setText("");
            tTelefono.setText("");
        }
    }//GEN-LAST:event_bBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JLabel lCedula;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lDireccion;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lTelefono;
    private javax.swing.JTextField tCedula;
    private javax.swing.JTextField tCodigo;
    private javax.swing.JTextField tDireccion;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tTelefono;
    // End of variables declaration//GEN-END:variables
}
