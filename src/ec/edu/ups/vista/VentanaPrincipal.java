/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.vista.mesero.VistaMesero;
import ec.edu.ups.controlador.ControladorMesa;
import ec.edu.ups.controlador.ControladorProducto;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author DELL
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ControladorMesa controladorMesa;
    private ControladorProducto controladorProducto;
    private VistaMesero vistaMesero;
    private Contrasenia contrasenia;
    private VistaCaja vistaCaja;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        controladorMesa = new ControladorMesa();
        controladorProducto = new ControladorProducto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGerente = new javax.swing.JButton();
        bCaja = new javax.swing.JButton();
        bMesero = new javax.swing.JButton();
        lGerente = new javax.swing.JLabel();
        lCaja = new javax.swing.JLabel();
        lMesero = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opPass = new javax.swing.JMenuItem();
        opAyuda = new javax.swing.JMenuItem();
        opSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurante");
        setResizable(false);

        bGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/gerenteR.png"))); // NOI18N
        bGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGerenteActionPerformed(evt);
            }
        });

        bCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/cajaR.png"))); // NOI18N
        bCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCajaActionPerformed(evt);
            }
        });

        bMesero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/meseroR.png"))); // NOI18N
        bMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMeseroActionPerformed(evt);
            }
        });

        lGerente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lGerente.setText("Gerente");

        lCaja.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lCaja.setText("Caja");

        lMesero.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lMesero.setText("Mesero");

        jMenu1.setText("Ajustes");

        opPass.setText("Administrar contraseñas");
        jMenu1.add(opPass);

        opAyuda.setText("Ayuda");
        jMenu1.add(opAyuda);

        opSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        opSalir.setText("Salir");
        opSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSalirActionPerformed(evt);
            }
        });
        jMenu1.add(opSalir);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lGerente)
                .addGap(88, 88, 88)
                .addComponent(lCaja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lMesero)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lGerente)
                    .addComponent(lCaja)
                    .addComponent(lMesero))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGerenteActionPerformed
        if (contrasenia == null || contrasenia.isVisible() == false) {
            contrasenia = new Contrasenia();
            contrasenia.toFront();
            contrasenia.setVisible(true);
        } else {
            contrasenia.toFront();
        }
    }//GEN-LAST:event_bGerenteActionPerformed

    private void bCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCajaActionPerformed
        if (vistaCaja == null || vistaCaja.isVisible() == false) {
            vistaCaja = new VistaCaja();
            vistaCaja.toFront();
            vistaCaja.setVisible(true);
        } else {
            vistaCaja.toFront();
        }
    }//GEN-LAST:event_bCajaActionPerformed

    private void bMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMeseroActionPerformed
        if (vistaMesero == null || vistaMesero.isVisible() == false) {
            vistaMesero = new VistaMesero(controladorMesa);
            vistaMesero.toFront();
            vistaMesero.setVisible(true);
        } else {
            vistaMesero.toFront();
        }
    }//GEN-LAST:event_bMeseroActionPerformed

    private void opSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCaja;
    private javax.swing.JButton bGerente;
    private javax.swing.JButton bMesero;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lCaja;
    private javax.swing.JLabel lGerente;
    private javax.swing.JLabel lMesero;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem opAyuda;
    private javax.swing.JMenuItem opPass;
    private javax.swing.JMenuItem opSalir;
    // End of variables declaration//GEN-END:variables

}
