package Worker;


import Customer.*;
import Worker.*;
import Customer.*;
import Main.*;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author codym
 */
public class WorkerEditDetails extends javax.swing.JFrame {

    /**
     * Creates new form logInFrame
     */
    public WorkerEditDetails() {
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
        getProfilePic = new javax.swing.JButton();
        Title2 = new javax.swing.JLabel();
        fNameEnter = new javax.swing.JTextField();
        Title12 = new javax.swing.JLabel();
        Title7 = new javax.swing.JLabel();
        Title11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        mobileEnter = new javax.swing.JTextField();
        createU = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Title5 = new javax.swing.JLabel();
        lNameEnter = new javax.swing.JTextField();
        Title13 = new javax.swing.JLabel();
        emailEnter1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        DropM = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 950));
        setName("MainFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(550, 950));
        getContentPane().setLayout(null);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 153, 0));
        kGradientPanel1.setkGradientFocus(850);
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 51, 255));
        kGradientPanel1.setLayout(null);

        getProfilePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blank-profile1.png"))); // NOI18N
        getProfilePic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getProfilePicActionPerformed(evt);
            }
        });
        kGradientPanel1.add(getProfilePic);
        getProfilePic.setBounds(20, 20, 210, 200);

        Title2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setText("Lighting Road Assistance");
        kGradientPanel1.add(Title2);
        Title2.setBounds(230, 70, 300, 80);

        fNameEnter.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        fNameEnter.setText(Global.user.firstName);
        kGradientPanel1.add(fNameEnter);
        fNameEnter.setBounds(210, 240, 210, 30);

        Title12.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title12.setForeground(new java.awt.Color(255, 255, 255));
        Title12.setText("First Name:");
        kGradientPanel1.add(Title12);
        Title12.setBounds(20, 220, 210, 70);

        Title7.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title7.setForeground(new java.awt.Color(255, 255, 255));
        Title7.setText("Mobile: ");
        kGradientPanel1.add(Title7);
        Title7.setBounds(20, 310, 210, 70);

        Title11.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title11.setForeground(new java.awt.Color(255, 255, 255));
        Title11.setText("Pass-Word:");
        kGradientPanel1.add(Title11);
        Title11.setBounds(20, 390, 210, 70);

        jSeparator1.setBackground(new java.awt.Color(51, 0, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));
        jSeparator1.setAlignmentX(2.0F);
        jSeparator1.setAlignmentY(2.0F);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kGradientPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 450, 550, 10);

        mobileEnter.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        mobileEnter.setText(String.valueOf(Global.user.phoneNum)
        );
        mobileEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileEnterActionPerformed(evt);
            }
        });
        kGradientPanel1.add(mobileEnter);
        mobileEnter.setBounds(210, 330, 210, 30);

        createU.setBackground(new java.awt.Color(51, 51, 255));
        createU.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        createU.setText("Confirm Changes");
        createU.setToolTipText("");
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
        createU.setBounds(330, 470, 210, 60);
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(460, 600, 80, 20);

        Title5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title5.setForeground(new java.awt.Color(255, 255, 255));
        Title5.setText("Last Name:");
        kGradientPanel1.add(Title5);
        Title5.setBounds(20, 260, 210, 70);

        lNameEnter.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        lNameEnter.setText(Global.user.lastName);
        kGradientPanel1.add(lNameEnter);
        lNameEnter.setBounds(210, 280, 210, 30);

        Title13.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title13.setForeground(new java.awt.Color(255, 255, 255));
        Title13.setText("Email:");
        kGradientPanel1.add(Title13);
        Title13.setBounds(20, 350, 210, 70);

        emailEnter1.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        emailEnter1.setText(Global.user.email);
        kGradientPanel1.add(emailEnter1);
        emailEnter1.setBounds(210, 370, 210, 30);

        jPasswordField1.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jPasswordField1.setText("jPasswordField1");
        kGradientPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(210, 410, 210, 30);

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
        kGradientPanel1.setBounds(0, 0, 560, 610);

        setBounds(0, 0, 578, 653);
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

    private void mobileEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileEnterActionPerformed

    private void createUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUActionPerformed
        
    }//GEN-LAST:event_createUActionPerformed

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
    private javax.swing.JLabel Title13;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Title5;
    private javax.swing.JLabel Title7;
    private javax.swing.JButton createU;
    private javax.swing.JTextField emailEnter1;
    private javax.swing.JTextField fNameEnter;
    private javax.swing.JButton getProfilePic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField lNameEnter;
    private javax.swing.JTextField mobileEnter;
    // End of variables declaration//GEN-END:variables
}
