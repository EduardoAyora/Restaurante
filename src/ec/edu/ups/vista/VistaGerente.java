/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

/**
 *
 * @author DELL
 */
public class VistaGerente extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaGerente
     */
    public VistaGerente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menMesero = new javax.swing.JMenu();
        opCrearMe = new javax.swing.JMenuItem();
        opReadMe = new javax.swing.JMenuItem();
        opUpdateMe = new javax.swing.JMenuItem();
        opDeleteMe = new javax.swing.JMenuItem();
        opListMe = new javax.swing.JMenuItem();
        menMesa = new javax.swing.JMenu();
        opCrearMesa = new javax.swing.JMenuItem();
        opReadMesa = new javax.swing.JMenuItem();
        opUpdateMesa = new javax.swing.JMenuItem();
        opDeleteMesa = new javax.swing.JMenuItem();
        opListMesa = new javax.swing.JMenuItem();
        menProduct = new javax.swing.JMenu();
        opCrearP = new javax.swing.JMenuItem();
        opReadP = new javax.swing.JMenuItem();
        opUpdateP = new javax.swing.JMenuItem();
        opDeleteP = new javax.swing.JMenuItem();
        opListP = new javax.swing.JMenuItem();
        menCategoria = new javax.swing.JMenu();
        opCreateCa = new javax.swing.JMenuItem();
        opReadCa = new javax.swing.JMenuItem();
        opUpdateCa = new javax.swing.JMenuItem();
        opDeleteCa = new javax.swing.JMenuItem();
        opListCa = new javax.swing.JMenuItem();

        setClosable(true);
        setMaximizable(true);
        setAlignmentX(CENTER_ALIGNMENT);
        setAlignmentY(CENTER_ALIGNMENT);

        menMesero.setText("Mesero");

        opCrearMe.setText("Nuevo");
        opCrearMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCrearMeActionPerformed(evt);
            }
        });
        menMesero.add(opCrearMe);

        opReadMe.setText("Buscar");
        menMesero.add(opReadMe);

        opUpdateMe.setText("Editar");
        menMesero.add(opUpdateMe);

        opDeleteMe.setText("Eliminar");
        menMesero.add(opDeleteMe);

        opListMe.setText("Lista");
        menMesero.add(opListMe);

        jMenuBar1.add(menMesero);

        menMesa.setText("Mesa");

        opCrearMesa.setText("Nuevo");
        menMesa.add(opCrearMesa);

        opReadMesa.setText("Buscar");
        opReadMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opReadMesaActionPerformed(evt);
            }
        });
        menMesa.add(opReadMesa);

        opUpdateMesa.setText("Editar");
        menMesa.add(opUpdateMesa);

        opDeleteMesa.setText("Eliminar");
        menMesa.add(opDeleteMesa);

        opListMesa.setText("Lista");
        menMesa.add(opListMesa);

        jMenuBar1.add(menMesa);

        menProduct.setText("Producto");

        opCrearP.setText("Nuevo");
        menProduct.add(opCrearP);

        opReadP.setText("Buscar");
        opReadP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opReadPActionPerformed(evt);
            }
        });
        menProduct.add(opReadP);

        opUpdateP.setText("Editar");
        menProduct.add(opUpdateP);

        opDeleteP.setText("Eliminar");
        menProduct.add(opDeleteP);

        opListP.setText("Lista");
        menProduct.add(opListP);

        jMenuBar1.add(menProduct);

        menCategoria.setText("Categoría");

        opCreateCa.setText("Nuevo");
        menCategoria.add(opCreateCa);

        opReadCa.setText("Buscar");
        opReadCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opReadCaActionPerformed(evt);
            }
        });
        menCategoria.add(opReadCa);

        opUpdateCa.setText("Editar");
        menCategoria.add(opUpdateCa);

        opDeleteCa.setText("Eliminar");
        menCategoria.add(opDeleteCa);

        opListCa.setText("Lista");
        menCategoria.add(opListCa);

        jMenuBar1.add(menCategoria);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opCrearMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCrearMeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opCrearMeActionPerformed

    private void opReadPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opReadPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opReadPActionPerformed

    private void opReadCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opReadCaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opReadCaActionPerformed

    private void opReadMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opReadMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opReadMesaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menCategoria;
    private javax.swing.JMenu menMesa;
    private javax.swing.JMenu menMesero;
    private javax.swing.JMenu menProduct;
    private javax.swing.JMenuItem opCrearMe;
    private javax.swing.JMenuItem opCrearMesa;
    private javax.swing.JMenuItem opCrearP;
    private javax.swing.JMenuItem opCreateCa;
    private javax.swing.JMenuItem opDeleteCa;
    private javax.swing.JMenuItem opDeleteMe;
    private javax.swing.JMenuItem opDeleteMesa;
    private javax.swing.JMenuItem opDeleteP;
    private javax.swing.JMenuItem opListCa;
    private javax.swing.JMenuItem opListMe;
    private javax.swing.JMenuItem opListMesa;
    private javax.swing.JMenuItem opListP;
    private javax.swing.JMenuItem opReadCa;
    private javax.swing.JMenuItem opReadMe;
    private javax.swing.JMenuItem opReadMesa;
    private javax.swing.JMenuItem opReadP;
    private javax.swing.JMenuItem opUpdateCa;
    private javax.swing.JMenuItem opUpdateMe;
    private javax.swing.JMenuItem opUpdateMesa;
    private javax.swing.JMenuItem opUpdateP;
    // End of variables declaration//GEN-END:variables
}
