/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package orutaprivacy;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author RameshKumar
 */
public class EndUser extends javax.swing.JFrame {
    String user="";
    
    /**
     * Creates new form EndUser
     */
    public EndUser() {
        initComponents();
        //this.getContentPane().setBackground(Color.CYAN);
    }

    EndUser(String user) {
        initComponents();
        this.user=user;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username_txt = new javax.swing.JTextField();
        filename_txt = new javax.swing.JTextField();
        pkey_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        backgroundimg = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("End User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 803, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 61, 439, 258));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("Ownername");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 104, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 255));
        jLabel4.setText("Filename");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 151, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 255));
        jLabel5.setText("Privatekey");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 200, -1, -1));
        getContentPane().add(username_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 104, 137, -1));
        getContentPane().add(filename_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 151, 137, -1));

        pkey_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pkey_txtActionPerformed(evt);
            }
        });
        getContentPane().add(pkey_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 200, 137, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter/backbtn.jpg"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 27));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inter/resetimg123.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, 27));

        jButton1.setBackground(java.awt.Color.red);
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Receive");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jButton2.setBackground(java.awt.Color.red);
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Download");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, 20));

        backgroundimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/7.jpg"))); // NOI18N
        getContentPane().add(backgroundimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 450));

        jMenu1.setText("File");

        jMenu2.setText("View Attackers File");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pkey_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pkey_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pkey_txtActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new DataOwner().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        username_txt.setText("");
        filename_txt.setText("");
        pkey_txt.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
     new ViewCloudAttakers().setVisible(true);
        dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = username_txt.getText();
        String fileName = filename_txt.getText();
        String private_key = pkey_txt.getText();
        //String fil=jTextArea1.getText();
        try {
            Connection con = null;
            String url = "jdbc:mysql://localhost:3306/";
            String driver = "com.mysql.jdbc.Driver";
            String db = "orutapreserving";

            
             Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url + db, "root", "");
            java.sql.Statement st = con.createStatement();
            String sql = "select * from fileupload WHERE Filename like '%" + fileName + "%' and Username = '" + username + "'";
            System.out.println(sql);
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {

                if (private_key.equals(rs.getString("Privatekey"))) {

                    String fl = rs.getString("File");
                    jTextArea1.setText(fl);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid key");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Credentials");
                 java.sql.Statement stmt = con.createStatement();
                String ins_breach = "INSERT INTO `viewcloudattaker`(`username`,`fileName`,`privatekey`) VALUES ('" + username + "','" + fileName + "','" + private_key + "')";
                int status = stmt.executeUpdate(ins_breach);
            }
        } //System.out.println("value inserted");
        catch (Exception ex) {
            System.out.println(ex);
            ex.printStackTrace();
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String text = jTextArea1.getText();

        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("./"));
        int actionDialog = chooser.showSaveDialog(this);
        if (actionDialog == JFileChooser.APPROVE_OPTION) {
            File fileName = chooser.getSelectedFile();
            if (fileName == null) {
                return;
            }
            if (fileName.exists()) {
                actionDialog = JOptionPane.showConfirmDialog(this,
                        "Replace existing file?");
                if (actionDialog == JOptionPane.NO_OPTION) {
                    return;
                }
            }
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(fileName));

                out.write(text);
                out.close();

            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EndUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EndUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EndUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EndUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EndUser().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundimg;
    private javax.swing.JTextField filename_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField pkey_txt;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
