
package schooltech.ictsupport.User;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginClass extends User {
    private JTextField EmailInput;
    private JPasswordField PasswordInput;
     private String loggedInEmail;
     
    public LoginClass(JTextField EmailInput, JPasswordField PasswordInput){
        this.EmailInput = EmailInput;
        this.PasswordInput = PasswordInput;
    }
    
    public boolean performLogin(){
        String userEmail = EmailInput.getText();
        String userPassword = new String(PasswordInput.getPassword());
        
        if (userEmail.isEmpty() || userPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, " Please fill all Required Field");
            
            return false;
        }
        
         try {
        // Call verifyCredentials to check login credentials
        boolean credentialsValid = verifyCredentials(userEmail, userPassword);

        if (credentialsValid) {
            // Login successful, you can proceed with further actions
            // For example, show a new frame or perform other operations
            JOptionPane.showMessageDialog(null, "Login successful");
            loggedInEmail = userEmail;
            return true;
        } else {
            // Login failed, show an error message
            JOptionPane.showMessageDialog(null, "Invalid email or password");
            return false;
        }
    } catch (SQLException ex) {
        // Handle SQL exception, e.g., log the error
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error during login");
    }
      return true;
    }
  public String getloginemail(){
      
           
        return loggedInEmail;

      
  }
    public boolean verifyCredentials(String email, String password) throws SQLException{
        // Connect to the database using the 'con' connection obtained from the User class
        connectToDatabase();

        // Execute SQL statements to check login credentials
        // Example: Select user record from a 'users' table based on the provided email and password
        String sql = "SELECT * FROM users WHERE Emails = ? AND password = ?";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if a user with the provided credentials exists
            return resultSet.next();
        } catch (SQLException ex) {
            // Handle the exception, e.g., log the error
            ex.printStackTrace();
            return false;
        }
    }
    

}
    
    

    