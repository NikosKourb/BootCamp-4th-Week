package senatus_consultum_ultimum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LogIn {

	Connection conn;
	DriverManager dm;
	Statement stm;

	public LogIn() {
	}

	public java.sql.Connection connect(String dbURL, String userName, String passWord) {

		try {
			conn = DriverManager.getConnection(dbURL, userName, passWord);
			return null;
		}

		catch (SQLException e) {

			// e.printStackTrace();//<-----Tells what exception occurred during the run of
			                       // the program
			                       // can be silenced
			System.out.println("There was an unexpected error with the connection");// <---message to print when the
		}                                                                           // sql connection fails

		return null;// <-----having the return statement show nothing
	}

	public int executeStatement(String sql) {

		try {
			stm = conn.createStatement();
			return stm.executeUpdate(sql);
		}

		catch (SQLException e) {
			// e.printStackTrace();
			System.out.println("There was an unexpected error with the Query Statement");// <---message to print when
																					     // the query was not executed
		}

		return 1;// <-----having the return statement show '1' if the Query was executed
				 // successfully

	}
}
