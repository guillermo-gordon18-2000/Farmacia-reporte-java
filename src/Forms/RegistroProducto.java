package Forms;

import bd.BD;
import clases.Icono;
import clases.Validaciones;
import clases.encoder;
import clases.usuario;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *@author 
  Guillermo Gordon     8-959-2011            Fecha:07/21/2021      Grupo: ISL122
                       Luis ceballo          20-14-4700
                       Gil arauz             8-957-1087
                       Bryan Sanches         8-941-880
                       Jeymar Herrera        20-70-5165 
* 
*/
public class RegistroProducto extends javax.swing.JFrame {

    private String imgPathIniciarSesion = "/icons/enter.png";
    private String imgPathLogo = "/icons/Logo1.png";
    private String imgPathUserIocn = "/icons/usuario.png";
    private String imgPathTelefono = "/icons/usuario.png";
     private String imgPathLogotipo = "/icons/Rene.png";
     
    private BD mBd;
    private encoder mEncoder;
    private Validaciones mValidaciones;

    public RegistroProducto() {
        initComponents();
        mBd = new BD("login", "root", "");
        mEncoder = new encoder();
        mValidaciones = new Validaciones();
        this.setSize(778, 581);
        loadIocns();
        setIconImage(new ImageIcon(getClass().getResource(imgPathLogo)).getImage());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
    private void loadIocns() {
        Icono imgInicioSesionIcon = new Icono(pnlRegistrar, imgPathIniciarSesion);
        pnlRegistrar.add(imgInicioSesionIcon).repaint();
        pnlRegistrar.setOpaque(false);
        pnlRegistrar.setBorder(null);
        pnlRegistrar.setBackground(new Color(0, 0, 0, 64));

        Icono imgNombre = new Icono(pnlIconNombre, imgPathUserIocn);
        pnlIconNombre.add(imgNombre).repaint();
        pnlIconNombre.setOpaque(false);
        pnlIconNombre.setBorder(null);
        pnlIconNombre.setBackground(new Color(0, 0, 0, 64));

        Icono imgDireccion = new Icono(pnlDireccion, imgPathUserIocn);
        pnlDireccion.add(imgDireccion).repaint();
        pnlDireccion.setOpaque(false);
        pnlDireccion.setBorder(null);
        pnlDireccion.setBackground(new Color(0, 0, 0, 64));

        Icono imgTelefono = new Icono(pnlTelefono, imgPathTelefono);
        pnlTelefono.add(imgTelefono).repaint();
        pnlTelefono.setOpaque(false);
        pnlTelefono.setBorder(null);
        pnlTelefono.setBackground(new Color(0, 0, 0, 64));
        
        Icono imgPathLogo2 = new Icono(Logo_APP, imgPathLogo );
        Logo_APP.add(imgPathLogo2).repaint();
        Logo_APP.setOpaque(false);
        Logo_APP.setBorder(null);
        Logo_APP.setBackground(new Color(0, 0, 0, 64));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblRegistro = new javax.swing.JLabel();
        pnlRegistrar = new javax.swing.JPanel();
        txtPrecio = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pnlIconNombre = new javax.swing.JPanel();
        pnlDireccion = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        pnlTelefono = new javax.swing.JPanel();
        jTextField18 = new javax.swing.JTextField();
        pnlPassword8 = new javax.swing.JPanel();
        jTextField19 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        lblCarrito1 = new javax.swing.JLabel();
        Logo_APP = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        lblRegistro.setBackground(new java.awt.Color(255, 255, 255));
        lblRegistro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistro.setText("Registro Producto");

        pnlRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlRegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistrarLayout = new javax.swing.GroupLayout(pnlRegistrar);
        pnlRegistrar.setLayout(pnlRegistrarLayout);
        pnlRegistrarLayout.setHorizontalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );
        pnlRegistrarLayout.setVerticalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(102, 102, 102));

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(102, 102, 102));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Descripcion");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Precio Unitario");

        pnlIconNombre.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout pnlIconNombreLayout = new javax.swing.GroupLayout(pnlIconNombre);
        pnlIconNombre.setLayout(pnlIconNombreLayout);
        pnlIconNombreLayout.setHorizontalGroup(
            pnlIconNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnlIconNombreLayout.setVerticalGroup(
            pnlIconNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlDireccion.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout pnlDireccionLayout = new javax.swing.GroupLayout(pnlDireccion);
        pnlDireccion.setLayout(pnlDireccionLayout);
        pnlDireccionLayout.setHorizontalGroup(
            pnlDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnlDireccionLayout.setVerticalGroup(
            pnlDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(102, 102, 102));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Cantidad");

        pnlTelefono.setPreferredSize(new java.awt.Dimension(30, 30));

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(102, 102, 102));

        pnlPassword8.setPreferredSize(new java.awt.Dimension(30, 30));

        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout pnlPassword8Layout = new javax.swing.GroupLayout(pnlPassword8);
        pnlPassword8.setLayout(pnlPassword8Layout);
        pnlPassword8Layout.setHorizontalGroup(
            pnlPassword8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnlPassword8Layout.setVerticalGroup(
            pnlPassword8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Contraseña");

        javax.swing.GroupLayout pnlTelefonoLayout = new javax.swing.GroupLayout(pnlTelefono);
        pnlTelefono.setLayout(pnlTelefonoLayout);
        pnlTelefonoLayout.setHorizontalGroup(
            pnlTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTelefonoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlPassword8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlTelefonoLayout.setVerticalGroup(
            pnlTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTelefonoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel23)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlPassword8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        lblCarrito1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCarrito1.setForeground(new java.awt.Color(255, 255, 255));
        lblCarrito1.setText("Retornar al menu");
        lblCarrito1.setToolTipText("");
        lblCarrito1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarrito1MouseClicked(evt);
            }
        });

        Logo_APP.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout Logo_APPLayout = new javax.swing.GroupLayout(Logo_APP);
        Logo_APP.setLayout(Logo_APPLayout);
        Logo_APPLayout.setHorizontalGroup(
            Logo_APPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );
        Logo_APPLayout.setVerticalGroup(
            Logo_APPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(pnlRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCarrito1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Logo_APP, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnlDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlIconNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegistro)
                            .addComponent(jLabel15)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo_APP, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblRegistro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlIconNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(pnlRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCarrito1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegistrarMouseClicked
        if (!txtDescripcion.getText().trim().equals("") && !txtPrecio.getText().trim().equals("") && !txtCantidad.getText().trim().equals("")) {
            usuario mUsuario = new usuario();
            mUsuario.setMedicamento(txtDescripcion.getText().trim());
            mUsuario.setPrecio_unitario(Float.valueOf(txtPrecio.getText().trim()));
            mUsuario.setCantidad(txtCantidad.getText().trim());

            if (mBd.Conectar()){
                if (mBd.AddProducto(mUsuario)){
                    JOptionPane.showMessageDialog(null, "Alta producto exitoso!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error al conectar");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
    }//GEN-LAST:event_pnlRegistrarMouseClicked

    private void lblCarrito1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarrito1MouseClicked
        this.dispose();
        JFORM_ADM Menu = new JFORM_ADM();
        Menu.setVisible(true);
    }//GEN-LAST:event_lblCarrito1MouseClicked

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
            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Logo_APP;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JLabel lblCarrito1;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JPanel pnlDireccion;
    private javax.swing.JPanel pnlIconNombre;
    private javax.swing.JPanel pnlPassword8;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JPanel pnlTelefono;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

}
