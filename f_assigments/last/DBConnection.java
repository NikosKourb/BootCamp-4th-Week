package last;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	Connection conn;
	DriverManager dm;
	Statement stm;
	DBConnection dbc;

	public DBConnection() {}
	
	
	public java.sql.Connection connect(String dbURL,String userName,String passWord) {
		
		try {
			conn=DriverManager.getConnection(dbURL,userName,passWord);
			return null;
			}
		
		catch(SQLException e) {
			
			//e.printStackTrace();//<-----Tells what exception occurred during the run of the program
			                      //      can be silenced 
			System.out.println("There was an unexpected error with the connection");//<---message to print when the
			}                                                                       //    sql connection fails
			                                                                      
		return null;//<-----having the return statement show nothing
		}
	
	public int executeStatement(String sql) {
	
		try {
			stm=conn.createStatement();
			return stm.executeUpdate(sql);
			}
		
		catch(SQLException e) {
			//e.printStackTrace();
			System.out.println("There was an unexpected error with the Query Statement");//<---message to print when the
			}                                                                            //    query was not executed
		
		return 1;//<-----having the return statement show '1' if the Query was executed successfully
		
	}
	
	//SHOW STUDENT ENTRY(IES) BASED ON FIRST NAME
	public void showQueryResultsFName(String mydb,String firstName) {
		
		String query = "SELECT id AS 'std_id',first_name AS 'fName',last_name AS 'lName',faculty_number AS 'facultyNum' "
		              +"FROM "+mydb+".students"+"\n" 
                      +"WHERE fName="+firstName+" "+"\n"
                      +"GROUP BY lName"+"\n"
                      +"ORDER BY lName ASC;";
		
		try {
			ResultSet rs = stm.executeQuery(query);
			while (rs.next()) {
				int studentId=rs.getInt("std_id");
				String fName=rs.getString("fName");
				String lName=rs.getString("lName");
				int facultyNum=rs.getInt("facultyNum");
				System.out.println("Student ID     : { "+studentId+" }"+"\n"
						          +"First Name     : { "+fName+" }"+"\n"
						          +"Last Name      : { "+lName+" }"+"\n"
						          +"Faculty Number : { "+facultyNum+"}"+"\n");
			}
		}
		catch(SQLException e ){}
	}
    
	
	//SHOW STUDENT ENTRY(IES) BASED ON LAST NAME
	public void showQueryResultsLName(String mydb,String lastName) {
			
			String query = "SELECT id AS 'std_id',first_name AS 'fName',last_name AS 'lName',faculty_number AS 'facultyNum' "
			              +"FROM "+mydb+".students"+"\n" 
	                      +"WHERE lName="+lastName+" "+"\n"
	                      +"GROUP BY lName"+"\n"
	                      +"ORDER BY lName ASC;";
			
			try {
				ResultSet rs = stm.executeQuery(query);
				while (rs.next()) {
					int studentId=rs.getInt("std_id");
					String fName=rs.getString("fName");
					String lName=rs.getString("lName");
					int facultyNum=rs.getInt("facultyNum");
					System.out.println("Student ID     : { "+studentId+" }"+"\n"
							          +"First Name     : { "+fName+" }"+"\n"
							          +"Last Name      : { "+lName+" }"+"\n"
							          +"Faculty Number : { "+facultyNum+"}"+"\n");
				}
			}
			catch(SQLException e ){}
		}
	
	
	//SHOW STUDENT ENTRY(IES) BASED ON FACULTY NUMBER
	public void showQueryResultsFacultyNum(String mydb,String facultyNumber) {
			
			String query = "SELECT id AS 'std_id',first_name AS 'fName',last_name AS 'lName',faculty_number AS 'facultyNum' "
			              +"FROM "+mydb+".students"+"\n" 
	                      +"WHERE facultyNum="+facultyNumber+" "+"\n"
	                      +"GROUP BY lName"+"\n"
	                      +"ORDER BY lName ASC;";
			
			try {
				ResultSet rs = stm.executeQuery(query);
				while (rs.next()) {
					int studentId=rs.getInt("std_id");
					String fName=rs.getString("fName");
					String lName=rs.getString("lName");
					int facultyNum=rs.getInt("facultyNum");
					System.out.println("Student ID     : { "+studentId+" }"+"\n"
							          +"First Name     : { "+fName+" }"+"\n"
							          +"Last Name      : { "+lName+" }"+"\n"
							          +"Faculty Number : { "+facultyNum+"}"+"\n");
				}
			}
			catch(SQLException e ){}
		}
	
	//CREATE TEST DATABASE
		public void createTestDB() {
			dbc.executeStatement("CREATE SCHEMA `myschool`;");
		
			}

}
