
package cb;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.Statement;
 
public class Database {
	Connection connection;
	DriverManager dm;
	Statement stm;
	
	public Database() {}
	
	public java.sql.Connection connect(String _DB_URL,String _username,String _password) {
		try {
			connection=DriverManager.getConnection(_DB_URL, _username, _password);
			return connection;
		}
		catch(SQLException e) {
			//e.printStackTrace();
			System.out.println("A a a you didn't say the magic word");
			return null;
		}
	}
	
	public int executeStatement(String sql) {
		try {
			stm=connection.createStatement();
			return stm.executeUpdate(sql);
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("A a a you still haven't said the magic word");
			return -22;
		}
		
	}
	
}
	
//	
//    public static final String HOST = "localhost";
//    public static final String PORT = "3306";
//    public static final String DRIVER = "jdbc:mysql://";
//    public static final String DB = "sales";
//    public static final String USER = "root";
//    public static final String PASSWORD = "yF1q37$f98&!";//put your workbench password
//    
//    
//    public static void main(String[] args) throws SQLException /*Connection getDBConnection() throws SQLException*/ {
//        Connection conn = DriverManager.getConnection(DRIVER + HOST + ":" + PORT + "/" + DB, USER, PASSWORD);
//        
//        Statement stmt = null;
//        String query ="CREATE TABLE `telcatalog1`.`tel` ("
//        		  +"`id` INT NOT NULL AUTO_INCREMENT,"
//        		  +"`cid` INT NOT NULL,"
//        		  +"`telephone` VARCHAR(20) NULL,"
//        		  +"PRIMARY KEY (`id`),"
//        		  +"INDEX `cid_fk_idx` (`cid` ASC),"
//        		  +"CONSTRAINT `cid_fk`"
//        		   +"FOREIGN KEY (`cid`)"
//        		   +"REFERENCES `telcatalog1`.`contact` (`id`)"
//        		    +"ON DELETE NO ACTION"
//        		    +"ON UPDATE NO ACTION)"
//        		+"ENGINE = InnoDB"
//        		+"DEFAULT CHARACTER SET = utf8;"
//        		+"\n"+"\n"
//        		
//        		+"ALTER TABLE `telcatalog1`.`tel`"
//        		+"DROP FOREIGN KEY `cid_fk`;"
//        		+"ALTER TABLE `telcatalog1`.`tel`"
//        		+"ADD CONSTRAINT `tel_cid_is_contact_id_fk`"
//        		  +"FOREIGN KEY (`cid`)"
//        		  +"REFERENCES `telcatalog1`.`contact` (`id`)"
//        		  +"ON DELETE NO ACTION"
//        		  +"ON UPDATE NO ACTION;"
//        		  +"\n"+"\n"
//
//        		+"CREATE TABLE `telcatalog1`.`address` ("
//        		  +"`id` INT NOT NULL AUTO_INCREMENT,"
//        		  +"`cid` INT NOT NULL,"
//        		  +"`address1` VARCHAR(40) NULL,"
//        		  +"`area` VARCHAR(20) NULL,"
//        		  +"`city` VARCHAR(20) NULL,"
//        		  +"`country` VARCHAR(20) NULL,"
//        		  +"PRIMARY KEY (`id`),"
//        		  +"INDEX `cid_addr_fk_idx` (`cid` ASC),"
//        		  +"CONSTRAINT `cid_addr_fk`"
//        		    +"FOREIGN KEY (`cid`)"
//        		    +"REFERENCES `telcatalog1`.`contact` (`id`)"
//        		    +"ON DELETE NO ACTION"
//        		    +"ON UPDATE NO ACTION)"
//        		+"ENGINE = InnoDB"
//        		+"DEFAULT CHARACTER SET = utf8;"
//        		 +"\n"+"\n"
//
//        		+"ALTER TABLE `telcatalog1`.`address`"
//        		+"DROP FOREIGN KEY `cid_addr_fk`;"
//        		+"ALTER TABLE `telcatalog1`.`address`"
//        		+"ADD CONSTRAINT `addr_cid_is_contact_id_fk`"
//        		  +"FOREIGN KEY (`cid`)"
//        		  +"REFERENCES `telcatalog1`.`contact` (`id`)"
//        		  +"ON DELETE NO ACTION"
//        		  +"ON UPDATE NO ACTION;";
//
//        
//        
////        String query = "SELECT Cname AS 'Customers', COUNT(Ccode) AS 'Total orders' FROM customers\r\n" + 
////                "JOIN sales USING (Ccode) \r\n" + 
////                "GROUP BY Ccode\r\n" + 
////                "ORDER BY COUNT(Ccode) desc;";
////        
////        try {
////            stmt = conn.createStatement();
////            ResultSet rs = stmt.executeQuery(query);
////            while (rs.next()) {
////                String coffeeName = rs.getString("Customers");
////                int supplierID = rs.getInt("Total orders");
////                
////                System.out.println(coffeeName + "\t" + supplierID);
////            }
////        } catch (SQLException e ) {
////       
////        } finally {
////            if (stmt != null) { stmt.close(); }
////        }
//    }
//    
//    public static void closedDBConnection(Connection conn) throws SQLException {
//        conn.close();
//    }
//}


 


 
