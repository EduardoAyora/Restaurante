/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.mesero;

import ec.edu.ups.controlador.ControladorMesa;
import ec.edu.ups.modelo.Mesa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author Eduardo Ayora
 */
public class ListaMesas extends javax.swing.JFrame {

    private List<JButton> botones;
    private ControladorMesa controladorMesa;
    private List<Mesa> mesas;
    /**
     * Creates new form ListaMesa
     */
    public ListaMesas() {
        initComponents();
        this.setLocationRelativeTo(null);
        botones = new ArrayList<>();
    }

    public void setMesas(ControladorMesa controladorMesa, List<Mesa> mesas) {
        this.controladorMesa = controladorMesa;
        this.mesas = mesas;
        //--------------------------------------------------------------------------------------------
        Mesa mesa = new Mesa();
        controladorMesa.create(mesa);
        controladorMesa.create(mesa);
        agregarBotones();
        //---------------------------------------------------------------------------------------------
    }
    
    public void agregarBotones(){
        for(int i = 1; i < controladorMesa.getContador(); i++){
            JButton btn = new JButton("Mesa " + Integer.toString(controladorMesa.getLista().get(i - 1).getNumeroMesa()));
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("boton");
                }
            });
            panel.add(btn);
            botones.add(btn);
            panel.updateUI();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.GridLayout(8, 1));
        jScrollPane1.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
