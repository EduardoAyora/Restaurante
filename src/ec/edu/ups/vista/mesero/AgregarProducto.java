/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.mesero;

import ec.edu.ups.controlador.ControladorMesa;
import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Detalle;
import ec.edu.ups.modelo.Mesa;
import ec.edu.ups.modelo.Mesero;
import ec.edu.ups.modelo.Producto;
import ec.edu.ups.modelo.Render;
import ec.edu.ups.vista.VentanaPrincipal;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Eduardo Ayora
 */
public class AgregarProducto extends javax.swing.JFrame {

    private ControladorProducto controladorProducto;
    private Mesa mesa;
    private Mesero mesero;
    private ControladorMesa controladorMesa;
    private String nombreCategoria;
    private ResourceBundle mensajes;

    /**
     * Creates new form AgregarProducto
     */
    public AgregarProducto(Mesa mesa, Mesero mesero, ControladorMesa controladorMesa, ControladorProducto controladorProducto, ResourceBundle mensajes) {
        initComponents();
        this.mesa = mesa;
        this.mesero = mesero;
        this.controladorMesa = controladorMesa;
        this.controladorProducto = controladorProducto;
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
        nombreCategoria = "Entrada";
        setLocationRelativeTo(null);
        llenarDatos();
        tblProductos.setRowHeight(60);
    }

    public void cambiarIdioma(ResourceBundle mensajes) {

        btnEntradas.setText(mensajes.getString("txt.entrada"));
        btnBebida.setText(mensajes.getString("txt.bebida"));
        btnPlato.setText(mensajes.getString("txt.plato"));
        btnPostres.setText(mensajes.getString("txt.postre"));
        btnListo.setText(mensajes.getString("txt.listo"));

        JTableHeader tableHeader = tblProductos.getTableHeader();
        TableColumnModel tableColumnModel = tableHeader.getColumnModel();
        TableColumn tableColumn;
        tableColumn = tableColumnModel.getColumn(0);
        tableColumn.setHeaderValue(mensajes.getString("txt.codigo"));
        tableColumn = tableColumnModel.getColumn(1);
        tableColumn.setHeaderValue(mensajes.getString("txt.nombre"));
        tableColumn = tableColumnModel.getColumn(2);
        tableColumn.setHeaderValue(mensajes.getString("txt.descripcion"));
        tableColumn = tableColumnModel.getColumn(3);
        tableColumn.setHeaderValue(mensajes.getString("txt.precio"));
        tableColumn = tableColumnModel.getColumn(4);
        tableColumn.setHeaderValue(mensajes.getString("txt.foto"));
        tableColumn = tableColumnModel.getColumn(5);
        tableColumn.setHeaderValue(mensajes.getString("txt.seleccionar"));
        tableHeader.repaint();

    }

    /**
     * llenarDatos muestra los productos en la tabla separando por categoria y
     * omitiendo los que ya han sido seleccionados.
     */
    public void llenarDatos() {
        tblProductos.setDefaultRenderer(Object.class, new Render());
        JButton btnSeleccionar = new JButton(mensajes.getString("txt.seleccionar"));
        btnSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/visto1.png")));

        List<Producto> productos = controladorProducto.getLista();
        DefaultTableModel modelo = (DefaultTableModel) tblProductos.getModel();
        modelo.setRowCount(0);
        for (Producto producto : productos) {
            //Encuentra los productos ya seleccionado para no tomarlos en cuenta.
            boolean bandera = true;
            for (Detalle detalle : mesa.getControladorDetalle().getLista()) {
                if (detalle.getProducto().equals(producto)) {
                    bandera = false;
                    break;
                }
            }
            if (producto.getCategoria().getNombre().equals(nombreCategoria) && bandera) {
                Object[] datos = {producto.getCodigoProducto(),
                    producto.getNombre(),
                    producto.getDescripcion(),
                    producto.getPrecio(),
                    new JLabel(producto.getImgIcon()),
                    btnSeleccionar
                };
                modelo.addRow(datos);
            }
        }
    }

