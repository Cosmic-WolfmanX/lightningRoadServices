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
public class viewVehicle extends javax.swing.JFrame {

    /**
     * Creates new form logInFrame
     */
    public viewVehicle() 
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        fNameEnter2 = new javax.swing.JTextField();
        Title15 = new javax.swing.JLabel();
        Title9 = new javax.swing.JLabel();
        mobileEnter2 = new javax.swing.JTextField();
        lNameEnter2 = new javax.swing.JTextField();
        emailEnter2 = new javax.swing.JTextField();
        getProfilePic1 = new javax.swing.JButton();
        Title16 = new javax.swing.JLabel();
        Title17 = new javax.swing.JLabel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        fNameEnter3 = new javax.swing.JTextField();
        Title18 = new javax.swing.JLabel();
        Title10 = new javax.swing.JLabel();
        mobileEnter3 = new javax.swing.JTextField();
        lNameEnter3 = new javax.swing.JTextField();
        emailEnter3 = new javax.swing.JTextField();
        getProfilePic2 = new javax.swing.JButton();
        Title31 = new javax.swing.JLabel();
        Title32 = new javax.swing.JLabel();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        fNameEnter4 = new javax.swing.JTextField();
        Title33 = new javax.swing.JLabel();
        Title11 = new javax.swing.JLabel();
        mobileEnter4 = new javax.swing.JTextField();
        lNameEnter4 = new javax.swing.JTextField();
        emailEnter4 = new javax.swing.JTextField();
        getProfilePic3 = new javax.swing.JButton();
        Title34 = new javax.swing.JLabel();
        Title35 = new javax.swing.JLabel();
        kGradientPanel8 = new keeptoo.KGradientPanel();
        fNameEnter5 = new javax.swing.JTextField();
        Title36 = new javax.swing.JLabel();
        Title12 = new javax.swing.JLabel();
        mobileEnter5 = new javax.swing.JTextField();
        lNameEnter5 = new javax.swing.JTextField();
        emailEnter5 = new javax.swing.JTextField();
        getProfilePic4 = new javax.swing.JButton();
        Title37 = new javax.swing.JLabel();
        Title38 = new javax.swing.JLabel();
        DropM = new javax.swing.JComboBox();

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
        Title2.setBounds(20, 0, 300, 80);

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 102, 0));
        kGradientPanel2.setkGradientFocus(750);
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 51, 255));
        kGradientPanel2.setLayout(null);

        fNameEnter2.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel2.add(fNameEnter2);
        fNameEnter2.setBounds(210, 90, 210, 30);

        Title15.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title15.setForeground(new java.awt.Color(255, 255, 255));
        Title15.setText("Vehicle Make:");
        kGradientPanel2.add(Title15);
        Title15.setBounds(20, 110, 210, 70);

        Title9.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title9.setForeground(new java.awt.Color(255, 255, 255));
        Title9.setText("Year:");
        kGradientPanel2.add(Title9);
        Title9.setBounds(20, 180, 210, 70);

        mobileEnter2.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel2.add(mobileEnter2);
        mobileEnter2.setBounds(210, 200, 210, 30);

        lNameEnter2.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel2.add(lNameEnter2);
        lNameEnter2.setBounds(210, 130, 210, 30);

        emailEnter2.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel2.add(emailEnter2);
        emailEnter2.setBounds(210, 240, 210, 30);

        getProfilePic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blank-profile1.png"))); // NOI18N
        getProfilePic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getProfilePic1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(getProfilePic1);
        getProfilePic1.setBounds(20, 280, 470, 200);

        Title16.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title16.setForeground(new java.awt.Color(255, 255, 255));
        Title16.setText("Regostration:");
        kGradientPanel2.add(Title16);
        Title16.setBounds(20, 220, 210, 70);

        Title17.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title17.setForeground(new java.awt.Color(255, 255, 255));
        Title17.setText("Vehicle Modle:");
        kGradientPanel2.add(Title17);
        Title17.setBounds(20, 70, 210, 70);

        jTabbedPane1.addTab("Vehicle One", kGradientPanel2);

        kGradientPanel6.setkEndColor(new java.awt.Color(255, 102, 0));
        kGradientPanel6.setkGradientFocus(750);
        kGradientPanel6.setkStartColor(new java.awt.Color(0, 51, 255));
        kGradientPanel6.setLayout(null);

        fNameEnter3.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel6.add(fNameEnter3);
        fNameEnter3.setBounds(210, 90, 210, 30);

        Title18.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title18.setForeground(new java.awt.Color(255, 255, 255));
        Title18.setText("Vehicle Make:");
        kGradientPanel6.add(Title18);
        Title18.setBounds(20, 110, 210, 70);

        Title10.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title10.setForeground(new java.awt.Color(255, 255, 255));
        Title10.setText("Year:");
        kGradientPanel6.add(Title10);
        Title10.setBounds(20, 180, 210, 70);

        mobileEnter3.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel6.add(mobileEnter3);
        mobileEnter3.setBounds(210, 200, 210, 30);

        lNameEnter3.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel6.add(lNameEnter3);
        lNameEnter3.setBounds(210, 130, 210, 30);

        emailEnter3.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel6.add(emailEnter3);
        emailEnter3.setBounds(210, 240, 210, 30);

        getProfilePic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blank-profile1.png"))); // NOI18N
        getProfilePic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getProfilePic2ActionPerformed(evt);
            }
        });
        kGradientPanel6.add(getProfilePic2);
        getProfilePic2.setBounds(20, 280, 470, 200);

        Title31.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title31.setForeground(new java.awt.Color(255, 255, 255));
        Title31.setText("Regostration:");
        kGradientPanel6.add(Title31);
        Title31.setBounds(20, 220, 210, 70);

        Title32.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title32.setForeground(new java.awt.Color(255, 255, 255));
        Title32.setText("Vehicle Modle:");
        kGradientPanel6.add(Title32);
        Title32.setBounds(20, 70, 210, 70);

        jTabbedPane1.addTab("Vehicle Two", kGradientPanel6);

        kGradientPanel7.setkEndColor(new java.awt.Color(255, 102, 0));
        kGradientPanel7.setkGradientFocus(750);
        kGradientPanel7.setkStartColor(new java.awt.Color(0, 51, 255));
        kGradientPanel7.setLayout(null);

        fNameEnter4.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel7.add(fNameEnter4);
        fNameEnter4.setBounds(210, 90, 210, 30);

        Title33.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title33.setForeground(new java.awt.Color(255, 255, 255));
        Title33.setText("Vehicle Make:");
        kGradientPanel7.add(Title33);
        Title33.setBounds(20, 110, 210, 70);

        Title11.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title11.setForeground(new java.awt.Color(255, 255, 255));
        Title11.setText("Year:");
        kGradientPanel7.add(Title11);
        Title11.setBounds(20, 180, 210, 70);

        mobileEnter4.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel7.add(mobileEnter4);
        mobileEnter4.setBounds(210, 200, 210, 30);

        lNameEnter4.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel7.add(lNameEnter4);
        lNameEnter4.setBounds(210, 130, 210, 30);

        emailEnter4.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel7.add(emailEnter4);
        emailEnter4.setBounds(210, 240, 210, 30);

        getProfilePic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blank-profile1.png"))); // NOI18N
        getProfilePic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getProfilePic3ActionPerformed(evt);
            }
        });
        kGradientPanel7.add(getProfilePic3);
        getProfilePic3.setBounds(20, 280, 470, 200);

        Title34.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title34.setForeground(new java.awt.Color(255, 255, 255));
        Title34.setText("Regostration:");
        kGradientPanel7.add(Title34);
        Title34.setBounds(20, 220, 210, 70);

        Title35.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title35.setForeground(new java.awt.Color(255, 255, 255));
        Title35.setText("Vehicle Modle:");
        kGradientPanel7.add(Title35);
        Title35.setBounds(20, 70, 210, 70);

        jTabbedPane1.addTab("Vehicle Three", kGradientPanel7);

        kGradientPanel8.setkEndColor(new java.awt.Color(255, 102, 0));
        kGradientPanel8.setkGradientFocus(750);
        kGradientPanel8.setkStartColor(new java.awt.Color(0, 51, 255));
        kGradientPanel8.setLayout(null);

        fNameEnter5.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel8.add(fNameEnter5);
        fNameEnter5.setBounds(210, 90, 210, 30);

        Title36.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title36.setForeground(new java.awt.Color(255, 255, 255));
        Title36.setText("Vehicle Make:");
        kGradientPanel8.add(Title36);
        Title36.setBounds(20, 110, 210, 70);

        Title12.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title12.setForeground(new java.awt.Color(255, 255, 255));
        Title12.setText("Year:");
        kGradientPanel8.add(Title12);
        Title12.setBounds(20, 180, 210, 70);

        mobileEnter5.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel8.add(mobileEnter5);
        mobileEnter5.setBounds(210, 200, 210, 30);

        lNameEnter5.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel8.add(lNameEnter5);
        lNameEnter5.setBounds(210, 130, 210, 30);

        emailEnter5.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        kGradientPanel8.add(emailEnter5);
        emailEnter5.setBounds(210, 240, 210, 30);

        getProfilePic4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blank-profile1.png"))); // NOI18N
        getProfilePic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getProfilePic4ActionPerformed(evt);
            }
        });
        kGradientPanel8.add(getProfilePic4);
        getProfilePic4.setBounds(20, 280, 470, 200);

        Title37.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title37.setForeground(new java.awt.Color(255, 255, 255));
        Title37.setText("Regostration:");
        kGradientPanel8.add(Title37);
        Title37.setBounds(20, 220, 210, 70);

        Title38.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title38.setForeground(new java.awt.Color(255, 255, 255));
        Title38.setText("Vehicle Modle:");
        kGradientPanel8.add(Title38);
        Title38.setBounds(20, 70, 210, 70);

        jTabbedPane1.addTab("Vehicle Four", kGradientPanel8);

        kGradientPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 70, 550, 920);

        DropM.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        DropM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Menu", "Edit Profile", "View Vehicle/s", "Add Vehicle", "See Quotes", "See Upcoming Payments", "View Past Reports", "Log-out" }));
        DropM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropMActionPerformed(evt);
            }
        });
        kGradientPanel1.add(DropM);
        DropM.setBounds(300, 10, 240, 60);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 550, 990);

        setBounds(0, 0, 572, 1050);
    }// </editor-fold>//GEN-END:initComponents

    private void getProfilePic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getProfilePic1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getProfilePic1ActionPerformed

    private void getProfilePic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getProfilePic2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getProfilePic2ActionPerformed

    private void getProfilePic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getProfilePic3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getProfilePic3ActionPerformed

    private void getProfilePic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getProfilePic4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getProfilePic4ActionPerformed

    private void DropMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropMActionPerformed

        if((String)DropM.getSelectedItem() == "Menu")
        {
            this.setVisible(false);

            customerMainFrame cust = new customerMainFrame();
            cust.setVisible(true);
        }
        else if((String)DropM.getSelectedItem() == "Edit Profile")
        {
            this.setVisible(false);

            CustomerEditDetails edit = new CustomerEditDetails();
            edit.setVisible(true);
        }
        else if((String)DropM.getSelectedItem() == "View Vehicle/s")
        {
            this.setVisible(false);

            viewVehicle pay = new viewVehicle();
            pay.setVisible(true);
        }
        else if((String)DropM.getSelectedItem() == "Add Vehicle")
        {
            this.setVisible(false);

            addVehicle addV = new addVehicle();
            addV.setVisible(true);
        }
        else if((String)DropM.getSelectedItem() == "See Quotes")
        {
            this.setVisible(false);

            seeQuotes pay = new seeQuotes();
            pay.setVisible(true);
        }
        else if((String)DropM.getSelectedItem() == "Log-out")
        {
            this.setVisible(false);

            logInFrame log = new logInFrame();
            log.setVisible(true);
        }
        else if((String)DropM.getSelectedItem() == "View Past Report")
        {
            this.setVisible(false);

            WorkerReport rep = new WorkerReport();
            rep.setVisible(true);
        }
        else if((String)DropM.getSelectedItem() == "Edit Profile")
        {
            this.setVisible(false);

            CustomerEditDetails edit = new CustomerEditDetails();
            edit.setVisible(true);
        }

    }//GEN-LAST:event_DropMActionPerformed

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
    private javax.swing.JComboBox DropM;
    private javax.swing.JLabel Title10;
    private javax.swing.JLabel Title11;
    private javax.swing.JLabel Title12;
    private javax.swing.JLabel Title15;
    private javax.swing.JLabel Title16;
    private javax.swing.JLabel Title17;
    private javax.swing.JLabel Title18;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Title31;
    private javax.swing.JLabel Title32;
    private javax.swing.JLabel Title33;
    private javax.swing.JLabel Title34;
    private javax.swing.JLabel Title35;
    private javax.swing.JLabel Title36;
    private javax.swing.JLabel Title37;
    private javax.swing.JLabel Title38;
    private javax.swing.JLabel Title9;
    private javax.swing.JTextField emailEnter2;
    private javax.swing.JTextField emailEnter3;
    private javax.swing.JTextField emailEnter4;
    private javax.swing.JTextField emailEnter5;
    private javax.swing.JTextField fNameEnter2;
    private javax.swing.JTextField fNameEnter3;
    private javax.swing.JTextField fNameEnter4;
    private javax.swing.JTextField fNameEnter5;
    private javax.swing.JButton getProfilePic1;
    private javax.swing.JButton getProfilePic2;
    private javax.swing.JButton getProfilePic3;
    private javax.swing.JButton getProfilePic4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private javax.swing.JTextField lNameEnter2;
    private javax.swing.JTextField lNameEnter3;
    private javax.swing.JTextField lNameEnter4;
    private javax.swing.JTextField lNameEnter5;
    private javax.swing.JTextField mobileEnter2;
    private javax.swing.JTextField mobileEnter3;
    private javax.swing.JTextField mobileEnter4;
    private javax.swing.JTextField mobileEnter5;
    // End of variables declaration//GEN-END:variables

    private Object getFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
