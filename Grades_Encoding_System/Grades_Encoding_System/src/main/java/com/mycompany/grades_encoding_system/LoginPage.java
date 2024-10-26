
package com.mycompany.grades_encoding_system;

// Import necessary for some swing and file read functions to work properly
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Main Class for Login Page
public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
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

        LoginTitlePanel = new javax.swing.JPanel();
        LoginTitle = new javax.swing.JLabel();
        LoginMainPanel = new javax.swing.JPanel();
        LoginPassLabel = new javax.swing.JLabel();
        LoginUsernameLabel = new javax.swing.JLabel();
        LoginUsernameTF = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        LoginPassPF = new javax.swing.JPasswordField();
        SignUpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginTitlePanel.setForeground(new java.awt.Color(242, 242, 242));

        LoginTitle.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        LoginTitle.setText("Grade Management System");
        LoginTitle.setAlignmentY(0.0F);
        LoginTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout LoginTitlePanelLayout = new javax.swing.GroupLayout(LoginTitlePanel);
        LoginTitlePanel.setLayout(LoginTitlePanelLayout);
        LoginTitlePanelLayout.setHorizontalGroup(
            LoginTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginTitlePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LoginTitle)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        LoginTitlePanelLayout.setVerticalGroup(
            LoginTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LoginMainPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Admin Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 36)), null)); // NOI18N

        LoginPassLabel.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        LoginPassLabel.setText("Password: ");

        LoginUsernameLabel.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        LoginUsernameLabel.setText("Username: ");

        LoginUsernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginUsernameTFActionPerformed(evt);
            }
        });

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        LoginPassPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginPassPFActionPerformed(evt);
            }
        });

        SignUpButton.setText("Signup");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginMainPanelLayout = new javax.swing.GroupLayout(LoginMainPanel);
        LoginMainPanel.setLayout(LoginMainPanelLayout);
        LoginMainPanelLayout.setHorizontalGroup(
            LoginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginMainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SignUpButton)
                .addGap(104, 104, 104))
            .addGroup(LoginMainPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(LoginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LoginMainPanelLayout.createSequentialGroup()
                        .addComponent(LoginUsernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LoginUsernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginMainPanelLayout.createSequentialGroup()
                        .addComponent(LoginPassLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LoginPassPF)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        LoginMainPanelLayout.setVerticalGroup(
            LoginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginMainPanelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(LoginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginUsernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LoginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginPassPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(LoginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton)
                    .addComponent(SignUpButton))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(LoginMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(LoginTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(LoginMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginUsernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginUsernameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginUsernameTFActionPerformed
   
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // Get Login Credentials Input
        String usernameInput = LoginUsernameTF.getText();
        String stringPassInput = new String(LoginPassPF.getPassword());
        
        // Validate Credentials if it's Already in File
        boolean isValid = checkCredentials(usernameInput, stringPassInput);
        
        // Check Input if Blank or Empty: Show Message; If Valid: Show Success Message - Redirect to Main Page; 
        // Else Show Incorrect Input
        if(usernameInput.isBlank() || stringPassInput.isBlank()){
            JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if(isValid) {
            JOptionPane.showMessageDialog(null, "Login successful!");
            MainPage mainPage = new MainPage();
            mainPage.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_LoginButtonActionPerformed

    private boolean checkCredentials(String username, String password) {
        // Read Each Line in File - Check if Input Credentials is contained in line
        // If yes return true; Else return error
        try (BufferedReader reader = new BufferedReader(new FileReader("user_credentials.txt"))) {
            String line;
            while((line = reader.readLine()) != null) {
                if (line.contains(username) && line.contains(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    private void LoginPassPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginPassPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginPassPFActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        // Redirect to Sign Up Page
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignUpButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginMainPanel;
    private javax.swing.JLabel LoginPassLabel;
    private javax.swing.JPasswordField LoginPassPF;
    private javax.swing.JLabel LoginTitle;
    private javax.swing.JPanel LoginTitlePanel;
    private javax.swing.JLabel LoginUsernameLabel;
    private javax.swing.JTextField LoginUsernameTF;
    private javax.swing.JButton SignUpButton;
    // End of variables declaration//GEN-END:variables
}
