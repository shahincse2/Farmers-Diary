/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package diary;
import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.sql.*;  
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shahi
 */
public class FB_DashboardFarmers extends javax.swing.JFrame {

    /**
     * Creates new form FB_Dashboard
     */
    String phone;
    String userName, userName2;
   // private Connection conn;
    java.sql.Connection conn;
    //DefaultTableModel defaultTableModel;//creating object of DefaultTableModel
    public FB_DashboardFarmers() {
        initComponents();
        
        
    }
    public FB_DashboardFarmers(String phone) {
        initComponents();
        this.phone = phone;
        
        
    try {
    
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmersdiary", "root", "");
            java.sql.Statement statement = conn.createStatement();
            String sql = "select * from farmers where phone="+phone;
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i =0;
            if(rs.next()){
            userName = rs.getString("lname");
            userName2 = rs.getString("fname");
           // model.addRow(new Object[]{roll, name, cl, sec});
            //System.out.println(userName);
            String customerName = userName2+" "+userName;
            jLabel4.setText(customerName.toUpperCase());
            i++; 
            }
            
            
            
            
            
            
            statement = conn.createStatement();//crating statement object
            String tableItem = "select * from productgroup where SellerPhone="+phone;
            String count = "SELECT COUNT(*) FROM productgroup";
            ResultSet rCount = statement.executeQuery(count);
            rCount.next();
            int counts = rCount.getInt(1);
           // PreparedStatement items = conn.prepareStatement(tableItem);
           // ResultSet itemsResults = items.executeQuery();
            ResultSet itemsResults = statement.executeQuery(tableItem);
            
     
   
            
            
            // 01938073856            
        int x = 0;
        int j = 0;
        //
        while(itemsResults.next()){
            //itemsResults.next();
            String Sname = itemsResults.getString("name");
            String price =  String.valueOf(itemsResults.getFloat("price"));
      //      String price = itemsResults.getString("price");
            String amount = String.valueOf(itemsResults.getFloat("amount"));
            String totalPrice = String.valueOf(itemsResults.getFloat("totalPrice")); 
            String date = itemsResults.getString("dates"); 
            String tableData[] = {Sname, price, amount, totalPrice, date}; 
            DefaultTableModel tblModel =  (DefaultTableModel)jTable2.getModel();
            tblModel.addRow(tableData);
          //  jTable2.addRow(new Object[]{Sname, price, amount, date});
            System.out.println(j);
            j++; 
            //x++;
        }
            
            conn.close();
            
    } catch (SQLException ex) {
        //Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("Exeption found"+ex);
    }
        
        
        
        
         
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(282, 100, 282, 100));

