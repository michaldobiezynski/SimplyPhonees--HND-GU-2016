
package simplyphones;
//organizing imports
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//This class is used for connect to data base 
public class DBClass {
    private static Connection con;

    public static Connection connectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
             //Initializing database details
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Simply_Phones", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
        }
        return con;
    }
    
}
