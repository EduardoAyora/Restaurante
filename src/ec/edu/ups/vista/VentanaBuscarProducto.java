/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Categoria;
import ec.edu.ups.modelo.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class VentanaBuscarProducto extends javax.swing.JInternalFrame {

    ControladorProducto controladorProducto;
    Categoria categoria;

    /**
     * Creates new form VentanaBuscarProducto
     */
    public VentanaBuscarProducto(ControladorProducto controladorProducto) {
        initComponents();
        this.controladorProducto = controladorProducto;
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
        tCodigo = new javax.swing.JTextField();
        lNombre = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        lPrecio = new javax.swing.JLabel();
        tPrecio = new javax.swing.JTextField();
        tDescripcion = new javax.swing.JTextField();
        lDescripcion = new javax.swing.JLabel();
        lCategoria = new javax.swing.JLabel();
        bCancelar = new javax.swing.JButton();
        tCategoria = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Buscar producto");

        lCodigo.setText("Código:");

        lNombre.setText("Nombre:");

        tNombre.setEditable(false);

        lPrecio.setText("Precio:");

        tPrecio.setEditable(false);

        tDescripcion.setEditable(false);
        tDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDescripcionActionPerformed(evt);
            }
        });

        lDescripcion.setText("Descripción:");

        lCategoria.setText("Categoría:");

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        tCategoria.setEditable(false);

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lCodigo)
                    .addComponent(lDescripcion)
                    .addComponent(lPrecio)
                    .addComponent(lCategoria)
                    .addComponent(lNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(bBuscar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCodigo)
                    .addComponent(bBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombre)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPrecio)
                    .addComponent(tPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDescripcion)
                    .addComponent(tDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCategoria)
                    .addComponent(tCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDescripcionActionPerformed

    }//GEN-LAST:event_tDescripcionActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        int codigo = Integer.parseInt(tCodigo.getText());
        Producto buscarProducto = controladorProducto.read(codigo);
        if (buscarProducto != null) {
            tNombre.setText(buscarProducto.getNombre());
            tPrecio.setText(Double.toString(buscarProducto.getPrecio()));
            tDescripcion.setText(buscarProducto.getDescripcion());
            tCategoria.setText(buscarProducto.getCategoria().getNombre());
        } else {
            tNombre.setText("");
            tPrecio.setText("");
            tDescripcion.setText("");
            JOptionPane.showMessageDialog(this, "El producto no existe");
        }


    }//GEN-LAST:event_bBuscarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JLabel lCategoria;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lDescripcion;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lPrecio;
    private javax.swing.JTextField tCategoria;
    private javax.swing.JTextField tCodigo;
    private javax.swing.JTextField tDescripcion;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tPrecio;
    // End of variables declaration//GEN-END:variables
}
