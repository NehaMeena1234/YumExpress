/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.gui;

import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import yumxpress.dao.ProductDAO;
import yumxpress.pojo.ProductPojo;
import yumxpress.util.OwnerProfile;

/**
 *
 * @author Neha Meena
 */
public class ViewFoodFrame extends javax.swing.JFrame {

    /**
     * Creates new form ViewFoodFrame
     */
    private Map<String,ProductPojo>productDetails;
    public ViewFoodFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lblOwnerProfile.setText("Hello "+OwnerProfile.getOwnerName());
        loadProductDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblOwnerProfile = new javax.swing.JLabel();
        myPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        BtnAddStaff = new javax.swing.JButton();
        BtnViewFood = new javax.swing.JButton();
        BtnViewStaff = new javax.swing.JButton();
        BtnOrderList = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        jcProductNames = new javax.swing.JComboBox<>();
        lbl4 = new javax.swing.JLabel();
        txtProductPrice = new javax.swing.JTextField();
        lblFoodImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblOwnerProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(lblOwnerProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(348, Short.MAX_VALUE))
        );

        myPanel1.setBackground(new java.awt.Color(129, 120, 177));

        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N

        BtnAddStaff.setBackground(new java.awt.Color(204, 255, 51));
        BtnAddStaff.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnAddStaff.setText("Add Staff");
        BtnAddStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddStaffActionPerformed(evt);
            }
        });

        BtnViewFood.setBackground(new java.awt.Color(204, 255, 51));
        BtnViewFood.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnViewFood.setText("Add Food");
        BtnViewFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewFoodActionPerformed(evt);
            }
        });

        BtnViewStaff.setBackground(new java.awt.Color(204, 255, 51));
        BtnViewStaff.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnViewStaff.setText("View Staff");
        BtnViewStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewStaffActionPerformed(evt);
            }
        });

        BtnOrderList.setBackground(new java.awt.Color(204, 255, 0));
        BtnOrderList.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnOrderList.setText("Order List");
        BtnOrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrderListActionPerformed(evt);
            }
        });

        BtnBack.setBackground(new java.awt.Color(255, 255, 255));
        BtnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout myPanel1Layout = new javax.swing.GroupLayout(myPanel1);
        myPanel1.setLayout(myPanel1Layout);
        myPanel1Layout.setHorizontalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(621, 621, 621))
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnOrderList, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(BtnViewStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnAddStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnViewFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(myPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        myPanel1Layout.setVerticalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BtnAddStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnViewFood, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnViewStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbl2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lbl2.setForeground(new java.awt.Color(129, 120, 177));
        lbl2.setText("       View Food");

        lbl3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl3.setForeground(new java.awt.Color(129, 120, 177));
        lbl3.setText("Select Food Name");

        jcProductNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcProductNamesActionPerformed(evt);
            }
        });

        lbl4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl4.setForeground(new java.awt.Color(129, 120, 177));
        lbl4.setText("Price");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jcProductNames, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblFoodImage, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcProductNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFoodImage, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(myPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(myPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcProductNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcProductNamesActionPerformed
        // TODO add your handling code here:
        String foodName=jcProductNames.getSelectedItem().toString();
        ProductPojo product=productDetails.get(foodName);
        Image img=product.getProductImage();
img=img.getScaledInstance(lblFoodImage.getWidth(),lblFoodImage.getHeight(),Image.SCALE_SMOOTH);
ImageIcon icon=new ImageIcon(img);
lblFoodImage.setIcon(icon);
txtProductPrice.setText(product.getProductPrice()+"");
    }//GEN-LAST:event_jcProductNamesActionPerformed

    private void BtnAddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddStaffActionPerformed
         AddDeliveryStaffFrame optionsFrame=new AddDeliveryStaffFrame();  
         optionsFrame.setVisible(true);
         this.dispose();     
    }//GEN-LAST:event_BtnAddStaffActionPerformed

    private void BtnViewStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewStaffActionPerformed
        // TODO add your handling code here:
       ViewDeliveryStaffFrame optionsFrame=new ViewDeliveryStaffFrame();  
         optionsFrame.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_BtnViewStaffActionPerformed

    private void BtnViewFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewFoodActionPerformed
        // TODO add your handling code here:
        new ViewDeliveryStaffFrame().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BtnViewFoodActionPerformed

    private void BtnOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrderListActionPerformed
        // TODO add your handling code here:
        new OrderListFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnOrderListActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        new SellerOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnBackActionPerformed

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
            java.util.logging.Logger.getLogger(ViewFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFoodFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddStaff;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnOrderList;
    private javax.swing.JButton BtnViewFood;
    private javax.swing.JButton BtnViewStaff;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcProductNames;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lblFoodImage;
    private javax.swing.JLabel lblOwnerProfile;
    private javax.swing.JPanel myPanel1;
    private javax.swing.JTextField txtProductPrice;
    // End of variables declaration//GEN-END:variables
  private void loadProductDetails(){
      try{
          productDetails=ProductDAO.getProductDetailsByCompanyId(OwnerProfile.getCompanyId());
          if(productDetails.isEmpty()){
              JOptionPane.showMessageDialog(null,"No food found for"+OwnerProfile.getCompanyId());
          return;
          
          }
          showProductNames();
      }
      catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Exception in DB in VeiwFoodFrame");
            ex.printStackTrace();
      }
        catch(IOException ex){
             JOptionPane.showMessageDialog(null,"Exception in DAO Image processing in ViewFoodFrame");
        }
  }
  private void showProductNames(){
      Set<String>foodNames=productDetails.keySet();
      for(String foodName:foodNames){
          jcProductNames.addItem(foodName);
      }
          
      
      }
  




}
