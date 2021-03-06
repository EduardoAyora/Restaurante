/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.mesero;

import ec.edu.ups.controlador.ControladorMesa;
import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Mesa;
import ec.edu.ups.modelo.Mesero;
import ec.edu.ups.vista.VentanaPrincipal;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JButton;

/**
 *
 * @author Eduardo Ayora
 */
public class AbrirMesa extends javax.swing.JFrame {

    private List<JButton> botones;
    private ControladorMesa controladorMesa;
    private Mesero mesero;
    private ControladorProducto controladorProducto;
    private ResourceBundle mensajes;

    /**
     * Creates new form ListaMesa
     */
    public AbrirMesa(ResourceBundle mensajes) {
        initComponents();
        this.setLocationRelativeTo(null);
        botones = new ArrayList<>();
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
    }

    public void cambiarIdioma(ResourceBundle mensajes) {

        btnCancelar.setText(mensajes.getString("btn.cancelar"));

    }
    
    public void reiniciar(){
        
        VentanaPrincipal.usuarioMesero.vistaMesero.abrirMesa = new AbrirMesa(mensajes);
        VentanaPrincipal.usuarioMesero.vistaMesero.abrirMesa.setVisible(true);
        VentanaPrincipal.usuarioMesero.vistaMesero.abrirMesa.setMesas(controladorMesa, mesero, controladorProducto);
        this.dispose();
        
    }

    public void setMesas(ControladorMesa controladorMesa, Mesero mesero, ControladorProducto controladorProducto) {
        this.controladorMesa = controladorMesa;
        this.mesero = mesero;
        this.controladorProducto = controladorProducto;
        agregarBotones();
    }

    public void agregarBotones() {
        Font fuente = new Font("arial", Font.PLAIN, 35);
        for (int i = 0; i < controladorMesa.getLista().size(); i++) {
            if (controladorMesa.getLista().get(i).isMesaAbierta()) {
                JButton btn = new JButton(mensajes.getString("txt.mesa") + " "
                        + Integer.toString(controladorMesa.getLista().get(i).getNumeroMesa()));
                btn.setName(Integer.toString(i));
                btn.setFont(fuente);
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String texto = btn.getName();
                        int numero = Integer.parseInt(texto);
                        Mesa mesa = controladorMesa.getLista().get(numero);
                        mesa.setMesaAbierta(false);
                        mesero.getMesas().add(mesa);
                        mesa.setMesero(mesero);
                        VentanaPrincipal.usuarioMesero.vistaMesero = new VistaMesero(mesero, controladorMesa, controladorProducto, mensajes);
                        VentanaPrincipal.usuarioMesero.vistaMesero.setVisible(true);
                        dispose();
                    }
                });
                panel.add(btn);
                botones.add(btn);
            }
        }
        panel.updateUI();
    }

    public void setMensajes(ResourceBundle mensajes) {
        this.mensajes = mensajes;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setLayout(new java.awt.GridLayout(2, 1));
        jScrollPane1.setViewportView(panel);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        VentanaPrincipal.usuarioMesero.vistaMesero = new VistaMesero(mesero, controladorMesa, controladorProducto, mensajes);
        VentanaPrincipal.usuarioMesero.vistaMesero.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