        jPanel1.setBackground(new java.awt.Color(6, 21, 64));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Farmer's Dairy");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Name");

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton4.setText("History");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton5.setText("Accounts");

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton6.setText("Settings");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton4)
                            .addComponent(jButton6))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Product", "1. Potato", "2. Tomato", "3. Brinjal", "4. Cabbage", "5. Radish", "6. Onion", "7. Bitter Gourd", "8. Lady’s finger", "9. Cauliflower", "10. Pumpkin", "11. Carrot", "12. Ginger", "13. Chilli", "14. Capsicum", "15. Spinach", "16. Jackfruit", "17. Mushroom", "18. Sweet Potato", "19. Beetroot", "20. Cucumber", "21. Broccoli", "22. Asparagus", "23. Corn", "24. Celery", "25. Green bean", "26. Chickpea", "27. Lentil", "28. Peas", "29. Garlic", "30. Coriander", "31. Apple Gourd", "32. Drumstick", "33. Bottle Gourd", "34. Leek", "35. Cluster Beans", "36. Pointed Gourd", "37. Yam", "38. Artichoke", "39. Ash Gourd", "40. Bok Choy", "41. Brussels Sprout", "42. Chayote", "43. Endive", "44. Kohlrabi", "45. Luffa", "46. Parsnip", "47. Ridged Gourd", "48. Swiss Chard", "49. Turnip", "50. Zucchini" }));

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Weight", "Amount", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        jButton3.setText("Filter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
  
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       new Frontpage().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:
    
    
    
     
        
        /**
        * Removes all the rows in the table
        */

           DefaultTableModel dm = (DefaultTableModel)jTable2.getModel();
           dm.getDataVector().removeAllElements();
           revalidate();
       
    
    
    
    
    
    
    
    
    
    
    String itemName = jComboBox1.getSelectedItem().toString();
      try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmersdiary", "root", "");
            java.sql.Statement statement = conn.createStatement();
            //String sql = "select * from farmers where phone="+phone+"productType="+itemName;
            statement = conn.createStatement();//crating statement object
            //String tableItem = "select * from product where sellerPhone="+phone+"and productType="+itemName;
            PreparedStatement tableItem = (PreparedStatement) conn.prepareStatement("select * from product where sellerPhone= ? and productType=?");
            
              tableItem.setString(1, phone);
              tableItem.setString(2, itemName);
              ResultSet itemsResults = tableItem.executeQuery();
            
            
            //ResultSet itemsResults = statement.executeQuery(tableItem);
            // 01938073856            
            int x = 0;
            int j = 0;
            // 01751611979
            String Sname;
            String price;
            String amount;
            String totalPrice;
        
        while(itemsResults.next()){
            //itemsResults.next();

            Sname = itemName;
            price =  itemsResults.getString("totalAmount");
            amount = itemsResults.getString("weight");
            Double a = Double.parseDouble(amount);
            Double b = Double.parseDouble(price);
            Double axb = a*b;

            totalPrice =axb.toString();
            
            //01751611979 
      //      String price = itemsResults.getString("price");
            //String totalPrice = String.valueOf(itemsResults.getFloat("totalPrice")); 
            String date = itemsResults.getString("dates"); 
            String tableData[] = {Sname, price, amount, totalPrice, date}; 
            DefaultTableModel tblModel =  (DefaultTableModel)jTable2.getModel();
            tblModel.addRow(tableData);
          //  jTable2.addRow(new Object[]{Sname, price, amount, date});
            //System.out.println(j);
            j++; 
            //x++;
        }
        
        if(itemName.equals("Select Product")){
        
        
        
        
        
         
        
    try {
    
        
            String sql = "select * from farmers where phone="+phone;
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i =0;
            if(rs.next()){
            userName = rs.getString("lname");
            userName2 = rs.getString("fname");
           // model.addRow(new Object[]{roll, name, cl, sec});
            //System.out.println(userName);
            String customerName = userName2+" "+userName;
            jLabel4.setText(customerName.toUpperCase());
            i++; 
            }
            
            
            
            
            
            
            statement = conn.createStatement();//crating statement object
            String tableItems = "select * from productgroup where SellerPhone="+phone;
            String count = "SELECT COUNT(*) FROM productgroup";
            ResultSet rCount = statement.executeQuery(count);
            rCount.next();
            int counts = rCount.getInt(1);
           // PreparedStatement items = conn.prepareStatement(tableItem);
           // ResultSet itemsResults = items.executeQuery();
            ResultSet itemsResult = statement.executeQuery(tableItems);
            // 01938073856            
            x = 0;
            j = 0;
            //
            while(itemsResult.next()){
            //itemsResults.next();
            Sname = itemsResult.getString("name");
            price =  String.valueOf(itemsResult.getFloat("price"));
      //      String price = itemsResults.getString("price");
            amount = String.valueOf(itemsResult.getFloat("amount"));
            totalPrice = String.valueOf(itemsResult.getFloat("totalPrice")); 
            String date = itemsResult.getString("dates"); 
            String tableData[] = {Sname, price, amount, totalPrice, date}; 
            DefaultTableModel tblModel =  (DefaultTableModel)jTable2.getModel();
            tblModel.addRow(tableData);
          //  jTable2.addRow(new Object[]{Sname, price, amount, date});
            System.out.println(j);
            j++; 
            //x++;
        }
            
            conn.close();
            
    } catch (SQLException ex) {
        //Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("Exeption found"+ex);
    }
    
    
    
    
    
    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
            
            conn.close();
            
    } catch (SQLException ex) {
        //Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("Exeption found"+ex);
    }
    
    
    
    
    
    
    
    
    
    
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(FB_DashboardFarmers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FB_DashboardFarmers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FB_DashboardFarmers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FB_DashboardFarmers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FB_DashboardFarmers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}