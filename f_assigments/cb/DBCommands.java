package cb;

import java.util.Scanner;


public class DBCommands {
	
	DBConnection dbc=new DBConnection();
	
	public DBCommands() {}
	
	//LOG IN METHOD
	public void LogIn() {
		String url=null;
		String username=null;
		String password=null;
		
		Scanner sc= new Scanner(System.in);
		
		//URL CONFIGURATION
		System.out.println("Give me the URL of your server or type 'D' to load default (jdbc:mysql://localhost:3306): ");
		String urlOption=sc.next();
		String urlFinal=null;
			try {
				if(urlOption.equalsIgnoreCase("D")) {
					url="jdbc:mysql://localhost:3306";
					}
				else {
					url=urlOption;
					}
				}
			catch(Exception e) {
				//e.printStackTrace();
				}
		urlFinal=url;
		
		//USERNAME CONFIGURATION
		System.out.println("Give me the USERNAME of your server account or type 'D' to load default(root)");
		String usernameOption=sc.next();
		String usernameFinal=null;
			try {
				if(urlOption.equalsIgnoreCase("D")) {
					username="root";
					}
				else {
					username=usernameOption;
					}
				}
			catch(Exception e) {
				//e.printStackTrace();
				}
		usernameFinal=username;
		
		//PASSWORD CONFIGURATION
		System.out.println("Give me the PASSWORD of your server account or type 'D' to load default");
		String passwordOption=sc.next();
		String passwordFinal=null;
		    try {
		    	if(urlOption.equalsIgnoreCase("D")) {
					password="yF1q37$f98&!";
					}
				else {
					password=passwordOption;
					}
				}
			catch(Exception e) {
				//e.printStackTrace();
				}
		passwordFinal=password;
		
		dbc.connect(urlFinal,usernameFinal,passwordFinal);
		
		sc.close();
	}
	
	
	
	//CREATE TEST DATABASE
	public void createTestDB() {
		dbc.executeStatement("CREATE SCHEMA `myschool`;");
	
		}
	
	//CREATE A TABLE
	
	
	
	//CREATE THE DEFAULT MySchool DB(empty)
	
	
	
	//CREATE THE DEFAULT MySchool DB(with entries)
	
	
	
	//CREATE AN ENTRY
	
	
	
	//READ AN ENTRY
	
	
	
	//UPDATE AN ENTRY
	
	
	
	//DELETE AN ENTRY

}
