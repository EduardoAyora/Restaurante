/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.ImagenFondoGerente;
import java.awt.Dimension;
import java.awt.event.KeyEvent;

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

    /**
     * Creates new form VistaGerente
     */
    public VistaGerente() {
        initComponents();
        jDesktopPane1.setBorder(new ImagenFondoGerente());
        this.setExtendedState(VistaGerente.MAXIMIZED_BOTH);

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
        menCategoria = new javax.swing.JMenu();
        opCreateCa = new javax.swing.JMenuItem();
        opReadCa = new javax.swing.JMenuItem();
        opUpdateCa = new javax.swing.JMenuItem();
        opDeleteCa = new javax.swing.JMenuItem();
        opListCa = new javax.swing.JMenuItem();

        setTitle("Gestión de Gerente");
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
            .addGap(0, 301, Short.MAX_VALUE)
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
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opCrearMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCrearMeActionPerformed
        if (vcm == null || vcm.isVisible() == false) {
            vcm = new VentanaCrearMesero();
            vcm.toFront();
            vcm.setVisible(true);
            jDesktopPane1.add(vcm);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension frameSize = vcm.getSize();
            vcm.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        } else {
            vcm.toFront();
        }
    }//GEN-LAST:event_opCrearMeActionPerformed

    private void opReadPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opReadPActionPerformed
        if (vbp == null || vbp.isVisible() == false) {
            vbp = new VentanaBuscarProducto();
            vbp.toFront();
            vbp.setVisible(true);
            jDesktopPane1.add(vbp);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension frameSize = vbp.getSize();
            vbp.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        } else {
            vbp.toFront();
        }
    }//GEN-LAST:event_opReadPActionPerformed

    private void opReadCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opReadCaActionPerformed

    }//GEN-LAST:event_opReadCaActionPerformed

    private void opReadMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opReadMesaActionPerformed

    }//GEN-LAST:event_opReadMesaActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed

    private void opReadMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opReadMeActionPerformed
        if (vbm == null || vbm.isVisible() == false) {
            vbm = new VentanaBuscarMesero();
            vbm.toFront();
            vbm.setVisible(true);
            jDesktopPane1.add(vbm);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension frameSize = vbm.getSize();
            vbm.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        } else {
            vbm.toFront();
        }
    }//GEN-LAST:event_opReadMeActionPerformed

    private void opUpdateMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opUpdateMeActionPerformed
        if (vem == null || vem.isVisible() == false) {
            vem = new VentanaEditarMesero();
            vem.toFront();
            vem.setVisible(true);
            jDesktopPane1.add(vem);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension frameSize = vem.getSize();
            vem.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        } else {
            vem.toFront();
        }
    }//GEN-LAST:event_opUpdateMeActionPerformed

    private void opDeleteMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDeleteMeActionPerformed
        if (vem1 == null || vem1.isVisible() == false) {
            vem1 = new VentanaEliminarMesero();
            vem1.toFront();
            vem1.setVisible(true);
            jDesktopPane1.add(vem1);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension frameSize = vem1.getSize();
            vem1.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        } else {
            vem1.toFront();
        }
    }//GEN-LAST:event_opDeleteMeActionPerformed

    private void opListMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opListMeActionPerformed
        if (vlm == null || vlm.isVisible() == false) {
            vlm = new VentanaListaMesero();
            vlm.toFront();
            vlm.setVisible(true);
            jDesktopPane1.add(vlm);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension frameSize = vlm.getSize();
            vlm.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        } else {
            vlm.toFront();
        }
    }//GEN-LAST:event_opListMeActionPerformed

    private void opCrearPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCrearPActionPerformed
        if (vcp == null || vcp.isVisible() == false) {
            vcp = new VentanaCrearProducto();
            vcp.toFront();
            vcp.setVisible(true);
            jDesktopPane1.add(vcp);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension frameSize = vcp.getSize();
            vcp.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        } else {
            vcp.toFront();
        }

    }//GEN-LAST:event_opCrearPActionPerformed

    private void opUpdatePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opUpdatePActionPerformed
        if (vep == null || vep.isVisible() == false) {
            vep = new VentanaEditarProducto();
            vep.toFront();
            vep.setVisible(true);
            jDesktopPane1.add(vep);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension frameSize = vep.getSize();
            vep.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        } else {
            vep.toFront();
        }
    }//GEN-LAST:event_opUpdatePActionPerformed

    private void opDeletePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDeletePActionPerformed
        if (vep1 == null || vep1.isVisible() == false) {
            vep1 = new VentanaEliminarProducto();
            vep1.toFront();
            vep1.setVisible(true);
            jDesktopPane1.add(vep1);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension frameSize = vep1.getSize();
            vep1.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        } else {
            vep1.toFront();
        }
    }//GEN-LAST:event_opDeletePActionPerformed

    private void opListPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opListPActionPerformed
        if (vlp == null || vlp.isVisible() == false) {
            vlp = new VentanaListaProducto();
            vlp.toFront();
            vlp.setVisible(true);
            jDesktopPane1.add(vlp);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension frameSize = vlp.getSize();
            vlp.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        } else {
            vlp.toFront();
        }
    }//GEN-LAST:event_opListPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane1;
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
