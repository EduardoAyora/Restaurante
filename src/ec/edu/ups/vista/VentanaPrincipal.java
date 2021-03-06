/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.vista.gerente.VistaGerente;
import ec.edu.ups.vista.caja.VistaCaja;
import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorFactura;
import ec.edu.ups.controlador.ControladorMesa;
import ec.edu.ups.controlador.ControladorMesero;
import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.datoscreados.GenerarMesa;
import ec.edu.ups.datoscreados.GenerarMesero;
import ec.edu.ups.datoscreados.GenerarProducto;
import ec.edu.ups.modelo.ClaveCaja;
import ec.edu.ups.modelo.ClaveGerente;
import ec.edu.ups.vista.mesero.UsuarioMesero;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author DELL
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ControladorMesa controladorMesa;
    private ControladorProducto controladorProducto;
    private ControladorMesero controladorMesero;
    private ControladorFactura controladorFactura;
    private ControladorCliente controladorCliente;
    private ContraseniaCaja contraseniaCaja;
    private Contrasenia contrasenia;
    private CambioContrasenia cambioContrasenia;
    private Locale localizacion;
    private ResourceBundle mensajes;
    private ClaveGerente claveGerente;
    private ClaveCaja claveCaja;
    public static UsuarioMesero usuarioMesero;
    public static VistaCaja vistaCaja;
    public static VistaGerente vistaGerente;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        controladorMesa = new ControladorMesa();
        controladorProducto = new ControladorProducto();
        controladorMesero = new ControladorMesero();
        controladorFactura = new ControladorFactura();
        controladorCliente = new ControladorCliente();
        claveGerente = new ClaveGerente();
        claveCaja = new ClaveCaja();
        localizacion = new Locale("es", "EC");
        Locale.setDefault(localizacion);
        cambiarIdioma();
        //Para pruebas
        //--------------------------------------------------------------------------------------------
        GenerarMesa generarMesa = new GenerarMesa(controladorMesa);
        GenerarMesero generarMesero = new GenerarMesero(controladorMesero);
        GenerarProducto generarProductos = new GenerarProducto(controladorProducto);
        //---------------------------------------------------------------------------------------------
    }

    public void cambiarIdioma() {

        mensajes = ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes", Locale.getDefault());
        lblMesero.setText(mensajes.getString("txt.mesero"));
        lblGerente.setText(mensajes.getString("lbl.gerente"));
        lblCaja.setText(mensajes.getString("txt.caja"));

        menuAjustes.setText(mensajes.getString("txt.ajustes"));
        itmPass.setText(mensajes.getString("txt.admin.contraseñas"));
        itmAyuda.setText(mensajes.getString("itm.ayuda"));
        itmSalir.setText(mensajes.getString("itm.salir"));

        menuIdioma.setText(mensajes.getString("vista.idiomas"));
        itmEspañol.setText(mensajes.getString("vista.item.español"));
        itmIngles.setText(mensajes.getString("vista.item.ingles"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        bGerente = new javax.swing.JButton();
        bCaja = new javax.swing.JButton();
        bMesero = new javax.swing.JButton();
        lblGerente = new javax.swing.JLabel();
        lblCaja = new javax.swing.JLabel();
        lblMesero = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuAjustes = new javax.swing.JMenu();
        itmPass = new javax.swing.JMenuItem();
        itmAyuda = new javax.swing.JMenuItem();
        itmSalir = new javax.swing.JMenuItem();
        menuIdioma = new javax.swing.JMenu();
        itmEspañol = new javax.swing.JMenuItem();
        itmIngles = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurante");
        setResizable(false);

        bGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/gerenteR.png"))); // NOI18N
        bGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGerenteActionPerformed(evt);
            }
        });

        bCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/cajaR.png"))); // NOI18N
        bCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCajaActionPerformed(evt);
            }
        });

        bMesero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/meseroR.png"))); // NOI18N
        bMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMeseroActionPerformed(evt);
            }
        });

        lblGerente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblGerente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGerente.setText("Gerente");

        lblCaja.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaja.setText("Caja");

        lblMesero.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblMesero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMesero.setText("Mesero");

        menuAjustes.setText("Ajustes");

        itmPass.setText("Administrar contraseñas");
        itmPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmPassActionPerformed(evt);
            }
        });
        menuAjustes.add(itmPass);

        itmAyuda.setText("Ayuda");
        menuAjustes.add(itmAyuda);

        itmSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        itmSalir.setText("Salir");
        itmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSalirActionPerformed(evt);
            }
        });
        menuAjustes.add(itmSalir);

        menuBar.add(menuAjustes);

        menuIdioma.setText("Idioma");

        itmEspañol.setText("Español");
        itmEspañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEspañolActionPerformed(evt);
            }
        });
        menuIdioma.add(itmEspañol);

        itmIngles.setText("Inglés");
        itmIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmInglesActionPerformed(evt);
            }
        });
        menuIdioma.add(itmIngles);

        menuBar.add(menuIdioma);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGerente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGerente)
                    .addComponent(lblCaja)
                    .addComponent(lblMesero))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGerenteActionPerformed
        if (vistaGerente == null || vistaGerente.isVisible() == false) {
            contrasenia = new Contrasenia(controladorProducto, controladorMesero, controladorMesa, claveGerente, mensajes, vistaGerente);
            contrasenia.toFront();
            contrasenia.setVisible(true);
            this.toBack();
        } else {
            vistaGerente.toFront();
        }
    }//GEN-LAST:event_bGerenteActionPerformed

    private void bCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCajaActionPerformed
        if (vistaCaja == null || vistaCaja.isVisible() == false) {
            contraseniaCaja = new ContraseniaCaja(controladorFactura, controladorCliente, controladorMesa, claveCaja, vistaCaja, mensajes);
            contraseniaCaja.toFront();
            contraseniaCaja.setVisible(true);
            this.toBack();
        } else {
            vistaCaja.toFront();
        }
    }//GEN-LAST:event_bCajaActionPerformed

    private void bMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMeseroActionPerformed
        if (usuarioMesero == null || usuarioMesero.isVisible() == false) {
            usuarioMesero = new UsuarioMesero(controladorMesero, controladorMesa, controladorProducto, mensajes);
            usuarioMesero.toFront();
            usuarioMesero.setVisible(true);
            this.toBack();
        } else {
            usuarioMesero.toFront();
        }
    }//GEN-LAST:event_bMeseroActionPerformed

    private void itmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itmSalirActionPerformed

    private void itmEspañolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEspañolActionPerformed
        // TODO add your handling code here:
        localizacion = new Locale("es", "EC");
        Locale.setDefault(localizacion);
        cambiarIdioma();
        comprobaciones();
    }//GEN-LAST:event_itmEspañolActionPerformed

    private void itmInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmInglesActionPerformed
        // TODO add your handling code here:
        localizacion = new Locale("en", "US");
        Locale.setDefault(localizacion);
        cambiarIdioma();
        comprobaciones();
    }//GEN-LAST:event_itmInglesActionPerformed

    private void itmPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmPassActionPerformed
        // TODO add your handling code here:
        if (cambioContrasenia == null || cambioContrasenia.isVisible() == false) {
            cambioContrasenia = new CambioContrasenia(controladorMesero, claveGerente, claveCaja, mensajes);
            cambioContrasenia.setVisible(true);
            cambioContrasenia.toFront();
        } else {
            cambioContrasenia.toFront();
        }

    }//GEN-LAST:event_itmPassActionPerformed

    private void comprobaciones() {

        if (usuarioMesero != null && usuarioMesero.isVisible()) {
            usuarioMesero.cambiarIdioma(mensajes);
        }

        if (cambioContrasenia != null && cambioContrasenia.isVisible()) {
            cambioContrasenia.cambiarIdioma(mensajes);
        }

        if (contrasenia != null && contrasenia.isVisible()) {
            contrasenia.cambiarIdiomas(mensajes);
        }
        
        if (contraseniaCaja != null && contraseniaCaja.isVisible()) {
            contraseniaCaja.cambiarIdiomas(mensajes);
        }
        
        if (ContraseniaCaja.vistaCaja != null && ContraseniaCaja.vistaCaja.isVisible()) {
            ContraseniaCaja.vistaCaja.setMensajes(mensajes);
            ContraseniaCaja.vistaCaja.cambiarIdioma(mensajes);
        }
        
        if (Contrasenia.vistaGerente != null && Contrasenia.vistaGerente.isVisible()) {
            Contrasenia.vistaGerente.setMensajes(mensajes);
            Contrasenia.vistaGerente.cambiarIdiomas(mensajes);
        }
        
        if(UsuarioMesero.vistaMesero != null && UsuarioMesero.vistaMesero.isVisible()){
            UsuarioMesero.vistaMesero.setMensajes(mensajes);
            UsuarioMesero.vistaMesero.reiniciar();
        }
        
        if(UsuarioMesero.vistaMesero.abrirMesa != null && UsuarioMesero.vistaMesero.abrirMesa.isVisible()){
            UsuarioMesero.vistaMesero.abrirMesa.setMensajes(mensajes);
            UsuarioMesero.vistaMesero.abrirMesa.reiniciar();
        }
        
        if(UsuarioMesero.vistaMesero.vistaMesa != null && UsuarioMesero.vistaMesero.vistaMesa.isVisible()){
            UsuarioMesero.vistaMesero.vistaMesa.setMensajes(mensajes);
            UsuarioMesero.vistaMesero.vistaMesa.cambiarIdioma(mensajes);
        }
        
        if(UsuarioMesero.vistaMesero.vistaMesa.agregarProducto != null && UsuarioMesero.vistaMesero.vistaMesa.agregarProducto.isVisible()){
            UsuarioMesero.vistaMesero.vistaMesa.agregarProducto.setMensajes(mensajes);
            UsuarioMesero.vistaMesero.vistaMesa.agregarProducto.cambiarIdioma(mensajes);
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCaja;
    private javax.swing.JButton bGerente;
    private javax.swing.JButton bMesero;
    private javax.swing.JMenuItem itmAyuda;
    private javax.swing.JMenuItem itmEspañol;
    private javax.swing.JMenuItem itmIngles;
    private javax.swing.JMenuItem itmPass;
    private javax.swing.JMenuItem itmSalir;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblCaja;
    private javax.swing.JLabel lblGerente;
    private javax.swing.JLabel lblMesero;
    private javax.swing.JMenu menuAjustes;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuIdioma;
    // End of variables declaration//GEN-END:variables

}
