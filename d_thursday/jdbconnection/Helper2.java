package jdbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper2 {
	
	public static final String HOST="localhost";
	public static final String PORT="3306";
	public static final String DRIVER="jdbc:mysql://";
	public static final String DB="vision";
	public static final String USER="user";
	public static final String PASSWORD="test";
	
	public static Connection getDBConnection() throws SQLException {
		Connection conn=DriverManager.getConnection(DRIVER+HOST+":"+DB,USER,PASSWORD);
		return conn;
		
	}
	public static void closeDBConnection(Connection conn) throws SQLException {
		conn.close();
	}

}
