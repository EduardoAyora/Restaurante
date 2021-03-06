/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.gerente;

import ec.edu.ups.controlador.ControladorMesa;
import ec.edu.ups.modelo.Mesa;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class VentanaEliminarMesa extends javax.swing.JInternalFrame {

    private ControladorMesa controladorMesa;
    private ResourceBundle mensajes;
    private JLabel titulo;
    private String bumesa;
    private String nofound;
    private String elimesa;

    /**
     * Creates new form VentanaEliminarMesa
     */
    public VentanaEliminarMesa(ControladorMesa controladorMesa, ResourceBundle mensajes) {
        titulo = new JLabel(mensajes.getString("mesa.eliminar"));
        initComponents();
        this.controladorMesa = controladorMesa;
        this.mensajes = mensajes;
        cambiarIdiomas(mensajes);
        bEliminar.setEnabled(false);
    }

    public void cambiarIdiomas(ResourceBundle mensajes) {
        titulo.setText(mensajes.getString("mesa.eliminar"));
        bumesa = mensajes.getString("mesa.buscar");
        nofound = mensajes.getString("option.nomesa");
        elimesa = mensajes.getString("option.elimesa");
        lNumero.setText(mensajes.getString("txt.numero.mesa"));
        lCapacidad.setText(mensajes.getString("txt.capacidad"));
        bBuscar.setText(mensajes.getString("boton.buscar"));
        bEliminar.setText(mensajes.getString("boton.eliminar"));
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

        tNumero = new javax.swing.JTextField();
        lNumero = new javax.swing.JLabel();
        lCapacidad = new javax.swing.JLabel();
        tCapacidad = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();

        setTitle(titulo.getText());
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        lNumero.setText("Número de mesa:");

        lCapacidad.setText("Capacidad:");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lNumero)
                            .addComponent(lCapacidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bBuscar))
                            .addComponent(tCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
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
                    .addComponent(lNumero)
                    .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCapacidad)
                    .addComponent(tCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bEliminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        int cod = Integer.parseInt(tNumero.getText());
        controladorMesa.delete(cod);
        JOptionPane.showMessageDialog(this,
                elimesa = mensajes.getString("option.elimesa"),
                titulo.getText(), JOptionPane.YES_OPTION);
        tNumero.setText("");
        tCapacidad.setText("");

    }//GEN-LAST:event_bEliminarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        if (tNumero.getText().equals("") == false) {
            int cod = Integer.parseInt(tNumero.getText());
            Mesa buscarMesa = controladorMesa.read(cod);
            if (buscarMesa != null) {
                tCapacidad.setText(String.valueOf(buscarMesa.getCapacidad()));
                bEliminar.setEnabled(true);
            } else {
                tCapacidad.setText("");
                JOptionPane.showMessageDialog(this, nofound = mensajes.getString("option.nomesa"), bumesa = mensajes.getString("mesa.buscar"), JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error", "Valor", JOptionPane.ERROR_MESSAGE);
            tCapacidad.setText("");
        }
    }//GEN-LAST:event_bBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JLabel lCapacidad;
    private javax.swing.JLabel lNumero;
    private javax.swing.JTextField tCapacidad;
    private javax.swing.JTextField tNumero;
    // End of variables declaration//GEN-END:variables
}
