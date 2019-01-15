package jdbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class Helper {
    public static final String HOST = "localhost";
    public static final String PORT = "3306";
    public static final String DRIVER = "jdbc:mysql://";
    public static final String DB = "sales";
    public static final String USER = "root";
    public static final String PASSWORD = "yF1q37$f98&!";//put your workbench password
    public static void main(String[] args) throws SQLException /*Connection getDBConnection() throws SQLException*/ {
        Connection conn = DriverManager.getConnection(DRIVER + HOST + ":" + PORT + "/" + DB, USER, PASSWORD);
        
        Statement stmt = null;
        String query = "SELECT Cname AS 'Customers', COUNT(Ccode) AS 'Total orders' FROM customers\r\n" + 
                "JOIN sales USING (Ccode) \r\n" + 
                "GROUP BY Ccode\r\n" + 
                "ORDER BY COUNT(Ccode) desc;";
        
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String coffeeName = rs.getString("Customers");
                int supplierID = rs.getInt("Total orders");
                
                System.out.println(coffeeName + "\t" + supplierID);
            }
        } catch (SQLException e ) {
       
        } finally {
            if (stmt != null) { stmt.close(); }
        }
    }
    
    public static void closedDBConnection(Connection conn) throws SQLException {
        conn.close();
    }
}


 


 
