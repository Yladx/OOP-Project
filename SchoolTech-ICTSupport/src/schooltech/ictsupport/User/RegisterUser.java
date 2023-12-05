package schooltech.ictsupport.User;

import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class  RegisterUser extends User{
    
    private final JTextField SrCode;
    private final JTextField Name;
    private final JTextField Email;
    private final JTextField DateofBirth;
    private final JTextField Password;
    private final JTextField ConfirmPass;
    // Constructor
    public RegisterUser(JTextField SrCode, JTextField Name, JTextField Email,
                        JTextField DateofBirth, JTextField Password, JTextField ConfirmPass) {
        this.SrCode = SrCode;
        this.Name = Name;
        this.Email = Email;
        this.DateofBirth = DateofBirth;
        this.Password = Password;
        this.ConfirmPass = ConfirmPass;
    }

    // Method to get all input values and perform validation
    public boolean getAllInputValues(JLabel UserInput) {
        // Get all input values
        setSrCode(SrCode.getText().trim());
        setName(Name.getText().trim());
        setEmail(Email.getText().trim());
        setDateOfBirth(DateofBirth.getText().trim());
        setPassword(Password.getText());
        setConfirmPassword(ConfirmPass.getText());

        // You can add validation or additional processing here if needed

        // For example, check if any of the required fields is empty
    if (getSrCode().isEmpty() || getName().isEmpty() || getEmail().isEmpty() ||
        getDateOfBirth().isEmpty() || getPassword().isEmpty() || getConfirmPassword().isEmpty()) {
        // Display an error message or handle the case where required fields are empty
        JOptionPane.showMessageDialog(null, "Please fill in all required fields.");
        // TODO: Add code to handle validation error
        return false; // Exit the method early if there's an error
    }

    // Check if password and confirm password match
    if (!getPassword().equals(getConfirmPassword())) {
        // Passwords don't match, display an error message
        JOptionPane.showMessageDialog(null, "Passwords do not match. Please enter matching passwords.");
        // TODO: Add code to handle password mismatch
        return false; // Exit the method early if there's an error
    }

    try {
        if (emailAlreadyExists(getEmail())) {
            // Email already exists, display an error message
            JOptionPane.showMessageDialog(null, "Email is already in use. Please choose a different email.");
            // TODO: Add code to handle duplicate email
            return false; // Exit the method early if there's an error
        }
    } catch (SQLException ex) {
        // Handle SQL exception, e.g., log the error
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error checking email existence.");
        return false; // Exit the method early if there's an error
    }

    UserInput.setText("<html>SR Code: " + getSrCode() + "<br>Name: " + getName() +
            "<br>Email: " + getEmail() + "<br>Date of Birth: " + getDateOfBirth() +
            "<br>Password: " + getPassword() + "</html>");

    // All validations passed
    return true;
    }
    
   private boolean emailAlreadyExists(String email) throws SQLException {
       
    connectToDatabase();
    
    String sql = "SELECT * FROM users WHERE Emails = ?";
    
    try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
        preparedStatement.setString(1, email);

        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            // If there is any result, the email already exists
            return resultSet.next();
        }
    } catch (SQLException ex) {
        // Handle the exception, e.g., log the error
        ex.printStackTrace();
        throw ex; // Re-throw the exception to propagate it up
    }
}
   
   
   public void saveToDatabase() throws SQLException {
  
        connectToDatabase();

        // Execute SQL statements to save user data to the database
        // Example: Insert a new user record into a 'users' table
        String sql = "INSERT INTO users (name, SrCode, Emails, DateOfBirth, Password) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            
            preparedStatement.setString(1, getName());
            preparedStatement.setString(2, getSrCode());
            preparedStatement.setString(3, getEmail());
            preparedStatement.setString(4, getDateOfBirth());
            preparedStatement.setString(5, getPassword());

            // Execute the update
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected <= 0) {
                throw new SQLException("Failed to insert user data into the database.");
            }
        }
        }
    
    
}

    
   


