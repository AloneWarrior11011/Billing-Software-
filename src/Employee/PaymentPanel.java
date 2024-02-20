/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Employee;

import DataBaseCon.DataBaseOperations;
import gettersetter.RegisterModelEncapsulation;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 * @author HP
 */

public class PaymentPanel extends javax.swing.JFrame {

    /**
     * Creates new form PaymentPanel
     */
    RegisterModelEncapsulation rme;
    HashMap<String,ArrayList> hm;
    String totalBill;
    String phone_no;
    String name;
    public PaymentPanel(RegisterModelEncapsulation rme,HashMap hm,String totalBill,String name,String phone_no) {
        initComponents();
        
         this.hm=hm;
         this.rme=rme;
         
        this.totalBill=totalBill;
        this.phone_no=phone_no;
        this.name=name;
        
        jLabel1.setText("Welcome : "+rme.getName());
       // NameField.setText("Hello  :  ");
        NameField.setText(name+"  ("+phone_no+") ");
        FinalAmountField.setText(totalBill);  
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FinalAmountField = new javax.swing.JTextField();
        CashProvided = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        ReturnAmtField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 730));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(625, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 70));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Payment panel ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 108, -1, 44));

        FinalAmountField.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        FinalAmountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalAmountFieldActionPerformed(evt);
            }
        });
        getContentPane().add(FinalAmountField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 463, 42));

        CashProvided.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        CashProvided.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashProvidedActionPerformed(evt);
            }
        });
        CashProvided.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CashProvidedKeyReleased(evt);
            }
        });
        getContentPane().add(CashProvided, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 463, 42));

        NameField.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        getContentPane().add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 463, 42));

        ReturnAmtField.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        getContentPane().add(ReturnAmtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 463, 43));

        jButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 21)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Amount recieved");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 640, 258, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 255));
        jLabel4.setText("Your Final Amount Is : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, 42));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 255));
        jLabel5.setText("Hello : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, -1, 33));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 255));
        jLabel6.setText("Amount To Be Returned :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, -1, 33));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 255));
        jLabel7.setText("Cash Provided : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, -1, 33));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EmpPanelBg_1.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FinalAmountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalAmountFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FinalAmountFieldActionPerformed

    private void CashProvidedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashProvidedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CashProvidedActionPerformed

    private void CashProvidedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CashProvidedKeyReleased
        // TODO add your handling code here:
        String amt_rec = CashProvided.getText();
        int return_amt = Integer.parseInt(amt_rec) - Integer.parseInt(totalBill);
        ReturnAmtField.setText(String.valueOf(return_amt));
    }//GEN-LAST:event_CashProvidedKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String items =hashMapToString(hm);
        
        LocalDate ld = LocalDate.now();
        String date1 =  ld.toString();
        
        LocalTime lt = LocalTime.now();
        String time1 = lt.toString();
        
        boolean sts =DataBaseOperations.customerBillingDetails(phone_no, items, date1,  time1, rme.getEmail());
        if(sts)
        {
            JOptionPane.showMessageDialog(rootPane, "Amount Recieved Successfully");
            new EmployeePanel(rme).setVisible(true);
            setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Amount didn't recieved due to some error.","Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    String hashMapToString(HashMap<String,ArrayList> hm)
     {
         String items=" ";
         for(Map.Entry me : hm.entrySet())
         {
               items+=me.getKey()+",";
               ArrayList al = (ArrayList) me.getValue();
               items+=al.get(0)+",";
               items+=al.get(1)+",";
               items+=al.get(2)+",";
         }
        return items;
     }
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
            java.util.logging.Logger.getLogger(PaymentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentPanel(null,null,null,null,null).setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CashProvided;
    private javax.swing.JTextField FinalAmountField;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField ReturnAmtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
