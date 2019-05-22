/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorMesa;
import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.vista.mesero.EscogerMesero;
import ec.edu.ups.modelo.ImagenFondo;
import ec.edu.ups.vista.mesero.VistaMesero;
import java.awt.Dimension;

/**
 *
 * @author DELL
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ControladorMesa controladorMesa;
    private ControladorProducto controladorProducto;
    private VistaMesero vistaMesero;
    /**
     * Creates new form VentanaPrincipal MODIGICSACION DFEFJEJRF 
     */
    public VentanaPrincipal() {
        initComponents();
        desktopPane.setBorder(new ImagenFondo());
        this.setExtendedState(VentanaPrincipal.MAXIMIZED_BOTH);
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menIniciar = new javax.swing.JMenu();
        opGerente = new javax.swing.JMenuItem();
        opMesero = new javax.swing.JMenuItem();
        opCaja = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        menIniciar.setMnemonic('f');
        menIniciar.setText("Iniciar");

        opGerente.setMnemonic('o');
        opGerente.setText("Gerente");
        opGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGerenteActionPerformed(evt);
            }
        });
        menIniciar.add(opGerente);

        opMesero.setMnemonic('s');
        opMesero.setText("Mesero");
        opMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMeseroActionPerformed(evt);
            }
        });
        menIniciar.add(opMesero);

        opCaja.setText("Caja");
        opCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCajaActionPerformed(evt);
            }
        });
        menIniciar.add(opCaja);

        menuBar.add(menIniciar);

        jMenu1.setText("Ajustes");

        jMenuItem1.setText("Ayuda");
        jMenu1.add(jMenuItem1);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1579, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMeseroActionPerformed
        VistaMesero visMesero = new VistaMesero(controladorMesa);
        visMesero.setVisible(true);
        desktopPane.add(visMesero);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = visMesero.getSize();
        visMesero.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_opMeseroActionPerformed

    private void opCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCajaActionPerformed

    }//GEN-LAST:event_opCajaActionPerformed

    private void opGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opGerenteActionPerformed
        VistaGerente visGerente = new VistaGerente();
        visGerente.setVisible(true);
        desktopPane.add(visGerente);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = visGerente.getSize();
        visGerente.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }//GEN-LAST:event_opGerenteActionPerformed

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
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menIniciar;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem opCaja;
    private javax.swing.JMenuItem opGerente;
    private javax.swing.JMenuItem opMesero;
    // End of variables declaration//GEN-END:variables

}
