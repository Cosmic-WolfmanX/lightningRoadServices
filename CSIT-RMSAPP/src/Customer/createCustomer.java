package Customer;


import Worker.*;
import Customer.*;
import Main.*;


import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author codym
 */
public class createCustomer extends javax.swing.JFrame {

    /**
     * Creates new form logInFrame
     */
    public createCustomer() 
    {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        Title2 = new javax.swing.JLabel();
        Title3 = new javax.swing.JLabel();
        Title4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Title6 = new javax.swing.JLabel();
        Title11 = new javax.swing.JLabel();
        getProfilePic = new javax.swing.JButton();
        emailEnter = new javax.swing.JTextField();
        lNameEnter = new javax.swing.JTextField();
        mobileEnter = new javax.swing.JTextField();
        dash = new javax.swing.JTextField();
        createU = new javax.swing.JButton();
        Title12 = new javax.swing.JLabel();
        Title7 = new javax.swing.JLabel();
        fNameEnter = new javax.swing.JTextField();
        Title8 = new javax.swing.JLabel();
        Title9 = new javax.swing.JLabel();
        cNumberEnter = new javax.swing.JTextField();
        cvvEnter = new javax.swing.JTextField();
        expiryYearEnter = new javax.swing.JTextField();
        expiryMonthEnter = new javax.swing.JTextField();
        Title10 = new javax.swing.JLabel();
        cNameEnter = new javax.swing.JTextField();
        gold = new javax.swing.JRadioButton();
        Title15 = new javax.swing.JLabel();
        Title16 = new javax.swing.JLabel();
        silver = new javax.swing.JRadioButton();
        bronze = new javax.swing.JRadioButton();
        Title14 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        Title13 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 950));
        setName("MainFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(550, 1050));
        getContentPane().setLayout(null);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 153, 0));
        kGradientPanel1.setkGradientFocus(850);
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 51, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(550, 1050));
        kGradientPanel1.setLayout(null);

        Title2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setText("Lighting Road Assistance");
        kGradientPanel1.add(Title2);
        Title2.setBounds(240, 20, 300, 80);

        Title3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title3.setForeground(new java.awt.Color(255, 255, 255));
        Title3.setText("Member Ship Class: ");
        kGradientPanel1.add(Title3);
        Title3.setBounds(20, 470, 210, 70);

        Title4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title4.setForeground(new java.awt.Color(255, 255, 255));
        Title4.setText("Last Name:");
        kGradientPanel1.add(Title4);
        Title4.setBounds(20, 280, 210, 70);

        jSeparator1.setBackground(new java.awt.Color(51, 0, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));
        jSeparator1.setAlignmentX(2.0F);
        jSeparator1.setAlignmentY(2.0F);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kGradientPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 470, 550, 10);
        jSeparator1.getAccessibleContext().setAccessibleDescription("");

        Title6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title6.setForeground(new java.awt.Color(255, 255, 255));
        Title6.setText("CVV:");
        kGradientPanel1.add(Title6);
        Title6.setBounds(20, 710, 210, 70);

        Title11.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title11.setForeground(new java.awt.Color(255, 255, 255));
        Title11.setText("Email:");
        kGradientPanel1.add(Title11);
        Title11.setBounds(20, 410, 210, 70);

        getProfilePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blank-profile1.png"))); // NOI18N
        getProfilePic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getProfilePicActionPerformed(evt);
            }
        });
        kGradientPanel1.add(getProfilePic);
        getProfilePic.setBounds(20, 20, 210, 220);

        emailEnter.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel1.add(emailEnter);
        emailEnter.setBounds(210, 430, 210, 30);

        lNameEnter.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel1.add(lNameEnter);
        lNameEnter.setBounds(210, 300, 210, 30);

        mobileEnter.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel1.add(mobileEnter);
        mobileEnter.setBounds(210, 390, 210, 30);

        dash.setEditable(false);
        dash.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        dash.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dash.setText("/");
        dash.setBorder(null);
        dash.setOpaque(false);
        kGradientPanel1.add(dash);
        dash.setBounds(260, 690, 30, 30);

        createU.setBackground(new java.awt.Color(51, 51, 255));
        createU.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        createU.setText("Create User");
        createU.setActionCommand("");
        createU.setAutoscrolls(true);
        createU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 2));
        createU.setContentAreaFilled(false);
        createU.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        createU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUActionPerformed(evt);
            }
        });
        kGradientPanel1.add(createU);
        createU.setBounds(330, 700, 210, 60);

        Title12.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title12.setForeground(new java.awt.Color(255, 255, 255));
        Title12.setText("First Name:");
        kGradientPanel1.add(Title12);
        Title12.setBounds(20, 240, 210, 70);

        Title7.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title7.setForeground(new java.awt.Color(255, 255, 255));
        Title7.setText("Mobile: ");
        kGradientPanel1.add(Title7);
        Title7.setBounds(20, 370, 210, 70);

        fNameEnter.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel1.add(fNameEnter);
        fNameEnter.setBounds(210, 260, 210, 30);

        Title8.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title8.setForeground(new java.awt.Color(255, 255, 255));
        Title8.setText("Card Number:");
        kGradientPanel1.add(Title8);
        Title8.setBounds(20, 590, 210, 70);

        Title9.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title9.setForeground(new java.awt.Color(255, 255, 255));
        Title9.setText("Name on Card:");
        kGradientPanel1.add(Title9);
        Title9.setBounds(20, 630, 210, 70);

        cNumberEnter.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel1.add(cNumberEnter);
        cNumberEnter.setBounds(230, 600, 210, 30);

        cvvEnter.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel1.add(cvvEnter);
        cvvEnter.setBounds(230, 730, 90, 30);

        expiryYearEnter.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        expiryYearEnter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expiryYearEnter.setText("Y");
        kGradientPanel1.add(expiryYearEnter);
        expiryYearEnter.setBounds(290, 690, 30, 30);

        expiryMonthEnter.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        expiryMonthEnter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expiryMonthEnter.setText("M");
        kGradientPanel1.add(expiryMonthEnter);
        expiryMonthEnter.setBounds(230, 690, 30, 30);

        Title10.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title10.setForeground(new java.awt.Color(255, 255, 255));
        Title10.setText("Expiry Date:");
        kGradientPanel1.add(Title10);
        Title10.setBounds(20, 670, 210, 70);

        cNameEnter.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel1.add(cNameEnter);
        cNameEnter.setBounds(230, 650, 210, 30);

        gold.setBackground(new java.awt.Color(255, 102, 0));
        gold.setForeground(new java.awt.Color(255, 255, 255));
        gold.setText("GOLD 12 Months");
        gold.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        gold.setBorderPainted(true);
        kGradientPanel1.add(gold);
        gold.setBounds(230, 490, 160, 19);

        Title15.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title15.setForeground(new java.awt.Color(255, 255, 255));
        Title15.setText("$150");
        kGradientPanel1.add(Title15);
        Title15.setBounds(390, 490, 60, 30);

        Title16.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title16.setForeground(new java.awt.Color(255, 255, 255));
        Title16.setText("$75");
        kGradientPanel1.add(Title16);
        Title16.setBounds(390, 520, 60, 30);

        silver.setBackground(new java.awt.Color(255, 102, 0));
        silver.setForeground(new java.awt.Color(255, 255, 255));
        silver.setText("SILVER 6 Months");
        silver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        silver.setBorderPainted(true);
        kGradientPanel1.add(silver);
        silver.setBounds(230, 520, 160, 19);

        bronze.setBackground(new java.awt.Color(255, 102, 0));
        bronze.setForeground(new java.awt.Color(255, 255, 255));
        bronze.setText("BRONZE 3 Months");
        bronze.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        bronze.setBorderPainted(true);
        kGradientPanel1.add(bronze);
        bronze.setBounds(230, 550, 160, 19);

        Title14.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title14.setForeground(new java.awt.Color(255, 255, 255));
        Title14.setText("37.50");
        kGradientPanel1.add(Title14);
        Title14.setBounds(390, 550, 60, 30);

        jPasswordField1.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(210, 350, 210, 30);

        Title13.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title13.setForeground(new java.awt.Color(255, 255, 255));
        Title13.setText("Pass-Word:");
        kGradientPanel1.add(Title13);
        Title13.setBounds(20, 330, 210, 70);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 550, 990);

        setBounds(0, 0, 572, 1050);
    }// </editor-fold>//GEN-END:initComponents

    private void getProfilePicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getProfilePicActionPerformed
        try
        {
            Desktop desktop = null;
            if (Desktop.isDesktopSupported())
            {
              desktop = Desktop.getDesktop();
            }

            desktop.open(new File("C:\\Users\\codym\\Pictures"));
        } 
        catch (IOException ioe) 
        {
            ioe.printStackTrace();
        }
        
        URL url = null;
        /*try 
        {
            url = new URL("C:\\Users\\codym\\Pictures\\818.png");
        } 
        catch (MalformedURLException ex)
        {
            Logger.getLogger(createCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage(url);
        this.setIconImage(img);*/
        
    }//GEN-LAST:event_getProfilePicActionPerformed

    private void createUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUActionPerformed
        String firstName = fNameEnter.getText();
        String lastName = lNameEnter.getText();
        String password = jPasswordField1.getText();
        long mobile = Long.valueOf(mobileEnter.getText().trim());
        String email = emailEnter.getText();
        int membershipStatus = 0;
        if (gold.isSelected())
        {
            membershipStatus = 3;
        }
        else if (silver.isSelected())
        {
            membershipStatus = 2;
        }
        else{
            membershipStatus = 1;
        }
        long ccNum = Long.valueOf(cNumberEnter.getText().trim());
        int cvv = Integer.valueOf(cvvEnter.getText());
        int ccMonth = Integer.valueOf(expiryMonthEnter.getText());
        int ccYear = Integer.valueOf(expiryYearEnter.getText());
        String nameOnCard = cNameEnter.getText();
        
        
        CustomerRecord newCust = Global.data.add_customer(firstName, lastName, password, mobile, email, membershipStatus, ccNum, nameOnCard, ccMonth, ccYear, cvv);
        currentUser user = new currentUser(newCust.id,Global.data);
        Global.user = user;
        
        this.setVisible(false);
        customerMainFrame cust = new customerMainFrame();
        cust.setVisible(true);
        //take data and store into CSV File
        //move to customer bio 

    }//GEN-LAST:event_createUActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            java.util.logging.Logger.getLogger(logInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logInFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title10;
    private javax.swing.JLabel Title11;
    private javax.swing.JLabel Title12;
    private javax.swing.JLabel Title13;
    private javax.swing.JLabel Title14;
    private javax.swing.JLabel Title15;
    private javax.swing.JLabel Title16;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel Title4;
    private javax.swing.JLabel Title6;
    private javax.swing.JLabel Title7;
    private javax.swing.JLabel Title8;
    private javax.swing.JLabel Title9;
    private javax.swing.JRadioButton bronze;
    private javax.swing.JTextField cNameEnter;
    private javax.swing.JTextField cNumberEnter;
    private javax.swing.JButton createU;
    private javax.swing.JTextField cvvEnter;
    private javax.swing.JTextField dash;
    private javax.swing.JTextField emailEnter;
    private javax.swing.JTextField expiryMonthEnter;
    private javax.swing.JTextField expiryYearEnter;
    private javax.swing.JTextField fNameEnter;
    private javax.swing.JButton getProfilePic;
    private javax.swing.JRadioButton gold;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField lNameEnter;
    private javax.swing.JTextField mobileEnter;
    private javax.swing.JRadioButton silver;
    // End of variables declaration//GEN-END:variables

    private Object getFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
