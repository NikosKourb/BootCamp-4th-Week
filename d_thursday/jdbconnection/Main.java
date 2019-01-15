package jdbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	public static final String HOST="myhost";
	public static final String PORT="3306";
	public static final String DRIVER="jdbc:mysql://";
	public static final String DB="vision";
	public static final String USER="admin";
	public static final String PASSWORD="1234";
	
	public static void main(String[] args)
		throws SQLException {
		
		Connection con = null;
		String dbName="vision";
		Statement stm1=null;
		String query="select COF_NAME,SUP_ID,PRICE, "+
		"SALES,TOTAL "+
		"from "+dbName+".COFFEES";
		
		try {
			stm1=con.createStatement();
			ResultSet rs1=stm1.executeQuery(query);
			while(rs1.next()) {
				String coffeeName=rs1.getString("COF_NAME");
				int supplierID=rs1.getInt("SUP_ID");
				float price=rs1.getFloat("PRICE");
	            int sales = rs1.getInt("SALES");
	            int total = rs1.getInt("TOTAL");
	            System.out.println(coffeeName + "\t" + supplierID +
	                               "\t" + price + "\t" + sales +
	                               "\t" + total);
	        }
		}
		
		catch (SQLException e) {
			System.out.println("ERRRRRROOOOOORR");
			//JDBCTutorialUtilities.printSQLException(e);
			}
		
		finally {
			if(stm1!=null) {stm1.close();}
		}
	}
				
}