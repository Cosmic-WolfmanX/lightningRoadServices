package Worker;

import Customer.*;
import Worker.*;
import Customer.*;
import Main.*;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author codym
 */
public class makeReportW extends javax.swing.JFrame {

    /**
     * Creates new form logInFrame
     */
    public makeReportW() {
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
        Title5 = new javax.swing.JLabel();
        DropM = new javax.swing.JComboBox();
        dash = new javax.swing.JTextField();
        Title10 = new javax.swing.JLabel();
        dash7 = new javax.swing.JTextField();
        expiryDayEnter = new javax.swing.JTextField();
        expiryYearEnter = new javax.swing.JTextField();
        Title9 = new javax.swing.JLabel();
        fnameV = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        incidentReports2 = new javax.swing.JTextArea();
        Title6 = new javax.swing.JLabel();
        Title7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        incidentReports = new javax.swing.JTextArea();
        createU2 = new javax.swing.JButton();
        Title12 = new javax.swing.JLabel();
        CustomerNameEnt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 950));
        setName("MainFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(900, 950));
        getContentPane().setLayout(null);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 153, 0));
        kGradientPanel1.setkGradientFocus(850);
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 51, 255));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(550, 710));
        kGradientPanel1.setLayout(null);

        Title5.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title5.setForeground(new java.awt.Color(255, 255, 255));
        Title5.setText("Lighting Road Assistance");
        kGradientPanel1.add(Title5);
        Title5.setBounds(20, 0, 320, 80);

        DropM.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        DropM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Menu", "Edit Profile", "View Vehicle/s", "Add Vehicle", "See Quotes", "See Upcoming Payments", "View Past Reports", "Make Report", "Log-out" }));
        DropM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropMActionPerformed(evt);
            }
        });
        kGradientPanel1.add(DropM);
        DropM.setBounds(300, 10, 240, 60);

        dash.setEditable(false);
        dash.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        dash.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dash.setText("/");
        dash.setBorder(null);
        dash.setOpaque(false);
        kGradientPanel1.add(dash);
        dash.setBounds(200, 90, 30, 30);

        Title10.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title10.setForeground(new java.awt.Color(255, 255, 255));
        Title10.setText("Date:");
        kGradientPanel1.add(Title10);
        Title10.setBounds(10, 70, 100, 70);

        dash7.setEditable(false);
        dash7.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        dash7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dash7.setText("/");
        dash7.setBorder(null);
        dash7.setOpaque(false);
        kGradientPanel1.add(dash7);
        dash7.setBounds(140, 90, 30, 30);

        expiryDayEnter.setEditable(false);
        expiryDayEnter.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        expiryDayEnter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expiryDayEnter.setText("D");
        kGradientPanel1.add(expiryDayEnter);
        expiryDayEnter.setBounds(110, 90, 30, 30);

        expiryYearEnter.setEditable(false);
        expiryYearEnter.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        expiryYearEnter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expiryYearEnter.setText("Y");
        kGradientPanel1.add(expiryYearEnter);
        expiryYearEnter.setBounds(230, 90, 30, 30);

        Title9.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title9.setForeground(new java.awt.Color(255, 255, 255));
        Title9.setText("Location:");
        kGradientPanel1.add(Title9);
        Title9.setBounds(270, 70, 100, 70);

        fnameV.setEditable(false);
        fnameV.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        kGradientPanel1.add(fnameV);
        fnameV.setBounds(370, 90, 160, 40);

        incidentReports2.setEditable(false);
        incidentReports2.setColumns(20);
        incidentReports2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        incidentReports2.setRows(5);
        jScrollPane3.setViewportView(incidentReports2);

        kGradientPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(10, 240, 520, 140);

        Title6.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title6.setForeground(new java.awt.Color(255, 255, 255));
        Title6.setText("Incident Details:");
        kGradientPanel1.add(Title6);
        Title6.setBounds(10, 190, 250, 70);

        Title7.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title7.setForeground(new java.awt.Color(255, 255, 255));
        Title7.setText("Repairs Given:");
        kGradientPanel1.add(Title7);
        Title7.setBounds(10, 370, 250, 70);

        incidentReports.setEditable(false);
        incidentReports.setColumns(20);
        incidentReports.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        incidentReports.setRows(5);
        jScrollPane1.setViewportView(incidentReports);

        kGradientPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 420, 520, 140);

        createU2.setBackground(new java.awt.Color(51, 51, 255));
        createU2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        createU2.setText("Make Report");
        createU2.setActionCommand("");
        createU2.setAutoscrolls(true);
        createU2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 2));
        createU2.setContentAreaFilled(false);
        createU2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        kGradientPanel1.add(createU2);
        createU2.setBounds(320, 570, 210, 60);

        Title12.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Title12.setForeground(new java.awt.Color(255, 255, 255));
        Title12.setText("Customers Name:");
        kGradientPanel1.add(Title12);
        Title12.setBounds(10, 140, 190, 70);

        CustomerNameEnt.setEditable(false);
        CustomerNameEnt.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        kGradientPanel1.add(CustomerNameEnt);
        CustomerNameEnt.setBounds(220, 160, 160, 40);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 550, 710);

        setBounds(0, 0, 572, 691);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JTextField CustomerNameEnt;
    private javax.swing.JComboBox DropM;
    private javax.swing.JLabel Title10;
    private javax.swing.JLabel Title12;
    private javax.swing.JLabel Title5;
    private javax.swing.JLabel Title6;
    private javax.swing.JLabel Title7;
    private javax.swing.JLabel Title9;
    private javax.swing.JButton createU2;
    private javax.swing.JTextField dash;
    private javax.swing.JTextField dash7;
    private javax.swing.JTextField expiryDayEnter;
    private javax.swing.JTextField expiryYearEnter;
    private javax.swing.JTextField fnameV;
    private javax.swing.JTextArea incidentReports;
    private javax.swing.JTextArea incidentReports2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
