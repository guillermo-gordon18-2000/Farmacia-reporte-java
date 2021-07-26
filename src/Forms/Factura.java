package Forms;

import bd.BD;
import clases.usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *@author 
  Guillermo Gordon     8-959-2011            Fecha:07/21/2021      Grupo: ISL122
                       Luis ceballo          20-14-4700
                       Gil arauz             8-957-1087
                       Bryan Sanches         8-941-880
                       Jeymar Herrera        20-70-5165 
* 
*/
public class Factura extends javax.swing.JFrame {
  public BD mBd;
  DefaultTableModel modelo2 = new DefaultTableModel();
  DecimalFormat df = new DecimalFormat("#.00");
  private String imgPathLogo = "/icons/Logo_1.png";
 
       
       
 
    public Factura() {
        //  Farmacia Panel_Ce = new Farmacia();
          //Panel_Ce.setVisible(false);
        initComponents();
        mBd = new BD("login", "root", "");
        modelo2.addColumn("ID Medicamentos");
        modelo2.addColumn("Medicamento");
        modelo2.addColumn("Precio Unitario");
        modelo2.addColumn("Cantidad");
        jTResultado2.setModel(modelo2);
        setIconImage(new ImageIcon(getClass().getResource(imgPathLogo)).getImage());
      
    }
    
    public double Suma(){
        
        int sum = jTResultado2.getRowCount();
        double suma = 0.00;
        for (int i = 0; i < sum; i++){
            suma = suma + (Double.parseDouble(jTResultado2.getValueAt(i, 2).toString()) * Double.parseDouble(jTResultado2.getValueAt(i, 3).toString()));
        } 
        return suma;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtxtTotal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTResultado2 = new javax.swing.JTable();
        jBoton = new javax.swing.JButton();
        jReportes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblCarrito1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 450));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Factura");

        jTResultado2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Medicamentos", "Medicamento", "Precio Unitario", "Cantidad"
            }
        ));
        jTResultado2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTResultado2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTResultado2);

        jBoton.setBackground(new java.awt.Color(255, 204, 102));
        jBoton.setText("Total");
        jBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonActionPerformed(evt);
            }
        });

        jReportes.setBackground(new java.awt.Color(255, 204, 102));
        jReportes.setText("Agregar a reportes");
        jReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReportesActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setText("Ver reportes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblCarrito1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCarrito1.setForeground(new java.awt.Color(255, 255, 255));
        lblCarrito1.setText("Retornar al menu");
        lblCarrito1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jBoton)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jReportes))
                                .addGap(64, 64, 64))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblCarrito1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBoton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jReportes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarrito1)
                    .addComponent(jButton1))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTResultado2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResultado2MouseClicked

    }//GEN-LAST:event_jTResultado2MouseClicked

    private void jBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonActionPerformed
        Suma();
        jtxtTotal.setText(String.valueOf(df.format(Suma())));
        
    }//GEN-LAST:event_jBotonActionPerformed

    private void jReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReportesActionPerformed
    usuario mUsuario = new usuario(); 
                  
                    for (int i = 0; i < jTResultado2.getRowCount(); i++){ 
                   
                        mUsuario.getUsuario_id();
                        mUsuario.setMedicamento((String) jTResultado2.getValueAt(i, 1).toString());
                        mUsuario.setId_medica(Integer.parseInt ((String) jTResultado2.getValueAt(i, 0))) ;
                        mUsuario.setPrecio_unitario(Float.parseFloat((String)jTResultado2.getValueAt(i, 2))) ;
                        mUsuario.setCantidad(((String) jTResultado2.getValueAt(i, 3)));
                        
                      
                      
                        
                    if (mBd.Conectar()){
                    if (mBd.AddFactura(mUsuario)){
                   
                       }
             
                 
                    }else{
                   JOptionPane.showMessageDialog(null, "Error al conectar");
        
               }
        
        
          } 
        JOptionPane.showMessageDialog(null, "Alta reporte exitoso!");

    }//GEN-LAST:event_jReportesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         this.dispose(); 
        Reporte re = new Reporte(); 
        re.setVisible(true);
      
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBoton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jReportes;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTResultado2;
    private javax.swing.JTextField jtxtTotal;
    private javax.swing.JLabel lblCarrito1;
    // End of variables declaration//GEN-END:variables
}
