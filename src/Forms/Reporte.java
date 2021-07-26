
package Forms;


import bd.BD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
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
public class Reporte extends javax.swing.JFrame {
    public BD mBd;
    private String imgPathLogo = "/icons/Logo1.png";
   
     
    
    public Reporte() {
      DefaultTableModel modelo = new DefaultTableModel();  
       initComponents();
       this.setLocationRelativeTo(null); 
       setIconImage(new ImageIcon(getClass().getResource(imgPathLogo)).getImage());
        modelo.removeTableModelListener(jReportes);
        modelo.addColumn("ID Reportes");
        modelo.addColumn("ID Medicamentos");
        modelo.addColumn("Medicamento");
        modelo.addColumn("Precio Unitario");
        modelo.addColumn("Cantidad Medicamentos");
        modelo.addColumn("Fecha de Venta");
        mBd = new BD("login", "root", "");
      
    }
    
    public void nuevaTabla(){
       // modelo = new DefaultTableModel();
        //jReportes.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jReportes = new javax.swing.JTable();
        jConsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblCarrito1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 450));

        jReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Reportes", "ID Medicamento", "Medicamento", "Total Pagado", "Cantidad Medicamentos", "Fecha de Venta"
            }
        ));
        jReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jReportesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jReportes);

        jConsultar.setText("Consultar Reportes");
        jConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reporte de Ventas");

        lblCarrito1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCarrito1.setForeground(new java.awt.Color(255, 255, 255));
        lblCarrito1.setText("Retornar al menu");
        lblCarrito1.setToolTipText("");
        lblCarrito1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarrito1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblCarrito1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(759, 759, 759)
                        .addComponent(jConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(419, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lblCarrito1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(450, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jReportesMouseClicked

    }//GEN-LAST:event_jReportesMouseClicked

    private void jConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultarActionPerformed
        try {
                if(mBd.Conectar()) {
          DefaultTableModel modelo = new DefaultTableModel();
          String titulos[]={"num_reporte","id_cliente","medicamento Unitario","total","cantidad","fecha_reporte"};
          modelo=new DefaultTableModel(null,titulos);
                PreparedStatement ps = null;
                ResultSet rs = null;
                String sql;
                sql=" SELECT num_reporte, id_medica, medicamento, total, cantidad, fecha_reporte";
                sql+=" FROM reportes";
                ps = mBd.mConection.prepareStatement(sql);
                rs = ps.executeQuery();
                ResultSetMetaData rsMd = rs.getMetaData();
                int cantidadC = rsMd.getColumnCount();

              jReportes.setModel(modelo);
                while(rs.next()) {
                    Object[] filas = new Object [cantidadC];
                    for(int i = 0; i < cantidadC; i++){
                          filas[i] = rs.getObject(i+1);
                         }
                        modelo.addRow(filas);
                       }

                     }
               else{
                    JOptionPane.showMessageDialog(null, "No Conectada");
                }
                
            } catch(SQLException ex){
            System.err.println(ex.toString());
        }

    }//GEN-LAST:event_jConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jConsultar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jReportes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCarrito1;
    // End of variables declaration//GEN-END:variables
}
