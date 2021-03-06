/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.gerente;

import ec.edu.ups.controlador.ControladorMesa;
import ec.edu.ups.controlador.ControladorMesero;
import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.ImagenFondoGerente;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle;
import javax.swing.JLabel;

/**
 *
 * @author DELL
 */
public class VistaGerente extends javax.swing.JFrame {

    private VentanaCrearMesero vcm;
    private VentanaEditarMesero vem;
    private VentanaBuscarMesero vbm;
    private VentanaEliminarMesero vem1;
    private VentanaListaMesero vlm;
    private VentanaCrearProducto vcp;
    private VentanaBuscarProducto vbp;
    private VentanaEditarProducto vep;
    private VentanaEliminarProducto vep1;
    private VentanaListaProducto vlp;
    private VentanaCrearMesa vcm1;
    private VentanaBuscarMesa vbm1;
    private VentanaEditarMesa vem2;
    private VentanaEliminarMesa vem3;
    private VentanaListaMesa vlm1;
    private ControladorProducto cp;
    private ControladorMesero cm;
    private ControladorMesa cm1;
    private JLabel titulo;
    private ResourceBundle mensajes;

    /**
     * Creates new form VistaGerente
     */
    public VistaGerente(ControladorProducto cp, ControladorMesero cm, ControladorMesa cm1, ResourceBundle mensajes) {
        titulo = new JLabel(mensajes.getString("gerente.gestion"));
        initComponents();
        jDesktopPane1.setBorder(new ImagenFondoGerente());
        this.setExtendedState(VistaGerente.MAXIMIZED_BOTH);
        this.cp = cp;
        this.cm = cm;
        this.cm1 = cm1;
        this.mensajes = mensajes;
        cambiarIdiomas(mensajes);
    }

    public void cambiarIdiomas(ResourceBundle mensajes) {
        titulo.setText(mensajes.getString("gerente.gestion"));
        menMesa.setText(mensajes.getString("txt.mesa"));
        menMesero.setText(mensajes.getString("txt.mesero"));
        menProduct.setText(mensajes.getString("vista.producto"));
        opCrearMe.setText(mensajes.getString("crud.nuevo"));
        opCrearP.setText(mensajes.getString("crud.nuevo"));
        opCrearMesa.setText(mensajes.getString("crud.nuevo"));
        opReadMe.setText(mensajes.getString("crud.buscar"));
        opReadP.setText(mensajes.getString("crud.buscar"));
        opReadMesa.setText(mensajes.getString("crud.buscar"));
        opUpdateMe.setText(mensajes.getString("crud.editar"));
        opUpdateP.setText(mensajes.getString("crud.editar"));
        opUpdateMesa.setText(mensajes.getString("crud.editar"));
        opDeleteMe.setText(mensajes.getString("crud.eliminar"));
        opDeleteP.setText(mensajes.getString("crud.eliminar"));
        opDeleteMesa.setText(mensajes.getString("crud.eliminar"));
        opListMe.setText(mensajes.getString("vista.item.listar"));
        opListP.setText(mensajes.getString("vista.item.listar"));
        opListMesa.setText(mensajes.getString("vista.item.listar"));
        comprobaciones();
    }

