/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.ImagenFondoCaja;
import java.awt.event.KeyEvent;

/**
 *
 * @author DELL
 */
public class VistaCaja extends javax.swing.JFrame {
    VentanaCrearCliente crearCliente;
    VentanaBuscarCliente buscarCliente;
    VentanaEditarCliente editarCliente;
    VentanaEliminarCliente eliminarCliente;
    VentanaListaCliente listaCliente;
    
    /**
     * Creates new form VistaCaja
     */
    public VistaCaja() {
        initComponents();
        jDesktopPane1.setBorder(new ImagenFondoCaja());
        this.setExtendedState(VistaCaja.MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menMesero1 = new javax.swing.JMenu();
        opCrearCli = new javax.swing.JMenuItem();
        opReadCli = new javax.swing.JMenuItem();
        opUpdateCli = new javax.swing.JMenuItem();
        opDeleteCli = new javax.swing.JMenuItem();
        opListCli = new javax.swing.JMenuItem();
        menMesero2 = new javax.swing.JMenu();
        opCrearFac = new javax.swing.JMenuItem();
        opReadFac = new javax.swing.JMenuItem();
        opAnularFac = new javax.swing.JMenuItem();
        opListFac = new javax.swing.JMenuItem();

        setTitle("Gestión de Caja");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        menMesero1.setText("Cliente");

        opCrearCli.setText("Nuevo");
        opCrearCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCrearCliActionPerformed(evt);
            }
        });
        menMesero1.add(opCrearCli);

        opReadCli.setText("Buscar");
        opReadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opReadCliActionPerformed(evt);
            }
        });
        menMesero1.add(opReadCli);

        opUpdateCli.setText("Editar");
        opUpdateCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opUpdateCliActionPerformed(evt);
            }
        });
        menMesero1.add(opUpdateCli);

        opDeleteCli.setText("Eliminar");
        opDeleteCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDeleteCliActionPerformed(evt);
            }
        });
        menMesero1.add(opDeleteCli);

        opListCli.setText("Lista");
        opListCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opListCliActionPerformed(evt);
            }
        });
        menMesero1.add(opListCli);

        jMenuBar1.add(menMesero1);

        menMesero2.setText("Factura");

        opCrearFac.setText("Nuevo");
        opCrearFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCrearFacActionPerformed(evt);
            }
        });
        menMesero2.add(opCrearFac);

        opReadFac.setText("Buscar");
        menMesero2.add(opReadFac);

        opAnularFac.setText("Anular");
        opAnularFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opAnularFacActionPerformed(evt);
            }
        });
        menMesero2.add(opAnularFac);

        opListFac.setText("Lista");
        menMesero2.add(opListFac);

        jMenuBar1.add(menMesero2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opCrearCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCrearCliActionPerformed
        crearCliente = new VentanaCrearCliente();
        jDesktopPane1.add(crearCliente);
        crearCliente.setVisible(true);
    }//GEN-LAST:event_opCrearCliActionPerformed

    private void opCrearFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCrearFacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opCrearFacActionPerformed

    private void opUpdateCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opUpdateCliActionPerformed
        editarCliente = new VentanaEditarCliente();
        jDesktopPane1.add(editarCliente);
        editarCliente.setVisible(true);
    }//GEN-LAST:event_opUpdateCliActionPerformed

    private void opAnularFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opAnularFacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opAnularFacActionPerformed

    private void opReadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opReadCliActionPerformed
        buscarCliente = new VentanaBuscarCliente();
        jDesktopPane1.add(buscarCliente);
        buscarCliente.setVisible(true);
    }//GEN-LAST:event_opReadCliActionPerformed

    private void opDeleteCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDeleteCliActionPerformed
        eliminarCliente = new VentanaEliminarCliente();
        jDesktopPane1.add(eliminarCliente);
        eliminarCliente.setVisible(true);
    }//GEN-LAST:event_opDeleteCliActionPerformed

    private void opListCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opListCliActionPerformed
        listaCliente = new VentanaListaCliente();
        jDesktopPane1.add(listaCliente);
        listaCliente.setVisible(true);
    }//GEN-LAST:event_opListCliActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menMesero1;
    private javax.swing.JMenu menMesero2;
    private javax.swing.JMenuItem opAnularFac;
    private javax.swing.JMenuItem opCrearCli;
    private javax.swing.JMenuItem opCrearFac;
    private javax.swing.JMenuItem opDeleteCli;
    private javax.swing.JMenuItem opListCli;
    private javax.swing.JMenuItem opListFac;
    private javax.swing.JMenuItem opReadCli;
    private javax.swing.JMenuItem opReadFac;
    private javax.swing.JMenuItem opUpdateCli;
    // End of variables declaration//GEN-END:variables
}
