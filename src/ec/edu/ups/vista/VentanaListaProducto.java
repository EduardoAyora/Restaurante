/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Producto;
import ec.edu.ups.modelo.Render;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author DELL
 */
public class VentanaListaProducto extends javax.swing.JInternalFrame {

    ControladorProducto controladorProducto;
    ResourceBundle mensajes;
    JLabel titulo;

    /**
     * Creates new form VentanaListaProducto
     */
    public VentanaListaProducto(ControladorProducto controladorProducto, ResourceBundle mensajes) {
        titulo = new JLabel(mensajes.getString("producto.lista"));
        initComponents();
        this.controladorProducto = controladorProducto;
        this.mensajes = mensajes;
        cambiarIdiomas(mensajes);
        llenarDatos();
        tbProducto.setRowHeight(60);
    }

    public void cambiarIdiomas(ResourceBundle mensajes) {
        titulo.setText(mensajes.getString("producto.lista"));
        JTableHeader tableHeader = tbProducto.getTableHeader();
        TableColumnModel tableColumnModel = tableHeader.getColumnModel();
        TableColumn tableColumn;
        tableColumn = tableColumnModel.getColumn(0);
        tableColumn.setHeaderValue(mensajes.getString("txt.codigo"));
        tableColumn = tableColumnModel.getColumn(1);
        tableColumn.setHeaderValue(mensajes.getString("txt.nombre"));
        tableColumn = tableColumnModel.getColumn(2);
        tableColumn.setHeaderValue(mensajes.getString("producto.precio"));
        tableColumn = tableColumnModel.getColumn(3);
        tableColumn.setHeaderValue(mensajes.getString("producto.detalle"));
        tableColumn = tableColumnModel.getColumn(4);
        tableColumn.setHeaderValue(mensajes.getString("producto.categoria"));
        tableColumn = tableColumnModel.getColumn(5);
        tableColumn.setHeaderValue(mensajes.getString("txt.imagen"));
        tableHeader.repaint();
    }

    public void llenarDatos() {
        tbProducto.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel modelo = (DefaultTableModel) tbProducto.getModel();
        List<Producto> lista = controladorProducto.getLista();
        for (Producto producto : lista) {
            Object[] datos = {producto.getCodigoProducto(),
                producto.getNombre(), producto.getPrecio(),
                producto.getDescripcion(), producto.getCategoria().getNombre(),
                new JLabel(producto.getImgIcon(), JLabel.CENTER)
            };
            modelo.addRow(datos);
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

        scroller = new javax.swing.JScrollPane();
        tbProducto = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setTitle(titulo.getText());

        tbProducto.setAutoCreateRowSorter(true);
        tbProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Precio", "Descripción", "Categoría", "Imagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroller.setViewportView(tbProducto);
        if (tbProducto.getColumnModel().getColumnCount() > 0) {
            tbProducto.getColumnModel().getColumn(0).setMinWidth(70);
            tbProducto.getColumnModel().getColumn(0).setPreferredWidth(70);
            tbProducto.getColumnModel().getColumn(0).setMaxWidth(70);
            tbProducto.getColumnModel().getColumn(1).setMinWidth(90);
            tbProducto.getColumnModel().getColumn(1).setPreferredWidth(90);
            tbProducto.getColumnModel().getColumn(2).setMinWidth(70);
            tbProducto.getColumnModel().getColumn(2).setPreferredWidth(70);
            tbProducto.getColumnModel().getColumn(2).setMaxWidth(70);
            tbProducto.getColumnModel().getColumn(3).setMinWidth(90);
            tbProducto.getColumnModel().getColumn(3).setPreferredWidth(90);
            tbProducto.getColumnModel().getColumn(4).setMinWidth(80);
            tbProducto.getColumnModel().getColumn(4).setPreferredWidth(80);
            tbProducto.getColumnModel().getColumn(4).setMaxWidth(80);
            tbProducto.getColumnModel().getColumn(5).setMinWidth(80);
            tbProducto.getColumnModel().getColumn(5).setPreferredWidth(80);
            tbProducto.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroller, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroller, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scroller;
    private javax.swing.JTable tbProducto;
    // End of variables declaration//GEN-END:variables
}
