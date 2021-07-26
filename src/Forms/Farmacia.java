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
import javax.swing.JTable;
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
public class Farmacia extends javax.swing.JFrame {
    public BD mBd;
    private String imgPathLogo = "/icons/Logo1.png";
   
    Factura fac = new Factura(); 
    
    public Farmacia()    
    {  initComponents();
     DefaultTableModel modelo = new DefaultTableModel();
     
       //this.setLocationRelativeTo(null); 
       setLocation(860,0 );
    
       setIconImage(new ImageIcon(getClass().getResource(imgPathLogo)).getImage());
        modelo.removeTableModelListener(jTResultado);
        modelo.addColumn("ID Medicamentos");
        modelo.addColumn("Medicamento");
        modelo.addColumn("Precio Unitario");
        modelo.addColumn("Cantidad");
        mBd = new BD("login", "root", "");
        fac.setVisible(true);       
    }

    public void nuevaTabla(){
        //modelo = new DefaultTableModel();
        //jTResultado.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultado = new javax.swing.JTable();
        jConsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblCarrito1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 450));
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jTResultado =new JTable(){
            public boolean isCellEditable(int row ,int column){

                for(int i=0;i< jTResultado.getRowCount();i++){

                    try{
                        if ((row==i)){
                            if (jTResultado.getValueAt(jTResultado.getSelectedRow(), 1) != null)
                            {
                                return false;
                            }

                        }
                    }
                    catch(java.lang.ArrayIndexOutOfBoundsException ex )
                    {}

                }

                return true;

            }

        };
        jTResultado.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "ID Medicamentos", "Medicamento", "Precio Unitario", "Cantidad"
            }
        ));
        jTResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTResultadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTResultado);

        jConsultar.setText("Consultar Inventario");
        jConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inventario - Medicamentos");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblCarrito1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222)))
                .addComponent(lblCarrito1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultarActionPerformed
        try {
            if(mBd.Conectar()) {
          DefaultTableModel modelo = new DefaultTableModel();
          String titulos[]={"ID Medicamentos","Medicamento","Precio Unitario","Cantidad"};
          modelo=new DefaultTableModel(null,titulos);
          
                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    String sql;
                    sql=" SELECT id_medica, descripcion, precio_unitario,cantidad";
                    sql+=" FROM inventario";

                    ps = mBd.mConection.prepareStatement(sql); 
                    rs = ps.executeQuery();
                
                    ResultSetMetaData rsMd = rs.getMetaData();
               int cantidadC = rsMd.getColumnCount();
                
                jTResultado.setModel(modelo);
               while(rs.next()) {
                    Object[] filas = new Object [cantidadC];
               for(int i = 0; i < cantidadC; i++){
                    filas[i] = rs.getObject(i+1);
                                 }
                  modelo.addRow(filas);
                 }
            
               }else{
                    JOptionPane.showMessageDialog(null, "No Conectada");
             }
            
           } catch(SQLException ex){
                   System.err.println(ex.toString());
        }
        
       
    }//GEN-LAST:event_jConsultarActionPerformed

    private void jTResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResultadoMouseClicked
        int fila = jTResultado.getSelectedRow();
        if(evt.getClickCount()==2)
        {
        // JOptionPane.showMessageDialog(null, "  ");
         try {
        if(fila >= 0){
            if(mBd.Conectar()) {
                
                String sql,sql2, cantidad, id,dato,total_cant="";
                String datos1 [] = new String [4];
                int canti,ide,cantidad_med;
                
                cantidad = JOptionPane.showInputDialog(this,""
                        + "PRODUCTO SELECCIONADO \n"
                        + "\n"
                        + ""+jTResultado.getValueAt(jTResultado.getSelectedRow(), 1)+" "
                        + "\n"
                        + "\n"
                        + "Introduzca la cantidad:","");
                
                
               
                  
                
                
                canti=Integer.parseInt(cantidad);
                ide = Integer.parseInt( jTResultado.getValueAt(jTResultado.getSelectedRow(), 0).toString() );
                id=Integer.toString(ide);
               // ide=Integer.parseInt(id);
                
                       sql=" SELECT cantidad FROM inventario WHERE id_medica=? ";
                       PreparedStatement ps=mBd.mConection.prepareStatement(sql);   ;
                       ps.setString(1, id);
                       ResultSet resultado=ps.executeQuery();
                       resultado.last();
                       dato=resultado.getString("cantidad");
                       cantidad_med =Integer.parseInt(dato);
                
               
                  if (cantidad_med!=0&&cantidad_med>=canti) {
                            cantidad_med=cantidad_med-canti;
                            total_cant=String.valueOf(cantidad_med);
                             sql2 =" UPDATE inventario SET cantidad= ? WHERE id_medica= ?"; 
                             PreparedStatement ps1;
                             ps1=mBd.mConection.prepareStatement(sql2);
                             ps1.setString(1, total_cant);
                             ps1.setString(2, id);
                             ps1.executeQuery(); 
                             String datos[] = new String[4];
                              datos[0] = jTResultado.getValueAt(fila, 0).toString();
                              datos[1] = jTResultado.getValueAt(fila, 1).toString();
                              datos[2] = jTResultado.getValueAt(fila, 2).toString();
                              datos[3] = cantidad;
                              fac.modelo2.addRow(datos);
                           
                            }else
                            {
                                JOptionPane.showMessageDialog(null,"La cantidad a pedir no puede ser mayor a "+dato,"  ERROR  ",JOptionPane.ERROR_MESSAGE);
                               
                         }

                      }else{
                     JOptionPane.showMessageDialog(null, "No Conectada");
                   }
              
               }
             
            } catch (SQLException ex) {
                    Logger.getLogger(Farmacia.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
         
        }
        
        
        
    }//GEN-LAST:event_jTResultadoMouseClicked

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
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Farmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Farmacia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jConsultar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTResultado;
    private javax.swing.JLabel lblCarrito1;
    // End of variables declaration//GEN-END:variables
}
