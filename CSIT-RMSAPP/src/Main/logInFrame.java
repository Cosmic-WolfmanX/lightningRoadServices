package Main;


import Worker.*;
import Customer.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.io.File;
import java.lang.ClassLoader;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;
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
public class logInFrame extends javax.swing.JFrame {

    /**
     * Creates new form logInFrame
     */
    public logInFrame() {
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
        Title1 = new javax.swing.JLabel();
        userEnter = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        logIn = new javax.swing.JButton();
        Title3 = new javax.swing.JLabel();
        Title4 = new javax.swing.JLabel();
        passEnter = new javax.swing.JPasswordField();
        create1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        Title1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setText("Lightning Road Services");
        kGradientPanel1.add(Title1);
        Title1.setBounds(130, 20, 310, 90);

        userEnter.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        userEnter.setBorder(null);
        userEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userEnterActionPerformed(evt);
            }
        });
        kGradientPanel1.add(userEnter);
        userEnter.setBounds(160, 360, 300, 40);

        create.setBackground(new java.awt.Color(51, 51, 255));
        create.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        create.setText("Create Worker");
        create.setActionCommand("");
        create.setAutoscrolls(true);
        create.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 2));
        create.setContentAreaFilled(false);
        create.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        kGradientPanel1.add(create);
        create.setBounds(10, 640, 210, 60);

        logIn.setBackground(new java.awt.Color(255, 153, 0));
        logIn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        logIn.setText("Log-In");
        logIn.setActionCommand("");
        logIn.setAutoscrolls(true);
        logIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        logIn.setContentAreaFilled(false);
        logIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInActionPerformed(evt);
            }
        });
        logIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                logInKeyPressed(evt);
            }
        });
        kGradientPanel1.add(logIn);
        logIn.setBounds(340, 460, 170, 50);

        Title3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title3.setForeground(new java.awt.Color(255, 255, 255));
        Title3.setText("Password:");
        kGradientPanel1.add(Title3);
        Title3.setBounds(50, 400, 210, 70);

        Title4.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title4.setForeground(new java.awt.Color(255, 255, 255));
        Title4.setText("Username:");
        kGradientPanel1.add(Title4);
        Title4.setBounds(50, 340, 210, 70);

        passEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passEnterActionPerformed(evt);
            }
        });
        kGradientPanel1.add(passEnter);
        passEnter.setBounds(160, 410, 300, 40);

        create1.setBackground(new java.awt.Color(51, 51, 255));
        create1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        create1.setText("Create User");
        create1.setActionCommand("");
        create1.setAutoscrolls(true);
        create1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 2));
        create1.setContentAreaFilled(false);
        create1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        create1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(create1);
        create1.setBounds(330, 640, 210, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoBig.png"))); // NOI18N
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(150, 80, 280, 250);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 550, 710);

        setBounds(0, 0, 572, 747);
    }// </editor-fold>//GEN-END:initComponents

    private void userEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userEnterActionPerformed
    logInActionPerformed(evt);
// TODO add your handling code here:
    }//GEN-LAST:event_userEnterActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        
       this.setVisible(false);
       
       createWorker newwork = new createWorker();
       newwork.setVisible(true);
        
        
    }//GEN-LAST:event_createActionPerformed

    private void logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInActionPerformed
        
        String Uname = userEnter.getText();
        String Pword = passEnter.getText();
        
        
        if("C".equals(Uname) && "C".equals(Pword))
        {
            this.setVisible(false);
            
            int id = 0;
            currentUser user = new currentUser(id,Global.data);
            Global.user = user;
       
            customerMainFrame cust = new customerMainFrame();
            cust.setVisible(true);
            
        }
        else if("W".equals(Uname) && "W".equals(Pword))
        {
            this.setVisible(false);
            
            int id = 500;
            currentUser user = new currentUser(id,Global.data);
            Global.user = user;
       
            WorkerMainFrame work = new WorkerMainFrame();
            work.setVisible(true);
            
        }
        else
        {
            //try
            //{
                int id = Integer.valueOf(Uname.substring(3));
                currentUser user = new currentUser(id,Global.data);
                Global.user = user;
                String actualPass = user.password;
                if (user.userName.equals(Uname))
                {
                    if(actualPass.equals(Pword))
                    {
                        this.setVisible(false);
                        if (user.isWorker){
                            WorkerMainFrame work = new WorkerMainFrame();
                            work.setVisible(true);
                        }
                        else{
                            customerMainFrame cust = new customerMainFrame();
                            cust.setVisible(true);
                        }

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Inncorrect Username or Password");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Inncorrect Username or Password");
                }
            //}
            //finally{
                //JOptionPane.showMessageDialog(null, "failed");
            //}
            
        }
              
        
    }//GEN-LAST:event_logInActionPerformed
    private static final Logger LOG = Logger.getLogger(logInFrame.class.getName());

    private void passEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passEnterActionPerformed

    private void create1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
       
       createCustomer newCust = new createCustomer();
       newCust.setVisible(true);
    }//GEN-LAST:event_create1ActionPerformed

    private void logInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logInKeyPressed
        // TODO add your handling code here:

        
    }//GEN-LAST:event_logInKeyPressed

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
        DataCollection randomData = Global.data;


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logInFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel Title4;
    private javax.swing.JButton create;
    private javax.swing.JButton create1;
    private javax.swing.JLabel jLabel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton logIn;
    private javax.swing.JPasswordField passEnter;
    private javax.swing.JTextField userEnter;
    // End of variables declaration//GEN-END:variables
}
