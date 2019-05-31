/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorFactura;
import ec.edu.ups.modelo.Detalle;
import ec.edu.ups.modelo.Factura;
import ec.edu.ups.modelo.Render;
import java.awt.Dimension;
import java.util.ResourceBundle;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Estudiante
 */
public class ListarFacturas extends javax.swing.JInternalFrame {

    private ControladorFactura controladorFactura;
    private ResourceBundle mensajes;
    private VentanaReadFactura ventanaReadFactura;

    /**
     * Creates new form ListarClientes
     */
    public ListarFacturas(ControladorFactura controladorFactura,ResourceBundle mensajes) {
       
        this.controladorFactura = controladorFactura;
        this.mensajes = mensajes;
        initComponents();
        llenarDatos();
        tblFactura.setRowHeight(30);
        cambiarIdioma(mensajes);
    }

    public void llenarDatos() {

        tblFactura.setDefaultRenderer(Object.class, new Render());
        JButton btnDetalles = new JButton(mensajes.getString("factura.detalle"));
        DefaultTableModel modelo = (DefaultTableModel) tblFactura.getModel();
        Set<Factura> lista = controladorFactura.getLista();
        for (Factura factura : lista) {
            //Factura activa
            String activo = "";
            if(!factura.isActivo()){
                activo = "Anulada";
            }
            //Iva
            String formatoIva = (String.format("%.2f", factura.getIva()));
            Object[] datos = {factura.getNumeroFactura(),
                factura.getFecha(),
                factura.getCliente().getNombre(),
                factura.getSubtotal(),
                formatoIva,
                factura.getTotal(),
                activo,
                btnDetalles
            };
            modelo.addRow(datos);
        }

    }

    public void cambiarIdioma(ResourceBundle mensajes) {
        titulo.setText(mensajes.getString("factura.lista"));
        JTableHeader tableHeader = tblFactura.getTableHeader();
        TableColumnModel tableColumnModel = tableHeader.getColumnModel();
        TableColumn tableColumn;
        tableColumn = tableColumnModel.getColumn(0);
        tableColumn.setHeaderValue(mensajes.getString("factura.numero"));
        tableColumn = tableColumnModel.getColumn(1);
        tableColumn.setHeaderValue(mensajes.getString("factura.fecha"));
        tableColumn = tableColumnModel.getColumn(2);
        tableColumn.setHeaderValue(mensajes.getString("vista.cliente"));
        tableColumn = tableColumnModel.getColumn(3);
        tableColumn.setHeaderValue(mensajes.getString("txt.subtotal"));
        tableColumn = tableColumnModel.getColumn(4);
        tableColumn.setHeaderValue(mensajes.getString("factura.iva"));
        tableColumn = tableColumnModel.getColumn(5);
        tableColumn.setHeaderValue(mensajes.getString("factura.total"));
        tableColumn = tableColumnModel.getColumn(6);
        tableColumn.setHeaderValue(mensajes.getString("factura.estado"));
        tableColumn = tableColumnModel.getColumn(7);
        tableColumn.setHeaderValue(mensajes.getString("factura.detalle"));
        tableHeader.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFactura = new javax.swing.JTable();

        titulo.setText(mensajes.getString("factura.lista")
        );

        setClosable(true);
        setTitle(titulo.getText());

        tblFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Factura", "Fecha", "Cliente", "Subtotal", "Iva", "Total", "Estado", "Ver detalles"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFacturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFactura);
        if (tblFactura.getColumnModel().getColumnCount() > 0) {
            tblFactura.getColumnModel().getColumn(0).setMinWidth(105);
            tblFactura.getColumnModel().getColumn(0).setPreferredWidth(105);
            tblFactura.getColumnModel().getColumn(0).setMaxWidth(105);
            tblFactura.getColumnModel().getColumn(1).setMinWidth(90);
            tblFactura.getColumnModel().getColumn(1).setPreferredWidth(90);
            tblFactura.getColumnModel().getColumn(1).setMaxWidth(90);
            tblFactura.getColumnModel().getColumn(3).setMinWidth(70);
            tblFactura.getColumnModel().getColumn(3).setPreferredWidth(70);
            tblFactura.getColumnModel().getColumn(3).setMaxWidth(70);
            tblFactura.getColumnModel().getColumn(4).setMinWidth(70);
            tblFactura.getColumnModel().getColumn(4).setPreferredWidth(70);
            tblFactura.getColumnModel().getColumn(4).setMaxWidth(70);
            tblFactura.getColumnModel().getColumn(5).setMinWidth(70);
            tblFactura.getColumnModel().getColumn(5).setPreferredWidth(70);
            tblFactura.getColumnModel().getColumn(5).setMaxWidth(70);
            tblFactura.getColumnModel().getColumn(6).setMinWidth(120);
            tblFactura.getColumnModel().getColumn(6).setPreferredWidth(120);
            tblFactura.getColumnModel().getColumn(6).setMaxWidth(120);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFacturaMouseClicked
        // TODO add your handling code here:
        int columna = tblFactura.getColumnModel().getColumnIndexAtX(evt.getX());
        int fila = evt.getY() / tblFactura.getRowHeight();

        if (fila < tblFactura.getRowCount() && fila >= 0 && columna < tblFactura.getColumnCount() && columna >= 0) {
            Object value = tblFactura.getValueAt(fila, columna);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;
                int numDetalle = evt.getY() / tblFactura.getRowHeight();
                Factura factura = controladorFactura.buscarPosicion(numDetalle);
                if (ventanaReadFactura == null || ventanaReadFactura.isVisible() == false) {
                    ventanaReadFactura = new VentanaReadFactura();
                    ventanaReadFactura.setFactura(factura);
                    ventanaReadFactura.llenarDatos();
                    ventanaReadFactura.setVisible(true);
                    VistaCaja.jDesktopPane1.add(ventanaReadFactura);
                    ventanaReadFactura.toFront();
                    Dimension desktopSize = VistaCaja.jDesktopPane1.getSize();
                    Dimension frameSize = ventanaReadFactura.getSize();
                    ventanaReadFactura.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
                    ventanaReadFactura.setFocusable(true);
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_tblFacturaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFactura;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
