
package simplyphones;

//organizing imports
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public static String user;

    public Login() {
        initComponents();
    }

    public static void setUser(String u) {
        user = u;
    }

    public static String getUser() {
        return user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton2.setText("Quit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Simply Phones");

        jRadioButton3.setText("Manager");
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pick Type of User");

        jRadioButton4.setText("Sales Team Member");
        jRadioButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton4MouseClicked(evt);
            }
        });

        jRadioButton2.setText("Customer");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        jLabel3.setText("Password");

        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPasswordField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jRadioButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jRadioButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton3)
                        .addComponent(jPasswordField1)))
                .addGap(116, 116, 116))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:

            //create connection to DB
            Connection con = DBClass.connectDB();
            Statement s = con.createStatement();

            //Get the user entered password
            String password = jPasswordField1.getText();

            //Check which user type is selected
            //When user type is 'Customer' 
            if (jRadioButton2.isSelected()) {

                
                //Query the password for 'Customer' from DataBase
                String userType = "Customer";
                ResultSet rs = s.executeQuery("SELECT * FROM users WHERE UserType LIKE '%" + userType + "%'");

                while (rs.next()) {

                    //Set current user type as Customer
                    Login.setUser(rs.getString(1));
                    
                    //check whether user entered password is correcct or not
                    //When password is correct
                    if (rs.getString(2).equals(password)) {

                        //Move to next menu
                        this.setVisible(false);
                        MainMenu mm = new MainMenu();
                        mm.setVisible(true);

                    } //When password is wrong
                    else {

                        //Show the error message
                        JOptionPane.showMessageDialog(rootPane, "Please enter correct password", "Wrong Password", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } //When user type is 'SalesTeamMember' 
            else if (jRadioButton4.isSelected()) {

                
                //Query the password for 'SalesTeamMember' from DataBase
                String userType = "SalesTeamMember";
                ResultSet rs = s.executeQuery("SELECT * FROM users WHERE UserType LIKE '%" + userType + "%'");

                while (rs.next()) {

                    //Set current user type as SalesTeamMember
                    Login.setUser(rs.getString(1));
                    
                    //check whether user entered password is correcct or not
                    //When password is correct
                    if (rs.getString(2).equals(password)) {

                        //Move to next menu
                        this.setVisible(false);
                        MainMenu mm = new MainMenu();
                        mm.setVisible(true);

                    } //When password is wrong
                    else {

                        //Show the error message
                        JOptionPane.showMessageDialog(rootPane, "Please enter correct password", "Wrong Password", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } //When user type is 'Manger'
            else if (jRadioButton3.isSelected()) {

                //Query the password for 'Manger' from DataBase
                String userType = "Manger";
                ResultSet rs = s.executeQuery("SELECT * FROM users WHERE UserType LIKE '%" + userType + "%'");

                while (rs.next()) {

                    //Set current user type as Manger                
                    Login.setUser(rs.getString(1));
                    
                    //check whether user entered password is correcct or not
                    //When password is correct
                    if (rs.getString(2).equals(password)) {

                        //Move to next menu
                        this.setVisible(false);
                        MainMenu mm = new MainMenu();
                        mm.setVisible(true);

                    } //When password is wrong
                    else {

                        //Show the error message
                        JOptionPane.showMessageDialog(rootPane, "Please enter correct password", "Wrong Password", JOptionPane.ERROR_MESSAGE);
                    }
                }

            } //When no user is selected
            else {

                //Show the error message when no user is selected
                JOptionPane.showMessageDialog(rootPane, "Please select a user type", "No user selected", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        //Quit from Login
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        // TODO add your handling code here:

        //Disable other two options, until user deselect the selected button
        jRadioButton2.setEnabled(true);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);

        //Clear previous selections
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);

        //Change text for easy identification of user
        jRadioButton2.setText("Customer");
        jRadioButton3.setText("Manger - click to enable");
        jRadioButton4.setText("SalesTeamMember - click to enable");
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton4MouseClicked
        // TODO add your handling code here:

        //Disable other two options, until user deselect the selected button
        jRadioButton4.setEnabled(true);
        jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);

        //Clear previous selections
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);

        //Change text for easy identification of user
        jRadioButton4.setText("SalesTeamMember");
        jRadioButton2.setText("Customer - click to enable");
        jRadioButton3.setText("Manger - click to enable");
    }//GEN-LAST:event_jRadioButton4MouseClicked

    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
        // TODO add your handling code here:

        //Disable other two options, until user deselect the selected button
        jRadioButton3.setEnabled(true);
        jRadioButton2.setEnabled(false);
        jRadioButton4.setEnabled(false);

        //Clear previous selections       
        jRadioButton2.setSelected(false);
        jRadioButton4.setSelected(false);

        //Change text for easy identification of user
        jRadioButton3.setText("Manger");
        jRadioButton2.setText("Customer - click to enable");
        jRadioButton4.setText("SalesTeamMember - click to enable");
    }//GEN-LAST:event_jRadioButton3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}