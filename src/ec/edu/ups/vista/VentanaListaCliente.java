/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Mesero;
import java.util.ResourceBundle;
//import ec.edu.ups.controlador.ControladorMesero;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


/**
 *
 * @author DELL
 */
public class VentanaListaCliente extends javax.swing.JInternalFrame {
    
    private ControladorCliente controladorCliente;
    private ResourceBundle mensajes;
    //ControladorMesero controladorMesero;
    /**
     * Creates new form VentanaListaMesero
     */
    public VentanaListaCliente(ControladorCliente controladorCliente,ResourceBundle mensajes) {
        
        this.controladorCliente=controladorCliente;
        this.mensajes=mensajes;
        initComponents();
        llenarDatos();
        cambiarIdioma(mensajes);
    }
     public void cambiarIdioma(ResourceBundle mensajes) {
        titulo.setText(mensajes.getString("titulo.cliente.listar"));
        JTableHeader tableHeader = tblCliente.getTableHeader();
        TableColumnModel tableColumnModel = tableHeader.getColumnModel();
        TableColumn tableColumn;
        tableColumn = tableColumnModel.getColumn(0);
        tableColumn.setHeaderValue(mensajes.getString("cliente.codigo"));
        tableColumn = tableColumnModel.getColumn(1);
        tableColumn.setHeaderValue(mensajes.getString("cliente.cedula"));
        tableColumn = tableColumnModel.getColumn(2);
        tableColumn.setHeaderValue(mensajes.getString("txt.nombre"));
        tableColumn = tableColumnModel.getColumn(3);
        tableColumn.setHeaderValue(mensajes.getString("cliente.direccion"));
        tableColumn = tableColumnModel.getColumn(4);
        tableColumn.setHeaderValue(mensajes.getString("cliente.telefono"));
        tableColumn = tableColumnModel.getColumn(5);
        tableColumn.setHeaderValue(mensajes.getString("txt.correo"));
        tableHeader.repaint();

    }

    public void llenarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) tblCliente.getModel();
        Set<Cliente> lista = controladorCliente.getLista();
        for (Cliente cliente : lista) {
            Object[] datos = {cliente.getCodigo(),
                cliente.getCedula(), cliente.getNombre(),
                cliente.getDireccion(), cliente.getTelefono(),
                cliente.getCorreo()
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

        titulo = new javax.swing.JLabel();
        tablaCliente = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();

        titulo.setText(mensajes.getString("titulo.cliente.listar"));

        setClosable(true);
        setMaximizable(true);
        setTitle(titulo.getText());

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cédula", "Nombre", "Dirección", "Teléfono", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCliente.setViewportView(tblCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane tablaCliente;
    private javax.swing.JTable tblCliente;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