    /**
     * posicionProducto Busca un producto seleccionado por el mesero,
     * discriminando categoría y si ya fue seleccionado anteriormente.
     *
     * @param numProducto
     * @return la posición del producto seleccionado.
     */
    private int posicionProducto(int numProducto) {
        int contador = 0;
        int acierto = 0;
        for (int i = 0; i < controladorProducto.getLista().size(); i++) {
            //Descarta de la cuenta a los productos ya seleccionados
            boolean bandera = true;
            for (Detalle detalle : mesa.getControladorDetalle().getLista()) {
                if (detalle.getProducto().equals(controladorProducto.getLista().get(i))) {
                    bandera = false;
                    break;
                }
            }
            if (bandera) {
                //Descarta de la cuenta a los productos que no son de la categoria.
                if (!controladorProducto.getLista().get(i).getCategoria().getNombre().equals(nombreCategoria)) {
                } else {
                    acierto++;
                }
                if (acierto == numProducto) {
                    break;
                }
                contador++;
            } else {
                contador++;
            }
        }
        return contador;
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

        jPanel1 = new javax.swing.JPanel();
        btnEntradas = new javax.swing.JButton();
        btnPlato = new javax.swing.JButton();
        btnBebida = new javax.swing.JButton();
        btnPostres = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnListo = new javax.swing.JButton();

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnEntradas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEntradas.setText("Entradas");
        btnEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradasActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntradas);

        btnPlato.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPlato.setText("Platos Fuertes");
        btnPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlato);

        btnBebida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBebida.setText("Bebidas");
        btnBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBebida);

        btnPostres.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPostres.setText("Postres");
        btnPostres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostresActionPerformed(evt);
            }
        });
        jPanel1.add(btnPostres);

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Descripción", "Precio", "Fotografía", "Seleccionar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setMinWidth(70);
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblProductos.getColumnModel().getColumn(0).setMaxWidth(70);
            tblProductos.getColumnModel().getColumn(3).setMinWidth(115);
            tblProductos.getColumnModel().getColumn(3).setPreferredWidth(115);
            tblProductos.getColumnModel().getColumn(3).setMaxWidth(115);
            tblProductos.getColumnModel().getColumn(4).setMinWidth(100);
            tblProductos.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(4).setMaxWidth(100);
            tblProductos.getColumnModel().getColumn(5).setMinWidth(150);
            tblProductos.getColumnModel().getColumn(5).setPreferredWidth(150);
            tblProductos.getColumnModel().getColumn(5).setMaxWidth(150);
        }

        btnListo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnListo.setText("Listo");
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(348, 348, 348))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListo, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        // TODO add your handling code here:
        int columna = tblProductos.getColumnModel().getColumnIndexAtX(evt.getX());
        int fila = evt.getY() / tblProductos.getRowHeight();

        if (fila < tblProductos.getRowCount() && fila >= 0 && columna < tblProductos.getColumnCount() && columna >= 0) {
            Object value = tblProductos.getValueAt(fila, columna);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                int numProducto = evt.getY() / tblProductos.getRowHeight();
                int auxNumProducto = posicionProducto(numProducto + 1);
                Producto auxProducto = controladorProducto.getLista().get(auxNumProducto);
                if (boton.isEnabled()) {
                    Detalle detalle = new Detalle();
                    detalle.setCantidad(1);
                    detalle.setPrecio(auxProducto.getPrecio());
                    detalle.setSubtotal(auxProducto.getPrecio());
                    detalle.setProducto(auxProducto);
                    mesa.getControladorDetalle().createFacturaDetalle(detalle);
                    //Refrescamos los datos de la tabla
                    llenarDatos();
                }
            }
        }
    }//GEN-LAST:event_tblProductosMouseClicked

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        // TODO add your handling code here:
        VentanaPrincipal.usuarioMesero.vistaMesero.vistaMesa = new VistaMesa(mesa, mesero, controladorMesa, controladorProducto, mensajes);
        VentanaPrincipal.usuarioMesero.vistaMesero.vistaMesa.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnListoActionPerformed

    private void btnEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradasActionPerformed
        // TODO add your handling code here:
        nombreCategoria = "Entrada";
        llenarDatos();
    }//GEN-LAST:event_btnEntradasActionPerformed

    private void btnPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatoActionPerformed
        // TODO add your handling code here:
        nombreCategoria = "Plato";
        llenarDatos();
    }//GEN-LAST:event_btnPlatoActionPerformed

    private void btnBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidaActionPerformed
        // TODO add your handling code here:
        nombreCategoria = "Bebida";
        llenarDatos();
    }//GEN-LAST:event_btnBebidaActionPerformed

    private void btnPostresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostresActionPerformed
        // TODO add your handling code here:
        nombreCategoria = "Postre";
        llenarDatos();
    }//GEN-LAST:event_btnPostresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBebida;
    private javax.swing.JButton btnEntradas;
    private javax.swing.JButton btnListo;
    private javax.swing.JButton btnPlato;
    private javax.swing.JButton btnPostres;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
