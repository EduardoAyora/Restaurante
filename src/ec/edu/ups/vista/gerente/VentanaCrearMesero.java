/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.gerente;

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
public class VentanaCrearMesero extends javax.swing.JInternalFrame {

    private ControladorMesero controladorMesero;
    private ResourceBundle mensajes;
    private JLabel titulo;
    private String exito;

    /**
     * Creates new form VentanaCrearMesero
     */
    public VentanaCrearMesero(ControladorMesero controladorMesero, ResourceBundle mensajes) {
        titulo = new JLabel(mensajes.getString("mesero.crear"));
        this.controladorMesero = controladorMesero;
        this.mensajes = mensajes;
        initComponents();
        cambiarIdiomas(mensajes);
        tCodigo.setText(String.valueOf(this.controladorMesero.getCod()));

    }

    public void cambiarIdiomas(ResourceBundle mensajes) {
        titulo.setText(mensajes.getString("mesero.crear"));
        exito = mensajes.getString("option.exitomesero");
        lCodigo.setText(mensajes.getString("txt.codigo"));
        lCedula.setText(mensajes.getString("cliente.cedula"));
        lNombre.setText(mensajes.getString("txt.nombre"));
        lDireccion.setText(mensajes.getString("cliente.direccion"));
        lTelefono.setText(mensajes.getString("cliente.telefono"));
        lContrasena.setText(mensajes.getString("txt.contraseña"));
        bCrear.setText(mensajes.getString("boton.crear"));
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

        lCodigo = new javax.swing.JLabel();
        lCedula = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        lDireccion = new javax.swing.JLabel();
        lTelefono = new javax.swing.JLabel();
        lContrasena = new javax.swing.JLabel();
        tCodigo = new javax.swing.JTextField();
        tNombre = new javax.swing.JTextField();
        tCedula = new javax.swing.JTextField();
        tTelefono = new javax.swing.JTextField();
        tDireccion = new javax.swing.JTextField();
        tContrasena = new javax.swing.JTextField();
        bCancelar = new javax.swing.JButton();
        bCrear = new javax.swing.JButton();

        setClosable(true);
        setTitle(titulo.getText());
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        lCodigo.setText("Código:");

        lCedula.setText("Cédula:");

        lNombre.setText("Nombre:");

        lDireccion.setText("Dirección:");

        lTelefono.setText("Teléfono:");

        lContrasena.setText("Contraseña:");

        tCodigo.setEditable(false);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lCodigo)
                        .addGap(18, 18, 18)
                        .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lContrasena)
                            .addComponent(lDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lCedula, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(tDireccion)
                            .addComponent(tTelefono)
                            .addComponent(tContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCancelar)
                .addContainerGap())
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
                    .addComponent(lContrasena)
                    .addComponent(tContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void bCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearActionPerformed
        Mesero mesero = new Mesero();
        mesero.setCodigo(Integer.parseInt(tCodigo.getText()));
        mesero.setCedula(tCedula.getText());
        mesero.setNombre(tNombre.getText());
        mesero.setDireccion(tDireccion.getText());
        mesero.setTelefono(tTelefono.getText());
        mesero.setContraseña(tContrasena.getText());
        controladorMesero.create(mesero);
        JOptionPane.showMessageDialog(this, exito = mensajes.getString("option.exitomesero"), titulo.getText(), JOptionPane.OK_OPTION);
        tCodigo.setText(String.valueOf(this.controladorMesero.getCod()));
        tCedula.setText("");
        tNombre.setText("");
        tDireccion.setText("");
        tTelefono.setText("");
        tContrasena.setText("");
    }//GEN-LAST:event_bCrearActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bCrear;
    private javax.swing.JLabel lCedula;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lContrasena;
    private javax.swing.JLabel lDireccion;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lTelefono;
    private javax.swing.JTextField tCedula;
    private javax.swing.JTextField tCodigo;
    private javax.swing.JTextField tContrasena;
    private javax.swing.JTextField tDireccion;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tTelefono;
    // End of variables declaration//GEN-END:variables
}