    public void comprobaciones() {

        if (vcm != null && vcm.isVisible()) {
            vcm.cambiarIdiomas(mensajes);
        }
        if (vem != null && vem.isVisible()) {
            vem.cambiarIdiomas(mensajes);
        }
        if (vbm != null && vbm.isVisible()) {
            vbm.cambiarIdiomas(mensajes);
        }
        if (vem1 != null && vem1.isVisible()) {
            vem1.cambiarIdiomas(mensajes);
        }
        if (vlm != null && vlm.isVisible()) {
            vlm.cambiarIdiomas(mensajes);
        }
        if (vcp != null && vcp.isVisible()) {
            vcp.cambiarIdiomas(mensajes);
        }
        if (vbp != null && vbp.isVisible()) {
            vbp.cambiarIdiomas(mensajes);
        }
        if (vep != null && vep.isVisible()) {
            vep.cambiarIdiomas(mensajes);
        }
        if (vep1 != null && vep1.isVisible()) {
            vep1.cambiarIdiomas(mensajes);
        }
        if (vlp != null && vlp.isVisible()) {
            vlp.cambiarIdiomas(mensajes);
        }
        if (vcm1 != null && vcm1.isVisible()) {
            vcm1.cambiarIdiomas(mensajes);
        }
        if (vbm1 != null && vbm1.isVisible()) {
            vbm1.cambiarIdiomas(mensajes);
        }
        if (vem2 != null && vem2.isVisible()) {
            vem2.cambiarIdiomas(mensajes);
        }
        if (vem3 != null && vem3.isVisible()) {
            vem3.cambiarIdiomas(mensajes);
        }
        if (vlm1 != null && vlm1.isVisible()) {
            vlm1.cambiarIdiomas(mensajes);
        }
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

        setTitle(titulo.getText());
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        menMesero.setText("Mesero");

        opCrearMe.setText("Nuevo");
        opCrearMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCrearMeActionPerformed(evt);
            }
        });
        menMesero.add(opCrearMe);

        opReadMe.setText("Buscar");
        opReadMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opReadMeActionPerformed(evt);
            }
        });
        menMesero.add(opReadMe);

        opUpdateMe.setText("Editar");
        opUpdateMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opUpdateMeActionPerformed(evt);
            }
        });
        menMesero.add(opUpdateMe);

        opDeleteMe.setText("Eliminar");
        opDeleteMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDeleteMeActionPerformed(evt);
            }
        });
        menMesero.add(opDeleteMe);

        opListMe.setText("Lista");
        opListMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opListMeActionPerformed(evt);
            }
        });
        menMesero.add(opListMe);

        jMenuBar1.add(menMesero);

        menMesa.setText("Mesa");

        opCrearMesa.setText("Nuevo");
        opCrearMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCrearMesaActionPerformed(evt);
            }
        });
        menMesa.add(opCrearMesa);

        opReadMesa.setText("Buscar");
        opReadMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opReadMesaActionPerformed(evt);
            }
        });
        menMesa.add(opReadMesa);

        opUpdateMesa.setText("Editar");
        opUpdateMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opUpdateMesaActionPerformed(evt);
            }
        });
        menMesa.add(opUpdateMesa);

        opDeleteMesa.setText("Eliminar");
        opDeleteMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDeleteMesaActionPerformed(evt);
            }
        });
        menMesa.add(opDeleteMesa);

        opListMesa.setText("Lista");
        opListMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opListMesaActionPerformed(evt);
            }
        });
        menMesa.add(opListMesa);

        jMenuBar1.add(menMesa);

        menProduct.setText("Producto");

        opCrearP.setText("Nuevo");
        opCrearP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCrearPActionPerformed(evt);
            }
        });
        menProduct.add(opCrearP);

        opReadP.setText("Buscar");
        opReadP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opReadPActionPerformed(evt);
            }
        });
        menProduct.add(opReadP);

        opUpdateP.setText("Editar");
        opUpdateP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opUpdatePActionPerformed(evt);
            }
        });
        menProduct.add(opUpdateP);

        opDeleteP.setText("Eliminar");
        opDeleteP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDeletePActionPerformed(evt);
            }
        });
        menProduct.add(opDeleteP);

        opListP.setText("Lista");
        opListP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opListPActionPerformed(evt);
            }
        });
        menProduct.add(opListP);

        jMenuBar1.add(menProduct);

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

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE && this.isFocused() == false) {
            this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed

    private void jDesktopPane1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDesktopPane1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_jDesktopPane1KeyPressed

    private void opListPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opListPActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        vlp = new VentanaListaProducto(cp, mensajes);
        vlp.toFront();
        vlp.setVisible(true);
        jDesktopPane1.add(vlp);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension frameSize = vlp.getSize();
        vlp.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        vlp.toFront();

    }//GEN-LAST:event_opListPActionPerformed

    private void opDeletePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDeletePActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        vep1 = new VentanaEliminarProducto(cp, mensajes);
        vep1.toFront();
        vep1.setVisible(true);
        jDesktopPane1.add(vep1);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension frameSize = vep1.getSize();
        vep1.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        vep1.toFront();

    }//GEN-LAST:event_opDeletePActionPerformed

    private void opUpdatePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opUpdatePActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        vep = new VentanaEditarProducto(cp, mensajes);
        vep.toFront();
        vep.setVisible(true);
        jDesktopPane1.add(vep);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension frameSize = vep.getSize();
        vep.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        vep.toFront();

    }//GEN-LAST:event_opUpdatePActionPerformed

    private void opReadPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opReadPActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        vbp = new VentanaBuscarProducto(cp, mensajes);
        vbp.toFront();
        vbp.setVisible(true);
        jDesktopPane1.add(vbp);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension frameSize = vbp.getSize();
        vbp.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        vbp.toFront();

    }//GEN-LAST:event_opReadPActionPerformed

    private void opCrearPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCrearPActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        vcp = new VentanaCrearProducto(cp, mensajes);
        vcp.toFront();
        vcp.setVisible(true);
        jDesktopPane1.add(vcp);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension frameSize = vcp.getSize();
        vcp.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        vcp.toFront();

    }//GEN-LAST:event_opCrearPActionPerformed

    private void opReadMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opReadMesaActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        vbm1 = new VentanaBuscarMesa(cm1, mensajes);
        vbm1.toFront();
        vbm1.setVisible(true);
        jDesktopPane1.add(vbm1);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension frameSize = vbm1.getSize();
        vbm1.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        vbm1.toFront();
    }//GEN-LAST:event_opReadMesaActionPerformed

    private void opListMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opListMeActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        vlm = new VentanaListaMesero(cm, mensajes);
        vlm.toFront();
        vlm.setVisible(true);
        jDesktopPane1.add(vlm);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension frameSize = vlm.getSize();
        vlm.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        vlm.toFront();

    }//GEN-LAST:event_opListMeActionPerformed

    private void opDeleteMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDeleteMeActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        vem1 = new VentanaEliminarMesero(cm, mensajes);
        vem1.toFront();
        vem1.setVisible(true);
        jDesktopPane1.add(vem1);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension frameSize = vem1.getSize();
        vem1.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        vem1.toFront();

    }//GEN-LAST:event_opDeleteMeActionPerformed

    private void opUpdateMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opUpdateMeActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        vem = new VentanaEditarMesero(cm, mensajes);
        vem.toFront();
        vem.setVisible(true);
        jDesktopPane1.add(vem);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension frameSize = vem.getSize();
        vem.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        vem.toFront();

    }//GEN-LAST:event_opUpdateMeActionPerformed

    private void opReadMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opReadMeActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        vbm = new VentanaBuscarMesero(cm, mensajes);
        vbm.toFront();
        vbm.setVisible(true);
        jDesktopPane1.add(vbm);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension frameSize = vbm.getSize();
        vbm.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        vbm.toFront();

    }//GEN-LAST:event_opReadMeActionPerformed

    private void opCrearMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCrearMeActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        vcm = new VentanaCrearMesero(cm, mensajes);
        vcm.toFront();
        vcm.setVisible(true);
        jDesktopPane1.add(vcm);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension frameSize = vcm.getSize();
        vcm.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);

        vcm.toFront();

    }//GEN-LAST:event_opCrearMeActionPerformed

    private void opCrearMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCrearMesaActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        vcm1 = new VentanaCrearMesa(cm1, mensajes);
        vcm1.toFront();
        vcm1.setVisible(true);
        jDesktopPane1.add(vcm1);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension frameSize = vcm1.getSize();
        vcm1.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        vcm1.toFront();
    }//GEN-LAST:event_opCrearMesaActionPerformed

    private void opUpdateMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opUpdateMesaActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        vem2 = new VentanaEditarMesa(cm1, mensajes);
        vem2.toFront();
        vem2.setVisible(true);
        jDesktopPane1.add(vem2);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension frameSize = vem2.getSize();
        vem2.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        vem2.toFront();
    }//GEN-LAST:event_opUpdateMesaActionPerformed

    private void opDeleteMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDeleteMesaActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        vem3 = new VentanaEliminarMesa(cm1, mensajes);
        vem3.toFront();
        vem3.setVisible(true);
        jDesktopPane1.add(vem3);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension frameSize = vem3.getSize();
        vem3.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        vem3.toFront();
    }//GEN-LAST:event_opDeleteMesaActionPerformed

    private void opListMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opListMesaActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        vlm1 = new VentanaListaMesa(cm1, mensajes);
        vlm1.toFront();
        vlm1.setVisible(true);
        jDesktopPane1.add(vlm1);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension frameSize = vlm1.getSize();
        vlm1.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        vlm1.toFront();
    }//GEN-LAST:event_opListMesaActionPerformed

    public void setMensajes(ResourceBundle mensajes) {
        this.mensajes = mensajes;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menMesa;
    private javax.swing.JMenu menMesero;
    private javax.swing.JMenu menProduct;
    private javax.swing.JMenuItem opCrearMe;
    private javax.swing.JMenuItem opCrearMesa;
    private javax.swing.JMenuItem opCrearP;
    private javax.swing.JMenuItem opDeleteMe;
    private javax.swing.JMenuItem opDeleteMesa;
    private javax.swing.JMenuItem opDeleteP;
    private javax.swing.JMenuItem opListMe;
    private javax.swing.JMenuItem opListMesa;
    private javax.swing.JMenuItem opListP;
    private javax.swing.JMenuItem opReadMe;
    private javax.swing.JMenuItem opReadMesa;
    private javax.swing.JMenuItem opReadP;
    private javax.swing.JMenuItem opUpdateMe;
    private javax.swing.JMenuItem opUpdateMesa;
    private javax.swing.JMenuItem opUpdateP;
    // End of variables declaration//GEN-END:variables
}
