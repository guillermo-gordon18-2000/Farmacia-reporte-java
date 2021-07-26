package Forms;
import bd.BD;
import clases.EnvioCorreo;
import clases.Icono;
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


public class LoginFrm extends javax.swing.JFrame {
    private String imgPathIniciarSesion = "/icons/enter.png";
    private String imgPathLogo = "/icons/Logo1.png";
    private String imgPathUserIocn = "/icons/usuario.png";
    private String imgPathPassword = "/icons/candado.png";
    private BD mBd;
    private encoder mEncoder;
    private int  contador=0;
    public LoginFrm() {
        initComponents();
        loadIocns();
        
        mEncoder = new encoder();
        mBd = new BD("login", "root", "");
        setIconImage(new ImageIcon(getClass().getResource(imgPathLogo)).getImage());
        
        this.setSize(360, 470);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    private void loadIocns() {
        Icono imgInicioSesionIcon = new Icono(pnlIniciarSesion, imgPathIniciarSesion);
        pnlIniciarSesion.add(imgInicioSesionIcon).repaint();
        pnlIniciarSesion.setOpaque(false);
        pnlIniciarSesion.setBorder(null);
        pnlIniciarSesion.setBackground(new Color(0, 0, 0, 64));

        Icono imgUser = new Icono(pnlIconUser, imgPathUserIocn);
        pnlIconUser.add(imgUser).repaint();
        pnlIconUser.setOpaque(false);
        pnlIconUser.setBorder(null);
        pnlIconUser.setBackground(new Color(0, 0, 0, 64));

        Icono imgPassword = new Icono(pnlPassword, imgPathPassword);
        pnlPassword.add(imgPassword).repaint();
        pnlPassword.setOpaque(false);
        pnlPassword.setBorder(null);
        pnlPassword.setBackground(new Color(0, 0, 0, 64));
        
 
        cbMostrarPsword.setOpaque(false);
        cbMostrarPsword.setBorder(null);
        cbMostrarPsword.setBackground(new Color(0, 0, 0, 64));
        
        Icono logotipo = new Icono(Logo_APP, imgPathLogo);
        Logo_APP.add(logotipo).repaint();
        Logo_APP.setOpaque(false);
        Logo_APP.setBorder(null);
        Logo_APP.setBackground(new Color(0, 0, 0, 64));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlIniciarSesion = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlIconUser = new javax.swing.JPanel();
        pnlPassword = new javax.swing.JPanel();
        lblRegistro = new javax.swing.JLabel();
        cbMostrarPsword = new javax.swing.JCheckBox();
        txtPassword = new javax.swing.JPasswordField();
        Logo_APP = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 450));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");

        pnlIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlIniciarSesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlIniciarSesionLayout = new javax.swing.GroupLayout(pnlIniciarSesion);
        pnlIniciarSesion.setLayout(pnlIniciarSesionLayout);
        pnlIniciarSesionLayout.setHorizontalGroup(
            pnlIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );
        pnlIniciarSesionLayout.setVerticalGroup(
            pnlIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.setSelectionColor(new java.awt.Color(255, 102, 0));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");

        pnlIconUser.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout pnlIconUserLayout = new javax.swing.GroupLayout(pnlIconUser);
        pnlIconUser.setLayout(pnlIconUserLayout);
        pnlIconUserLayout.setHorizontalGroup(
            pnlIconUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnlIconUserLayout.setVerticalGroup(
            pnlIconUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlPassword.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout pnlPasswordLayout = new javax.swing.GroupLayout(pnlPassword);
        pnlPassword.setLayout(pnlPasswordLayout);
        pnlPasswordLayout.setHorizontalGroup(
            pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        pnlPasswordLayout.setVerticalGroup(
            pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        lblRegistro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistro.setText("Registro");
        lblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroMouseClicked(evt);
            }
        });

        cbMostrarPsword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMostrarPswordActionPerformed(evt);
            }
        });

        txtPassword.setSelectionColor(new java.awt.Color(204, 102, 0));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlIconUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegistro)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMostrarPsword))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Logo_APP, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logo_APP, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)))
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlIconUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbMostrarPsword))
                .addGap(33, 33, 33)
                .addComponent(pnlIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRegistro)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseClicked
       
        this.dispose();
        RegistroFrm mRegistro = new RegistroFrm();
        mRegistro.setVisible(true);
        
        
    }//GEN-LAST:event_lblRegistroMouseClicked

    private void pnlIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIniciarSesionMouseClicked
        usuario mUsuario = new usuario();
        EnvioCorreo envioC = new EnvioCorreo();
        String Correo="";
        String Pasword = ""; 
        
        
  try{  
      if (!txtUsuario.getText().trim().equals("") && !txtPassword.getText().trim().equals("")) {//si esta vacio
            if (mBd.Conectar()) {
                mUsuario = mBd.GetUsuario(txtUsuario.getText().trim());
                Pasword = mEncoder.ecnode(txtPassword.getText().trim());

                    Correo = mUsuario.getCorreo();
              if (Pasword.equals(mUsuario.getContrasena())) {
                       JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
                       JFORM_ADM Panel_B = new JFORM_ADM();
                       Panel_B.setVisible(true);
                }else {
                        JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
                        contador++;
                    if (contador == 3){
                        envioC.CuentaBloqueada(Correo);
                        JOptionPane.showMessageDialog(null, "Cuenta Bloqueada, contactese con el administrador"); 
                        contador=0;
                  }
                    
                } 
  
             }else{
                        JOptionPane.showMessageDialog(null, "Error al conectar");
          }
             
        }else{
                       JOptionPane.showMessageDialog(null, "Ingrese el usuario y contraseña");
      }   
     }  catch(java.lang.NullPointerException ex){ 
    JOptionPane.showMessageDialog(null, "Usuario incorrecto");
  }          
        
      
      








//
    }//GEN-LAST:event_pnlIniciarSesionMouseClicked

    private void cbMostrarPswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMostrarPswordActionPerformed
        if (cbMostrarPsword.isSelected()) {
            txtPassword.setEchoChar((char) 0);
        } else {
            txtPassword.setEchoChar('*');
      }
        
    }//GEN-LAST:event_cbMostrarPswordActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Logo_APP;
    private javax.swing.JCheckBox cbMostrarPsword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JPanel pnlIconUser;
    private javax.swing.JPanel pnlIniciarSesion;
    private javax.swing.JPanel pnlPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
