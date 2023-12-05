
package schooltech.ictsupport.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class User {
   protected Connection con;
    
    private String srCode;
    private String name;
    private String email;
    private String dateOfBirth;
    private String password;
    private String confirmPassword;

    
    public User() {
        // Default constructor
    }

    public User(String srCode, String name, String email, String dateOfBirth, String password, String confirmPassword) {
        this.srCode = srCode;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    // Getters and Setters
    public String getSrCode() {
        return srCode;
    }

    public void setSrCode(String srCode) {
        this.srCode = srCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
protected void connectToDatabase() throws SQLException {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooltech?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");

        // Set autocommit to false for manual transaction management
        con.setAutoCommit(false);

       
        // If everything is successful, commit the changes
        con.commit();
    } catch (ClassNotFoundException | SQLException ex) {
        // Rollback if an exception occurs
        if (con != null) {
            con.rollback();
        }
        ex.printStackTrace(); // Handle the exception appropriately
    } finally {
        // Always set autocommit back to true to avoid issues in subsequent transactions
        if (con != null) {
            con.setAutoCommit(true);
        }
    }
}

}

