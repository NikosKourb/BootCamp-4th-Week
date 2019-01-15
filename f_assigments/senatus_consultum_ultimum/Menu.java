package senatus_consultum_ultimum;

import java.util.Scanner;

public class Menu {

	public Menu() {}

	
	
	public void LogInMenu(String url,String username,String password,LogIn login1) {
		
		Scanner sc1=new Scanner(System.in);
		
		
		//URL Configuration (for the main user log in)
		System.out.println("Give me the URL of your server or type 'D'"+"\n"
		                  +"to load default (jdbc:mysql://localhost:3306): ");
		
		String urlOption = sc1.next();
		String urlFinal = null;
		if (urlOption.equalsIgnoreCase("D")) {
			url = "jdbc:mysql://localhost:3306/?useSSL=false";
			} 
		else {
			url = urlOption;
			}
		urlFinal = url;

		
		//USERNAME CONFIGURATION (for the main user log in)
		System.out.println("Give me the USERNAME of your server account or type 'D' to load default(root)");
		String usernameOption = sc1.next();
		String usernameFinal = null;
		if (urlOption.equalsIgnoreCase("D")) {
			username = "root";
			} 
		else {
			username = usernameOption;
			}
		usernameFinal = username;

		
		//PASSWORD CONFIGURATION (for the main user log in)
		System.out.println("Give me the PASSWORD of your server account or type 'D' to load default");
		String passwordOption = sc1.next();
		String passwordFinal = null;
		if (urlOption.equalsIgnoreCase("D")) {
			password = "yF1q37$f98&!";
			} 
		else {
			password = passwordOption;
			}
		passwordFinal = password;
		
		login1.connect(urlFinal,usernameFinal,passwordFinal);
		}
	
	
	
	public String CreateDBMenu() {
		
		Scanner sc2=new Scanner(System.in);
		
		//DATABASE MAIN MENU
		String str1 = "Please select one of following choices:" + "\n"
				    + "1. Create a test Database (middle_earth_school, with 10 students & 5 teachers)" + "\n"
				    + "2. Create an empty DataBase (like above without entries and a name of your choosing)" + "\n"
				    + "3. Configure or Search Entries in a Database (requires choices 1 or 2 to be done at least once)" + "\n"
				    + "Type in a number from the above:";

		System.out.println(str1);
		String DBMainMenuChoice = sc2.next();

		while (!DBMainMenuChoice.equals("1") && !DBMainMenuChoice.equals("2")) {
			System.out.println("\n"+"Invalid input" + "\n" + str1);
			DBMainMenuChoice = sc2.next();
			}
		return DBMainMenuChoice;
		}
	
	
	
	public String DBCRUDMenu() {
		
		Scanner sc3=new Scanner(System.in);
		//Database CRUD MENU
		String str2="What do you want to do:"+"\n"
		           +"1. Create a new entry (student,worker)"+"\n"
		           +"2. Search for an entry (student,worker)"+"\n"
	               +"3. Update an entry (student,worker)"+"\n"
	               +"4. Delete an entry (student,worker)"+"\n"
	               +"5. Exit CRUD Menu"+"\n"
		           +"Type in a number from the above:";
		
		System.out.println(str2);
		String DBCRUDMenuChoice=sc3.next();
		while(!DBCRUDMenuChoice.equals("1")&&!DBCRUDMenuChoice.equals("2")
			  &&!DBCRUDMenuChoice.equals("3")&&!DBCRUDMenuChoice.equals("4")) {
			System.out.println("\n"+"Invalid input"+"\n"+str2);
			DBCRUDMenuChoice=sc3.next();
			}
		return DBCRUDMenuChoice;
		}
	
	
	
	public void CreateEntryMenu(LogIn login1,String DBName) {
		
		Scanner sc4=new Scanner(System.in);
		String str3="Please select what type of entry do you want to Create:"
				   +"\n"+"1. Student"
		           +"\n"+"2. Worker"
				   +"\n"+"3. Cancel inputing new Entry"
				   +"\n"+"Type in a number from the above:";
		System.out.println(str3);
		String CreateEntryMenuChoice=sc4.next();
		while(!CreateEntryMenuChoice.equals("1")&&!CreateEntryMenuChoice.equals("2")
			&&!CreateEntryMenuChoice.equals("3")) {
			System.out.println("\n"+"Invalid input"+"\n"+str3);
			CreateEntryMenuChoice=sc4.next();
			}
		
		switch(CreateEntryMenuChoice) {
		   
		    case "1": 
		    	System.out.println("Please type in the Student's First Name: ");
		    	String strFName=sc4.next();
		    	while(strFName.length()<3) {
		    		System.out.println("\n"+"First Name too Short"+"\n"+"Please type in the Student's First Name: ");
		    		}
		    	String StudentFNamefinal=strFName.substring(0,1)+strFName.substring(1);
		    	
		    	System.out.println("Please type in the Student's Last Name: ");
		    	String strLName=sc4.next();
		    	while(strFName.length()<4) {
		    		System.out.println("\n"+"Last Name too Short"+"\n"+"Please type in the Student's Last Name: ");
		    		}
		    	String StudentLNamefinal=strLName.substring(0,1)+strLName.substring(1);
		    	
		    	System.out.println("Please type in the Student's Faculty Number: ");
		    	String strFNumber=sc4.next();
		    	while((strFNumber.length()<6)||(strFNumber.length()>11)||!strFNumber.matches("^[A-Za-z0-9]+$")) {
		    		System.out.println("\n"+"Invalid Faculty Number Length"+"\n"
		    	                           +"(Faculty Number Length Must be between 5-10 characters)"+"\n"
		    	                           +"Please type in the Student's Last Name: ");
		    		}
		    	
		    	login1.executeStatement("INSERT INTO `"+DBName+"`.`students` "
		    			              + "(`first_name`, `last_name`, `faculty_number`) "
		    			              + "VALUES ('"+StudentFNamefinal+"', '"+StudentLNamefinal+"', '7');");
		    	
		    	break;
		    	
		    case "2":
		    	
		    	break;
		    	
		    case "3":
		    	System.out.print("Canceling inputing Entry..."+"\n");
		    	break;
		    	}
			
			

			
		}
	
	
	
	

}
