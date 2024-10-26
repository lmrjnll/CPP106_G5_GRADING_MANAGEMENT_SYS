package com.mycompany.grades_encoding_system;

// Import necessary for some swing and file read/write functions to work properly
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

// Main Class for Sign Up Page
public class SignUpPage extends javax.swing.JFrame {

    public SignUpPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // Swing Components Declaration
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignUpTitlePanel = new javax.swing.JPanel();
        SignUpTitle = new javax.swing.JLabel();
        SignUpMainPanel = new javax.swing.JPanel();
        SignUpPassLabel = new javax.swing.JLabel();
        SignUpUsernameLabel = new javax.swing.JLabel();
        SignUpUsernameTF = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        SignUpPassPF = new javax.swing.JPasswordField();
        SignUpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SignUpTitlePanel.setForeground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout SignUpTitlePanelLayout = new javax.swing.GroupLayout(SignUpTitlePanel);
        SignUpTitlePanel.setLayout(SignUpTitlePanelLayout);
        SignUpTitlePanelLayout.setHorizontalGroup(
            SignUpTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );
        SignUpTitlePanelLayout.setVerticalGroup(
            SignUpTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        SignUpTitle.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        SignUpTitle.setText("Grade Management System");
        SignUpTitle.setAlignmentY(0.0F);
        SignUpTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        SignUpMainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Admin SignUp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 36))); // NOI18N

        SignUpPassLabel.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        SignUpPassLabel.setText("Password: ");

        SignUpUsernameLabel.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        SignUpUsernameLabel.setText("Username: ");

        SignUpUsernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpUsernameTFActionPerformed(evt);
            }
        });

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        SignUpPassPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpPassPFActionPerformed(evt);
            }
        });

        SignUpButton.setText("Signup");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SignUpMainPanelLayout = new javax.swing.GroupLayout(SignUpMainPanel);
        SignUpMainPanel.setLayout(SignUpMainPanelLayout);
        SignUpMainPanelLayout.setHorizontalGroup(
            SignUpMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpMainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignUpButton)
                .addGap(104, 104, 104))
            .addGroup(SignUpMainPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(SignUpMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(SignUpMainPanelLayout.createSequentialGroup()
                        .addComponent(SignUpUsernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SignUpUsernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SignUpMainPanelLayout.createSequentialGroup()
                        .addComponent(SignUpPassLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SignUpPassPF)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        SignUpMainPanelLayout.setVerticalGroup(
            SignUpMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignUpMainPanelLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(SignUpMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignUpUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignUpUsernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SignUpMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignUpPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignUpPassPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(SignUpMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton)
                    .addComponent(SignUpButton))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SignUpTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SignUpTitle)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SignUpMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SignUpTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignUpTitle)
                .addGap(32, 32, 32)
                .addComponent(SignUpMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpUsernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpUsernameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpUsernameTFActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // Redirect to Login Page
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void SignUpPassPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpPassPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUpPassPFActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        // Get Username and Password Input
        String SUusername = SignUpUsernameTF.getText();
        String SUpass = new String(SignUpPassPF.getPassword());
        
        // Check if Credentials Already Exists
        boolean isValid = checkCredentials(SUusername);
        
        // If credentials is blank or already taken show warning; Else save credentials to file
        if(SUusername.isBlank() || SUpass.isBlank() || isValid){
            JOptionPane.showMessageDialog(null, "Username is Either Taken or Invalid", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            saveSignUp(SUusername, SUpass);
        }
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private boolean checkCredentials(String username) {
        // Read each line in file - chekc if line contains the username - return true if yes, return false if no
        try (BufferedReader reader = new BufferedReader(new FileReader("user_credentials.txt"))) {
            String line;
            while((line = reader.readLine()) != null) {
                if (line.contains(username)) {
                    return true;
                }
            }
        } catch (IOException e) {
        }
        return false;
    }
    
    private void saveSignUp(String username, String password){
        // Write on user credentials file the Username and Password, add new line, show success in signing up to user
        // if error show warning to user
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("user_credentials.txt", true))) {
            writer.write("Username: " + username + ", Password: " + password);
            writer.newLine();
            JOptionPane.showMessageDialog(null, "Successfully Signed Up!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error saving credentials.");
        }
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
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JPanel SignUpMainPanel;
    private javax.swing.JLabel SignUpPassLabel;
    private javax.swing.JPasswordField SignUpPassPF;
    private javax.swing.JLabel SignUpTitle;
    private javax.swing.JPanel SignUpTitlePanel;
    private javax.swing.JLabel SignUpUsernameLabel;
    private javax.swing.JTextField SignUpUsernameTF;
    // End of variables declaration//GEN-END:variables
}
