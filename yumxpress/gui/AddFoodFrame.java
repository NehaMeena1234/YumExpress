/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.gui;

import java.awt.Image;
//import java.awt.List;
import java.util.List;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import yumxpress.dao.ProductDAO;
import yumxpress.pojo.ProductPojo;
import yumxpress.util.OwnerProfile;
import yumxpress.util.SpoonacularAPI;

/**
 *
 * @author Neha Meena
 */
public class AddFoodFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddFoodFrame
     */
   private List<ProductPojo> foodList;
    private int foodIndex=0;
    private ProductPojo product;
    private int FoodIndex=0;
    public AddFoodFrame() {
        initComponents();
        setLocationRelativeTo(null);
        
        this.lblOwnerProfile.setText("Hello "+OwnerProfile.getOwnerName());
        clearAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        myPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        BtnAddStaff = new javax.swing.JButton();
        BtnViewFood = new javax.swing.JButton();
        BtnViewStaff = new javax.swing.JButton();
        BtnOrderList = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        lblOwnerProfile = new javax.swing.JLabel();
        myPanel2 = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        txtSearchFood = new javax.swing.JTextField();
        txtfoodname = new javax.swing.JTextField();
        BtnSearchFood = new javax.swing.JButton();
        lblBack = new javax.swing.JLabel();
        lblNext = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        txtFoodPrice = new javax.swing.JTextField();
        BtnAddItem = new javax.swing.JButton();
        lblFoodImage = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        BtnViewFood.setText("View Food");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnViewStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnViewFood, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1)
                    .addComponent(BtnAddStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblOwnerProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        myPanel1Layout.setVerticalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOwnerProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnAddStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnViewFood, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnViewStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BtnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        myPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbl2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lbl2.setForeground(new java.awt.Color(129, 120, 177));
        lbl2.setText("       Add Food Item");

        lbl3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl3.setForeground(new java.awt.Color(129, 120, 177));
        lbl3.setText("Search Food");

        lbl4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl4.setForeground(new java.awt.Color(129, 120, 177));
        lbl4.setText("Food Name");

        lbl5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl5.setForeground(new java.awt.Color(129, 120, 177));
        lbl5.setText("Food Image");

        txtSearchFood.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtSearchFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchFoodActionPerformed(evt);
            }
        });

        txtfoodname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtfoodname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfoodnameActionPerformed(evt);
            }
        });

        BtnSearchFood.setBackground(new java.awt.Color(204, 255, 51));
        BtnSearchFood.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnSearchFood.setText("Search");
        BtnSearchFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchFoodActionPerformed(evt);
            }
        });

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-left-arrow-64 (1).png"))); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-right-arrow-64.png"))); // NOI18N
        lblNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextMouseClicked(evt);
            }
        });

        lbl6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl6.setForeground(new java.awt.Color(129, 120, 177));
        lbl6.setText("Enter Price");

        txtFoodPrice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        BtnAddItem.setBackground(new java.awt.Color(204, 255, 153));
        BtnAddItem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnAddItem.setText("Add Item");
        BtnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout myPanel2Layout = new javax.swing.GroupLayout(myPanel2);
        myPanel2.setLayout(myPanel2Layout);
        myPanel2Layout.setHorizontalGroup(
            myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel2Layout.createSequentialGroup()
                .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(myPanel2Layout.createSequentialGroup()
                                .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanel2Layout.createSequentialGroup()
                                        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41))
                                    .addGroup(myPanel2Layout.createSequentialGroup()
                                        .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl5))
                                            .addComponent(lbl4)
                                            .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtSearchFood)
                                        .addComponent(txtfoodname)
                                        .addComponent(txtFoodPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                                    .addComponent(lblFoodImage, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnSearchFood, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanel2Layout.createSequentialGroup()
                                        .addComponent(lblNext, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))))))
                    .addGroup(myPanel2Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(BtnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        myPanel2Layout.setVerticalGroup(
            myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel2Layout.createSequentialGroup()
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BtnSearchFood))
                    .addGroup(myPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(lblNext, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl4)
                            .addComponent(txtfoodname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl5)
                        .addGap(52, 52, 52)
                        .addComponent(lblBack))
                    .addGroup(myPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblFoodImage, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(myPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(myPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSearchFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchFoodActionPerformed
String searchFood=txtSearchFood.getText().trim();
if (searchFood.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please type a food name");
            return;
        }
try{
       searchFood = searchFood.replaceAll(" ", "-");
       foodList=SpoonacularAPI.getAllItemDetailsByName(searchFood);
        if (foodList.isEmpty()) {
           JOptionPane.showMessageDialog(null, "No food details for" +searchFood+" found ");
            return;
        }
         lblNext.setEnabled(true);
         lblBack.setEnabled(true);
        showFoodDetailsByIndex(foodIndex);
}
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Exception while using API");
            ex.printStackTrace();
            return;
        }
        
        
        //showFoodDetailsOfIndex(viewImageIndex);
    



        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSearchFoodActionPerformed

    private void txtSearchFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchFoodActionPerformed

    private void BtnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddItemActionPerformed
        if(!validateInputs()){
            JOptionPane.showMessageDialog(null,"Please fill all the data");
            return ;
        }try{
            double price=Double.parseDouble(txtFoodPrice.getText().trim());
            product.setCompanyId(OwnerProfile.getCompanyId());
            product.setProductName(txtfoodname.getText().trim());
            product.setProductPrice(price);
            boolean result=ProductDAO.addProduct(product);
            if(result==false){
                JOptionPane.showMessageDialog(null,"Cannot add the product");
                return ;
            }
            JOptionPane.showMessageDialog(null,"Productr successfully added");
            foodList.remove(foodIndex);
            if(foodList.isEmpty()){
                JOptionPane.showMessageDialog(null,"All varities of "+txtSearchFood.getText().trim()+" added");
                        clearAll();
                        return;
            }
            foodIndex=0;
            showFoodDetailsByIndex(FoodIndex);
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Exception in DB in AddFoodFrame");
            ex.printStackTrace();
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Please input numeric value for price");
       
         ex.printStackTrace();
        }
        catch(IOException ex){
             JOptionPane.showMessageDialog(null,"Exception in DAO Image processing in AddFoodFrame");
        
         ex.printStackTrace();}
        
    
    



            
    
    }//GEN-LAST:event_BtnAddItemActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        foodIndex--;
       if(foodIndex<0){
           foodIndex=foodList.size()-1;
       }
         showFoodDetailsByIndex(foodIndex);
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
        foodIndex++;
       if(foodIndex>=foodList.size()){
           foodIndex=0;
       }
       showFoodDetailsByIndex(foodIndex);
        



// TODO add your handling code here:
    }//GEN-LAST:event_lblNextMouseClicked

    private void txtfoodnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfoodnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfoodnameActionPerformed

    private void BtnAddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddStaffActionPerformed
        // TODO add your handling code here:
         AddDeliveryStaffFrame optionsFrame=new  AddDeliveryStaffFrame();  
         optionsFrame.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_BtnAddStaffActionPerformed

    private void BtnViewFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewFoodActionPerformed
        // TODO add your handling code here:
          ViewFoodFrame optionsFrame=new   ViewFoodFrame();  
         optionsFrame.setVisible(true);
         this.dispose();
        
    }//GEN-LAST:event_BtnViewFoodActionPerformed

    private void BtnViewStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewStaffActionPerformed
        // TODO add your handling code here:
        ViewDeliveryStaffFrame optionsFrame=new  ViewDeliveryStaffFrame ();  
         optionsFrame.setVisible(true);
         this.dispose();
        
    }//GEN-LAST:event_BtnViewStaffActionPerformed

    private void BtnOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrderListActionPerformed
        // TODO add your handling code here:
         OrderListFrame optionsFrame=new  OrderListFrame ();  
         optionsFrame.setVisible(true);
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
            java.util.logging.Logger.getLogger(AddFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFoodFrame().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddItem;
    private javax.swing.JButton BtnAddStaff;
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnOrderList;
    private javax.swing.JButton BtnSearchFood;
    private javax.swing.JButton BtnViewFood;
    private javax.swing.JButton BtnViewStaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblFoodImage;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblOwnerProfile;
    private javax.swing.JPanel myPanel1;
    private javax.swing.JPanel myPanel2;
    private javax.swing.JTextField txtFoodPrice;
    private javax.swing.JTextField txtSearchFood;
    private javax.swing.JTextField txtfoodname;
    // End of variables declaration//GEN-END:variables

private void showFoodDetailsByIndex(int foodIndex){
 product =foodList.get(foodIndex);
String foodName=product.getProductName();
if(foodName.length()>=50){
    foodName=foodName.substring(0,45)+"...";
}
txtfoodname.setText(product.getProductName());
Image img=product.getProductImage();
img=img.getScaledInstance(lblFoodImage.getWidth(),lblFoodImage.getHeight(),Image.SCALE_SMOOTH);
ImageIcon icon=new ImageIcon(img);
lblFoodImage.setIcon(icon);
}
private boolean validateInputs(){
    if(txtfoodname.getText().trim().isEmpty()||txtFoodPrice.getText().trim().isEmpty()||lblFoodImage.getIcon()==null){
    return false;
}
    return true;
}
private void clearAll(){
    txtfoodname.setText("");
    txtFoodPrice.setText("");
    txtSearchFood.setText("");
    lblFoodImage.setIcon(null);
    lblNext.setEnabled(false);
    lblBack.setEnabled(false);
    txtSearchFood.requestFocus();
    
}
}
