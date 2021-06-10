/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutriologa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Camila Mora
 */
public class PlanAlimenticio extends javax.swing.JFrame {

    /**
     * Creates new form PlanAlimenticio
     */
    public PlanAlimenticio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtProteinas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtCalorias = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCarbohidratos = new javax.swing.JTextField();
        txtGrasas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbPlan = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 255));
        jLabel4.setText("PLAN ALIMENTICIO");

        jLabel1.setText("Id ");

        jLabel2.setText("Calorías");

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Proteínas");

        btnRegistrar.setText("Registrar Plan");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel5.setText("Carbohidratos");

        jLabel6.setText("Grasas");

        TbPlan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Calorías", "Proteinas", "Carbohidratos", "Grasas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TbPlan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbPlanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbPlan);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProteinas, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(txtCalorias)
                            .addComponent(txtId)
                            .addComponent(txtCarbohidratos)
                            .addComponent(txtGrasas))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(25, 25, 25))))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProteinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCarbohidratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtGrasas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnRegistrar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MenuPrincipal MP = new MenuPrincipal() ;
        MP.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        int id_plan =Integer.parseInt(txtId.getText());
        int  calorias_plan =Integer.parseInt(txtCalorias.getText());
        int proteinas_plan =Integer.parseInt(txtProteinas.getText());
        int  carbohidratos_plan =Integer.parseInt(txtCarbohidratos.getText());
        int  grasas_plan =Integer.parseInt(txtGrasas.getText());
        
        try{
              Connection con = Conexion.getConexion();
              PreparedStatement ps = con.prepareStatement("INSERT INTO Plan_alimenticio (id_plan, calorias_plan, proteinas_plan, carbohidratos_plan, grasas_plan) VALUES(?,?,?,?,?)");
              ps.setInt(1, id_plan);
              ps.setInt(2, calorias_plan);
              ps.setInt(3, proteinas_plan);
              ps.setInt(4, carbohidratos_plan);
              ps.setInt(5, grasas_plan);
              ps.executeUpdate();
              JOptionPane.showMessageDialog(null, "Consulta Agendada");
              Limpiar();
              cargarTabla();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }                                          

    private void Limpiar(){
        txtId.setText("");
        txtCalorias.setText("");
        txtProteinas.setText("");
        txtCarbohidratos.setText("");
        txtGrasas.setText("");
    }
     
     private void cargarTabla(){
        DefaultTableModel modeloTabla = (DefaultTableModel) TbPlan.getModel();
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        try{
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT id_plan, calorias_plan, proteinas_plan, carbohidratos_plan, grasas_plan FROM Plan_alimenticio");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            
            while (rs.next()){
                Object[] fila =  new Object[columnas];
                for(int indice=0; indice<columnas; indice ++){
                    fila[indice] = rs.getObject(indice + 1);
                    
                }
                modeloTabla.addRow(fila);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
       
    }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
                String id_plan =txtId.getText();
        try{
              Connection con = Conexion.getConexion();
              PreparedStatement ps = con.prepareStatement("DELETE FROM Plan_alimenticio WHERE id_plan=?");
              ps.setString(1, id_plan);
              ps.executeUpdate();
              JOptionPane.showMessageDialog(null, "Registro Eliminado");
              Limpiar();
              cargarTabla();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
                int id_plan =Integer.parseInt(txtId.getText());
        int  calorias_plan =Integer.parseInt(txtCalorias.getText());
        int proteinas_plan =Integer.parseInt(txtProteinas.getText());
        int  carbohidratos_plan =Integer.parseInt(txtCarbohidratos.getText());
        int  grasas_plan =Integer.parseInt(txtGrasas.getText());
        
        try{
              Connection con = Conexion.getConexion();
              PreparedStatement ps = con.prepareStatement("UPDATE Plan_alimenticio SET calorias_plan=?, proteinas_plan=?, carbohidratos_plan=?, grasas_plan=? WHERE id_plan=?");
              ps.setInt(1, id_plan);
              ps.setInt(2, calorias_plan);
              ps.setInt(3, proteinas_plan);
              ps.setInt(4, carbohidratos_plan);
              ps.setInt(5, grasas_plan);
              ps.executeUpdate();
              JOptionPane.showMessageDialog(null, "Consulta Modificada");
              Limpiar();
              cargarTabla();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void TbPlanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbPlanMouseClicked
        // TODO add your handling code here:
          try{
            int fila = TbPlan.getSelectedRow();
            String id = TbPlan.getValueAt(fila, 0).toString();
            String id_plan = txtId.getText();
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT id_plan=?, calorias_plan , proteinas_plan, carbohidratos_plan, grasas_plan FROM Plan_alimenticio");
            ps.setString(1,id_plan);
            rs = ps.executeQuery();
            
            
            while(rs.next()){
                txtId.setText(String.valueOf(id));
                txtCalorias.setText(rs.getString("calorias_plan"));
                txtProteinas.setText(rs.getString("proteinas_plan"));
                txtCarbohidratos.setText(rs.getString("carbohidratos_plan"));
                txtGrasas.setText(rs.getString("grasas_plan"));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString());
    } 

     
    }//GEN-LAST:event_TbPlanMouseClicked

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
            java.util.logging.Logger.getLogger(PlanAlimenticio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanAlimenticio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanAlimenticio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanAlimenticio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlanAlimenticio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbPlan;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCalorias;
    private javax.swing.JTextField txtCarbohidratos;
    private javax.swing.JTextField txtGrasas;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtProteinas;
    // End of variables declaration//GEN-END:variables
}
