package Worker;


import Customer.*;
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
public class WorkerMainFrame extends javax.swing.JFrame 
{

    /**
     * Creates new form logInFrame
     */
    public WorkerMainFrame() 
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        Title3 = new javax.swing.JLabel();
        Title4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Title6 = new javax.swing.JLabel();
        Title11 = new javax.swing.JLabel();
        getProfilePic = new javax.swing.JButton();
        fnameV = new javax.swing.JTextField();
        emailV = new javax.swing.JTextField();
        mNumberV = new javax.swing.JTextField();
        lNameV = new javax.swing.JTextField();
        Title5 = new javax.swing.JLabel();
        Title9 = new javax.swing.JLabel();
        expiryDayEnter = new javax.swing.JTextField();
        dash = new javax.swing.JTextField();
        expiryMonthEnter = new javax.swing.JTextField();
        dash1 = new javax.swing.JTextField();
        expiryYearEnter = new javax.swing.JTextField();
        Title7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        repairReport = new javax.swing.JTextArea();
        Title8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inccidentReport1 = new javax.swing.JTextArea();
        Title12 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        DropM = new javax.swing.JComboBox();

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

        Title3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title3.setForeground(new java.awt.Color(255, 255, 255));
        Title3.setText("First Name:");
        kGradientPanel1.add(Title3);
        Title3.setBounds(20, 170, 210, 70);

        Title4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title4.setForeground(new java.awt.Color(255, 255, 255));
        Title4.setText("Last Name:");
        kGradientPanel1.add(Title4);
        Title4.setBounds(20, 210, 210, 70);

