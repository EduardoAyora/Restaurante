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
import ec.edu.ups.modelo.Render;
import ec.edu.ups.vista.VentanaPrincipal;
import java.util.ResourceBundle;
import java.util.SortedSet;
import javax.swing.JButton;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Eduardo Ayora
 */
public class VistaMesa extends javax.swing.JFrame {

    private Mesa mesa;
    private Mesero mesero;
    private ControladorMesa controladorMesa;
    private ControladorProducto controladorProducto;
    public static AgregarProducto agregarProducto;
    private ResourceBundle mensajes;
    /**
     * Creates new form InformacionMesa
     */
    public VistaMesa(Mesa mesa, Mesero mesero, ControladorMesa controladorMesa, ControladorProducto controladorProducto, ResourceBundle mensajes) {
        initComponents();
        this.mesa = mesa;
        this.mesero = mesero;
        this.controladorMesa = controladorMesa;
        this.controladorProducto = controladorProducto;
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
        setLocationRelativeTo(null);
        formatoTabla();
        llenarTextos();
        llenarDatos();
        tblDetalles.setRowHeight(60);
    }
    
    public void cambiarIdioma(ResourceBundle mensajes){
        
        lblMesero.setText(mensajes.getString("txt.mesero") + ":");
        lblNumero.setText(mensajes.getString("txt.numero.mesa"));
        btnAgregar.setText(mensajes.getString("btn.agregar.producto"));
        btnSalir.setText(mensajes.getString("itm.salir"));
        lblIva.setText(mensajes.getString("txt.iva"));
        
        JTableHeader tableHeader = tblDetalles.getTableHeader();
        TableColumnModel tableColumnModel = tableHeader.getColumnModel();
        TableColumn tableColumn;
        tableColumn = tableColumnModel.getColumn(0);
        tableColumn.setHeaderValue(mensajes.getString("txt.codigo"));
        tableColumn = tableColumnModel.getColumn(1);
        tableColumn.setHeaderValue(mensajes.getString("txt.nombre.producto"));
        tableColumn = tableColumnModel.getColumn(2);
        tableColumn.setHeaderValue(mensajes.getString("txt.cantidad"));
        tableColumn = tableColumnModel.getColumn(3);
        tableColumn.setHeaderValue(mensajes.getString("txt.precio"));
        tableColumn = tableColumnModel.getColumn(4);
        tableColumn.setHeaderValue(mensajes.getString("txt.subtotal"));
        tableColumn = tableColumnModel.getColumn(5);
        tableColumn.setHeaderValue(mensajes.getString("txt.quitar"));
        tableHeader.repaint();
        
    }
    
    public void formatoTabla(){
        DefaultTableModel modelo = (DefaultTableModel) tblDetalles.getModel();
        Object[] fila = new Object[6];

        modelo.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    if(Integer.parseInt((String) modelo.getValueAt(e.getFirstRow(), e.getColumn())) != 0){
                        Detalle detalle = mesa.getControladorDetalle().buscarPosicion(e.getFirstRow());
                        detalle.setCantidad(Integer.parseInt((String) modelo.getValueAt(e.getFirstRow(), 2)));
                        mesa.getControladorDetalle().updateDetalle(detalle);
                        llenarDatos();
                    }else{
                        modelo.setValueAt(1, e.getFirstRow(), e.getColumn());
                    }
                }
            }
        });
    }
    
    public void llenarDatos(){
        tblDetalles.setDefaultRenderer(Object.class, new Render());
        JButton btnQuitar = new JButton(mensajes.getString("txt.quitar"));
        btnQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/cerrar1.png")));

        SortedSet<Detalle> detalles = mesa.getControladorDetalle().getLista();
        DefaultTableModel modelo = (DefaultTableModel) tblDetalles.getModel();
        modelo.setRowCount(0);
        for (Detalle detalle : detalles) {
            Object[] datos = {detalle.getProducto().getCodigoProducto(),
                detalle.getProducto().getNombre(),
                detalle.getCantidad(),
                detalle.getPrecio(),
                detalle.getSubtotal(),
                btnQuitar
            };
            modelo.addRow(datos);
        }
        calcularSubtotal();
        calcularIva();
        calcularTotal();
    }
    
    public void calcularSubtotal() {
        double suma = 0;
        for(Detalle detalle : mesa.getControladorDetalle().getLista()){
            suma += detalle.getSubtotal();
        }
        txtSubtotal.setText(Double.toString(suma));
    }

    public void calcularIva() {
        double iva = Double.parseDouble(txtSubtotal.getText()) * 0.12;
        txtIva.setText(String.format("%.2f", iva));
        
    }
    
    public void calcularTotal() {
        double total = Double.parseDouble(txtSubtotal.getText()) + (Double.parseDouble(txtSubtotal.getText()) * 0.12);
        txtTotal.setText(Double.toString(total));
    }
    
    public void llenarTextos(){
        txtCodigo.setText(Integer.toString(mesa.getNumeroMesa()));
        txtMesero.setText(mesa.getMesero().getNombre());
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
        tblDetalles = new javax.swing.JTable();
        lblNumero = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblMesero = new javax.swing.JLabel();
        txtMesero = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblSubtotal = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();

        tblDetalles.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre del Producto", "Cantidad", "Precio Unitario", "Subtotal", "Quitar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetallesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetalles);
        if (tblDetalles.getColumnModel().getColumnCount() > 0) {
            tblDetalles.getColumnModel().getColumn(5).setMinWidth(150);
            tblDetalles.getColumnModel().getColumn(5).setPreferredWidth(150);
            tblDetalles.getColumnModel().getColumn(5).setMaxWidth(150);
        }

        lblNumero.setText("Numero de mesa:");

        txtCodigo.setEditable(false);

        lblMesero.setText("Mesero:");

        txtMesero.setEditable(false);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar Producto");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);

        lblSubtotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSubtotal.setText("Subtotal:");

        lblIva.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblIva.setText("Iva:");

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setText("Total:");

        txtSubtotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtIva.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIva, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMesero)
                            .addComponent(lblNumero))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo)
                            .addComponent(txtMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMesero))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumero)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        VentanaPrincipal.usuarioMesero.vistaMesero = new VistaMesero(mesero, controladorMesa, controladorProducto, mensajes);
        VentanaPrincipal.usuarioMesero.vistaMesero.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        agregarProducto = new AgregarProducto(mesa, mesero, controladorMesa, controladorProducto, mensajes);
        agregarProducto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblDetallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetallesMouseClicked
        // TODO add your handling code here:
        int columna = tblDetalles.getColumnModel().getColumnIndexAtX(evt.getX());
        int fila = evt.getY() / tblDetalles.getRowHeight();

        if (fila < tblDetalles.getRowCount() && fila >= 0 && columna < tblDetalles.getColumnCount() && columna >= 0) {
            Object value = tblDetalles.getValueAt(fila, columna);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                int numDetalle = evt.getY() / tblDetalles.getRowHeight();
                Detalle detalle = mesa.getControladorDetalle().buscarPosicion(numDetalle);
                mesa.getControladorDetalle().quitarDetalle(detalle);
                llenarDatos();
            }
        }
    }//GEN-LAST:event_tblDetallesMouseClicked

    public void setMensajes(ResourceBundle mensajes) {
        this.mensajes = mensajes;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblMesero;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblDetalles;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtMesero;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
