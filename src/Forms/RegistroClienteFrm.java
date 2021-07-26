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
public class RegistroClienteFrm extends javax.swing.JFrame {

    private String imgPathIniciarSesion = "/icons/enter.png";
    private String imgPathLogo =     "/icons/Logo1.png";
    private String imgPathUserIocn = "/icons/usuario.png";
    private String imgPathTelefono = "/icons/telefono.png";
    private BD mBd;
    private encoder mEncoder;
    private Validaciones mValidaciones;

    public RegistroClienteFrm() {
        initComponents();
        mBd = new BD("login", "root", "");
        mEncoder = new encoder();
        mValidaciones = new Validaciones();
        this.setSize(780, 590);
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
        
        Icono imgfechaN = new Icono(pnlfechaN, imgPathUserIocn);
        pnlfechaN.add(imgfechaN).repaint();
        pnlfechaN.setOpaque(false);
        pnlfechaN.setBorder(null);
        pnlfechaN.setBackground(new Color(0, 0, 0, 64));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
        lblRegistro = new javax.swing.JLabel();
        pnlRegistrar = new javax.swing.JPanel();
        txtDireccion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pnlIconNombre = new javax.swing.JPanel();
        pnlDireccion = new javax.swing.JPanel();
        txtfechaN = new javax.swing.JTextField();
        pnlfechaN = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        pnlPassword4 = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        pnlTelefono = new javax.swing.JPanel();
        jTextField18 = new javax.swing.JTextField();
        pnlPassword8 = new javax.swing.JPanel();
        jTextField19 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        lblCarrito = new javax.swing.JLabel();
        lblCarrito1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.setFocusCycleRoot(true);

        lblRegistro.setBackground(new java.awt.Color(255, 255, 255));
        lblRegistro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistro.setText("Registro Cliente");

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

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(102, 102, 102));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre y apellido");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Dirección");

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

        txtfechaN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfechaN.setForeground(new java.awt.Color(102, 102, 102));
        txtfechaN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtfechaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaNActionPerformed(evt);
            }
        });

        pnlfechaN.setPreferredSize(new java.awt.Dimension(30, 30));

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(102, 102, 102));

        pnlPassword4.setPreferredSize(new java.awt.Dimension(30, 30));

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout pnlPassword4Layout = new javax.swing.GroupLayout(pnlPassword4);
        pnlPassword4.setLayout(pnlPassword4Layout);
        pnlPassword4Layout.setHorizontalGroup(
            pnlPassword4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnlPassword4Layout.setVerticalGroup(
            pnlPassword4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Contraseña");

        javax.swing.GroupLayout pnlfechaNLayout = new javax.swing.GroupLayout(pnlfechaN);
        pnlfechaN.setLayout(pnlfechaNLayout);
        pnlfechaNLayout.setHorizontalGroup(
            pnlfechaNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlfechaNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlfechaNLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlPassword4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlfechaNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel18)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlfechaNLayout.setVerticalGroup(
            pnlfechaNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnlfechaNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlfechaNLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel18)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlfechaNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlPassword4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Fecha de Nacimiento");

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(102, 102, 102));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Teléfono");

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

        lblCarrito.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCarrito.setForeground(new java.awt.Color(255, 255, 255));
        lblCarrito.setText("Añadir medicamentos al carrito");
        lblCarrito.setToolTipText("");
        lblCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarritoMouseClicked(evt);
            }
        });

        lblCarrito1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCarrito1.setForeground(new java.awt.Color(255, 255, 255));
        lblCarrito1.setText("Retornar al menu");
        lblCarrito1.setToolTipText("");
        lblCarrito1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarrito1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lblRegistro))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCarrito1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pnlIconNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pnlDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(64, 64, 64)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel15)
                                                .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                                .addComponent(txtNombre)))
                                        .addComponent(jLabel22)))
                                .addComponent(pnlTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(pnlfechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19)
                                        .addComponent(txtfechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCarrito)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblRegistro)
                .addGap(41, 41, 41)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlIconNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtfechaN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlfechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(pnlRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarrito)
                    .addComponent(lblCarrito1))
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
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegistrarMouseClicked
        if (!txtNombre.getText().trim().equals("") && !txtDireccion.getText().trim().equals("") && !txtfechaN.getText().trim().equals("") && !txtTelefono.getText().trim().equals("")) {
            if (txtTelefono.getText().length() == 10) {
                usuario mUsuario = new usuario();
                mUsuario.setNombre(txtNombre.getText().trim());
                mUsuario.setDireccion(txtDireccion.getText().trim());
                mUsuario.setTelefono(txtTelefono.getText().trim());
                mUsuario.setUsuario(txtfechaN.getText().trim());
                
                      
                          if (mBd.Conectar()) {
                          if (mBd.AddCliente(mUsuario)) {
                             // JOptionPane.showMessageDialog(null, "    "+almo );
                             JOptionPane.showMessageDialog(null, "Alta cliente exitosa!");
                             }
                            }
                    
                     else {
                         JOptionPane.showMessageDialog(null, "Error al conectar");
                        
                        }
                    
                      } 
            
                else{
                   JOptionPane.showMessageDialog(null, "Número de telefono inválido");
                   
                 }
            
               } 
        
        else {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
           }
        
        
        
        
    }//GEN-LAST:event_pnlRegistrarMouseClicked

    private void lblCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarritoMouseClicked
        this.dispose();
        Farmacia Panel_C = new Farmacia();
        Panel_C.setVisible(true);
    }//GEN-LAST:event_lblCarritoMouseClicked

    private void txtfechaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaNActionPerformed

    private void lblCarrito1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarrito1MouseClicked
        this.dispose();
        JFORM_ADM Menu = new JFORM_ADM();
        Menu.setVisible(true);
    }//GEN-LAST:event_lblCarrito1MouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroClienteFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroClienteFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroClienteFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroClienteFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroClienteFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblCarrito;
    private javax.swing.JLabel lblCarrito1;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JPanel pnlDireccion;
    private javax.swing.JPanel pnlIconNombre;
    private javax.swing.JPanel pnlPassword4;
    private javax.swing.JPanel pnlPassword8;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JPanel pnlTelefono;
    private javax.swing.JPanel pnlfechaN;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtfechaN;
    // End of variables declaration//GEN-END:variables
}
