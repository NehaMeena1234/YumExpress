/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.gui;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import yumxpress.dao.CompanyDAO;
import yumxpress.dao.OrderDAO;
import yumxpress.dao.StaffDAO;
import yumxpress.pojo.OrderPojo;
import yumxpress.pojo.UserProfile;
import yumxpress.util.Mailer;
//import yumxpress.util.UserProfile;

/**
 *
 * @author Neha Meena
 */
public class CustomerCartFrame extends javax.swing.JFrame {

    /**
     * Creates new form CustomerCartFrame
     */
     private List<OrderPojo> OrderList;
    private DefaultTableModel model;
    private int index;
  //  private JFrame showFrame;
    public CustomerCartFrame() {
        initComponents();
        setLocationRelativeTo(null);
        this.lblUserProfile.setText("Hello " + UserProfile.getUserName().trim());
        model = (DefaultTableModel) jtCart.getModel();
        loadNewOrderDetails(UserProfile.getUserId().trim());
    }

//    public CustomerCartFrame() {
//        initComponents();
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        myPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        BtnMyAccount = new javax.swing.JButton();
        BtnOrderFood = new javax.swing.JButton();
        BtnCanceledOrder = new javax.swing.JButton();
        BtnOrderHistory = new javax.swing.JButton();
        lblUserProfile = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCart = new javax.swing.JTable();
        btnOrderCart = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        myPanel1.setBackground(new java.awt.Color(102, 153, 255));

        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N

        BtnMyAccount.setBackground(new java.awt.Color(255, 204, 51));
        BtnMyAccount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnMyAccount.setText("My Account");
        BtnMyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMyAccountActionPerformed(evt);
            }
        });

        BtnOrderFood.setBackground(new java.awt.Color(255, 204, 51));
        BtnOrderFood.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnOrderFood.setText("Order Food");
        BtnOrderFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrderFoodActionPerformed(evt);
            }
        });

        BtnCanceledOrder.setBackground(new java.awt.Color(255, 204, 51));
        BtnCanceledOrder.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnCanceledOrder.setText("Canceled order");
        BtnCanceledOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCanceledOrderActionPerformed(evt);
            }
        });

        BtnOrderHistory.setBackground(new java.awt.Color(255, 204, 51));
        BtnOrderHistory.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnOrderHistory.setText("Order History");
        BtnOrderHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrderHistoryActionPerformed(evt);
            }
        });

        lblUserProfile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout myPanel1Layout = new javax.swing.GroupLayout(myPanel1);
        myPanel1.setLayout(myPanel1Layout);
        myPanel1Layout.setHorizontalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(lblUserProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnMyAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnOrderFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCanceledOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(BtnOrderHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        myPanel1Layout.setVerticalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnMyAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(BtnOrderFood, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnCanceledOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(BtnOrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(myPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("        My Cart");

        jtCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product Price "
            }
        ));
        jtCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCartMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCart);

        btnOrderCart.setBackground(new java.awt.Color(0, 102, 255));
        btnOrderCart.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnOrderCart.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderCart.setText("Order(0)");
        btnOrderCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderCartActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 102, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOrderCart, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(414, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOrderCart, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(449, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(75, 75, 75)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMyAccountActionPerformed
         new CustomerAccountFrame().setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_BtnMyAccountActionPerformed

    private void btnOrderCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderCartActionPerformed
      new OrderProductFrame().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnOrderCartActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       new CustomerOptionFrame().setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void BtnOrderFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrderFoodActionPerformed
       new OrderFoodFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BtnOrderFoodActionPerformed

    private void BtnCanceledOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCanceledOrderActionPerformed
          new CancelOrderFrame().setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_BtnCanceledOrderActionPerformed

    private void BtnOrderHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrderHistoryActionPerformed
          new OrderHistoryFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BtnOrderHistoryActionPerformed

    private void jtCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCartMouseClicked
        // TODO add your handling code here:
         index = jtCart.getSelectedRow();
        OrderPojo order = OrderList.get(index); 
        Random rand = new Random();
        int otp = rand.nextInt(1000);
        String[] str = {"Place Order", "Remove order"};
        int choice = JOptionPane.showOptionDialog(null, "What do you want to do ?", "Select", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, str, str[1]);
        if(choice==0){
            try{
                String orderId= order.getOrderId();
                String staffId= StaffDAO.getRandomStaffIdFromCompany(order.getCompanyId());
                String ordId=OrderDAO.placeOrderByCart(orderId, staffId, otp);
                OrderPojo orderDetails=OrderDAO.getOrderDetailsByOrderId(ordId);
                System.out.println(orderDetails);
                Map<String,String>emailCredentials=CompanyDAO.getEmailCredentailsByCompanyId(order.getCompanyId());
                Mailer.sendMail(emailCredentials, orderDetails);
                JOptionPane.showMessageDialog(null,"Order placed and Email Sent Successfully to:"+UserProfile.getEmailId());
                model.removeRow(index);
                if (OrderList.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No orders left in CART");
                    jtCart.setEnabled(false);
                    this.dispose();
                    new CustomerOptionFrame().setVisible(true);
                    return;
                }
                return;
            }
            catch(SQLException sq){
                JOptionPane.showMessageDialog(null,"DB ERROR IN CustomerCartFrame  Some error occured..! cannot place order..!");
                sq.printStackTrace();
            }
            catch(MessagingException sq){
                JOptionPane.showMessageDialog(null,"MAIL ERROR IN CustomerCartFrame");
                sq.printStackTrace();
            }   
        }
        
        if(choice==1){
            index = jtCart.getSelectedRow();
            order = OrderList.get(index);
            try{
               String orderId= order.getOrderId();
               boolean done=OrderDAO.removeOrderFromCart(orderId);
               if(done){
                    JOptionPane.showMessageDialog(null,"Order removed...!");
                    model.removeRow(index);
                    return;
               }
            }
            catch(SQLException sq){
                JOptionPane.showMessageDialog(null,"DB ERROR IN CustomerCartFrame  Some error occured..! cannot remove order..!");
                sq.printStackTrace();
            }
        
        }
    }//GEN-LAST:event_jtCartMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerCartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCartFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCanceledOrder;
    private javax.swing.JButton BtnMyAccount;
    private javax.swing.JButton BtnOrderFood;
    private javax.swing.JButton BtnOrderHistory;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOrderCart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCart;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblUserProfile;
    private javax.swing.JPanel myPanel1;
    // End of variables declaration//GEN-END:variables

    private void loadNewOrderDetails(String customerId) {
        try {
            OrderList = OrderDAO.getCartOrders(customerId);
            if (OrderList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No orders added to CART");
                jtCart.setEnabled(false);
                return;
            }
            int i = 0;
            Object[] rows = new Object[2];
            while (i < OrderList.size()) {
                OrderPojo ord = OrderList.get(i);
                rows[0] = ord.getProductName();
                rows[1] = ord.getProductPrice();
                model.addRow(rows);
                i++;

            }
        } catch(SQLException sq) {
            JOptionPane.showMessageDialog(null, "DB ERROR IN ViewOrderFrame");
            sq.printStackTrace();
        }
    }
}

