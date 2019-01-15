package cb;


import java.util.Scanner;

public class DBMain {
	
	static DBConnection dbc=new DBConnection();


	//public DBMain() {}

	public static void main(String[] args) {
		
		String url=null;
		String username=null;
		String password=null;
		
		Scanner sc= new Scanner(System.in);
		
		//LOGGING IN
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
		
			
			
			String str1="What do you want to do:"
			        +"\n"+"1. Create a test Database (myschooldb, with 10 students & 5 teachers)"
			        +"\n"+"2. Create an empty DataBase (like above without entries and a name of your choosing)"
			        +"Type in a number from the above:";
			
			System.out.println(str1);
			sc=new Scanner(System.in);
			String usrChoice=sc.next();
			
			while(!usrChoice.equals("1")&&!usrChoice.equals("2")) {
				System.out.println("Invalid input"+"\n"+str1);
				usrChoice=sc.next();
				}

		
		//1. Create a test Database (myschooldb, with 10 students & 5 teachers)
		
		dbc.createTestDB();
		
			
		
		/* +"\n"+"3. Search for an entry (teacher,student)"
         +"\n"+"4. Create new entry (teacher,student)"
         +"\n"+"5. Update an entry (teacher,student)"
         +*/
		
/*		
		Scanner sc=new Scanner(System.in);
		
		//LOG IN
		
		//URL CONFIGURATION
		System.out.println("Give me the URL of your server or type 'D' to load default: ");
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
		System.out.println("Give me the USERNAME of your server account or type 'D' to load default");
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
		
		
		//CREATE DATABASE
		System.out.println("Give me the NAME of your DATABASE: ");
		String dbNameOption=sc.next();
		dbc.executeStatement(dbNameOption);
		
		*/
		
		
		sc.close();

	}

}