        jSeparator1.setBackground(new java.awt.Color(51, 0, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));
        jSeparator1.setAlignmentX(2.0F);
        jSeparator1.setAlignmentY(2.0F);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kGradientPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 360, 550, 10);

        Title6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title6.setForeground(new java.awt.Color(255, 255, 255));
        Title6.setText("Mobile: ");
        kGradientPanel1.add(Title6);
        Title6.setBounds(20, 250, 210, 70);

        Title11.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title11.setForeground(new java.awt.Color(255, 255, 255));
        Title11.setText("Email:");
        kGradientPanel1.add(Title11);
        Title11.setBounds(20, 290, 210, 70);

        getProfilePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blank-profile1.png"))); // NOI18N
        kGradientPanel1.add(getProfilePic);
        getProfilePic.setBounds(20, 20, 190, 170);

        fnameV.setEditable(false);
        fnameV.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        fnameV.setText(Global.user.firstName);
        fnameV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameVActionPerformed(evt);
            }
        });
        kGradientPanel1.add(fnameV);
        fnameV.setBounds(210, 190, 210, 40);

        emailV.setEditable(false);
        emailV.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        emailV.setText(Global.user.email);
        kGradientPanel1.add(emailV);
        emailV.setBounds(210, 310, 210, 40);

        mNumberV.setEditable(false);
        mNumberV.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        mNumberV.setText(String.valueOf(Global.user.phoneNum));
        kGradientPanel1.add(mNumberV);
        mNumberV.setBounds(210, 270, 210, 40);

        lNameV.setEditable(false);
        lNameV.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        lNameV.setText(Global.user.lastName);
        lNameV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameVActionPerformed(evt);
            }
        });
        kGradientPanel1.add(lNameV);
        lNameV.setBounds(210, 230, 210, 40);

        Title5.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        Title5.setForeground(new java.awt.Color(255, 255, 255));
        Title5.setText("Most Recent Report");
        kGradientPanel1.add(Title5);
        Title5.setBounds(10, 370, 270, 40);

        Title9.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title9.setForeground(new java.awt.Color(255, 255, 255));
        Title9.setText("Date:");
        kGradientPanel1.add(Title9);
        Title9.setBounds(10, 380, 100, 70);

        expiryDayEnter.setEditable(false);
        expiryDayEnter.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        expiryDayEnter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expiryDayEnter.setText("D");
        expiryDayEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expiryDayEnterActionPerformed(evt);
            }
        });
        kGradientPanel1.add(expiryDayEnter);
        expiryDayEnter.setBounds(90, 400, 30, 30);

        dash.setEditable(false);
        dash.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        dash.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dash.setText("/");
        dash.setBorder(null);
        dash.setOpaque(false);
        kGradientPanel1.add(dash);
        dash.setBounds(120, 400, 30, 30);

        expiryMonthEnter.setEditable(false);
        expiryMonthEnter.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        expiryMonthEnter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expiryMonthEnter.setText("M");
        kGradientPanel1.add(expiryMonthEnter);
        expiryMonthEnter.setBounds(150, 400, 30, 30);

        dash1.setEditable(false);
        dash1.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        dash1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dash1.setText("/");
        dash1.setBorder(null);
        dash1.setOpaque(false);
        kGradientPanel1.add(dash1);
        dash1.setBounds(180, 400, 30, 30);

        expiryYearEnter.setEditable(false);
        expiryYearEnter.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        expiryYearEnter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expiryYearEnter.setText("Y");
        kGradientPanel1.add(expiryYearEnter);
        expiryYearEnter.setBounds(210, 400, 30, 30);

        Title7.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title7.setForeground(new java.awt.Color(255, 255, 255));
        Title7.setText("Repair Details:");
        kGradientPanel1.add(Title7);
        Title7.setBounds(10, 510, 250, 70);

        repairReport.setEditable(false);
        repairReport.setColumns(20);
        repairReport.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        repairReport.setRows(5);
        jScrollPane1.setViewportView(repairReport);

        kGradientPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 560, 520, 70);

        Title8.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title8.setForeground(new java.awt.Color(255, 255, 255));
        Title8.setText("Incident Details:");
        kGradientPanel1.add(Title8);
        Title8.setBounds(10, 410, 250, 70);

        inccidentReport1.setEditable(false);
        inccidentReport1.setColumns(20);
        inccidentReport1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        inccidentReport1.setRows(5);
        jScrollPane2.setViewportView(inccidentReport1);

        kGradientPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 460, 520, 70);

        Title12.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title12.setForeground(new java.awt.Color(255, 255, 255));
        Title12.setText("Rating:");
        kGradientPanel1.add(Title12);
        Title12.setBounds(10, 610, 100, 70);

        jRadioButton2.setText("1 Star");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(90, 640, 80, 23);

        jRadioButton3.setText("2 Stars");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(170, 640, 90, 23);

        jRadioButton4.setText("3 Stars");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(260, 640, 90, 23);

        jRadioButton5.setText("4 Stars");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jRadioButton5);
        jRadioButton5.setBounds(350, 640, 90, 23);

        jRadioButton1.setText("5 Stars");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(440, 640, 90, 23);

        DropM.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        DropM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Menu", "Edit Profile", "View Vehicle/s", "Add Vehicle", "See Quotes", "See Upcoming Payments", "View Past Reports", "Make Report", "Log-out" }));
        DropM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropMActionPerformed(evt);
            }
        });
        kGradientPanel1.add(DropM);
        DropM.setBounds(300, 10, 240, 60);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 550, 1050);

        setBounds(0, 0, 572, 749);
    }// </editor-fold>//GEN-END:initComponents

    private void expiryDayEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expiryDayEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expiryDayEnterActionPerformed

    private void fnameVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameVActionPerformed

    private void lNameVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameVActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
        else if((String)DropM.getSelectedItem() == "Make Report")
        {
            this.setVisible(false);

            makeReportW RepMake = new makeReportW();
            RepMake.setVisible(true);
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
    private javax.swing.JLabel Title11;
    private javax.swing.JLabel Title12;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel Title4;
    private javax.swing.JLabel Title5;
    private javax.swing.JLabel Title6;
    private javax.swing.JLabel Title7;
    private javax.swing.JLabel Title8;
    private javax.swing.JLabel Title9;
    private javax.swing.JTextField dash;
    private javax.swing.JTextField dash1;
    private javax.swing.JTextField emailV;
    private javax.swing.JTextField expiryDayEnter;
    private javax.swing.JTextField expiryMonthEnter;
    private javax.swing.JTextField expiryYearEnter;
    private javax.swing.JTextField fnameV;
    private javax.swing.JButton getProfilePic;
    private javax.swing.JTextArea inccidentReport1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField lNameV;
    private javax.swing.JTextField mNumberV;
    private javax.swing.JTextArea repairReport;
    // End of variables declaration//GEN-END:variables

    private Object getFrame() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

