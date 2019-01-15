package senatus_consultum_ultimum;

import java.util.Scanner;

import last.DBConnection;

public class DBMain {

	public static void main(String[] args) {

		String url=null;
		String username=null;
		String password=null;
		LogIn login=new LogIn();
		Menu menu=new Menu();
		Method method=new Method();
		String DBName=null;
		String Answer=null;
		menu.LogInMenu(url,username,password,login);
		
		do {
			String Choice1 = menu.CreateDBMenu();

			switch (Choice1) {
			
			//1. Create a test Database called "middle_earth_school"
			case "1":
				method.CreateEmptyDB(login,"middle_earth_school");
				method.PopulateEmptyDB(login,"middle_earth_school");
				System.out.println("\n");
				break;
			
			//2. Create an empty DataBase called whatever the user chooses
			case "2":
				Scanner sc = new Scanner(System.in);
				System.out.println("Please type in a name for the new and empty Database(NO SPACES):");
				DBName = sc.next();
				sc.close();
				method.CreateEmptyDB(login, DBName);
				System.out.println("\n");
				break;

			//3. Configure or Search Entries in a Database
			case "3":
				Scanner scan=new Scanner(System.in);
				System.out.println("Please type in the name of the existing Database"+"\n"
				                  +"you want to configure or Search Entries (NO SPACES):");
				DBName = scan.next();
				String Choice2=menu.DBCRUDMenu();
				
				switch (Choice2) {
				
				//1. Create a new entry (student,worker)
				case "1":
					
					System.out.println("\n");
					break;
					
				//2. Search for an entry (student,worker)
				case "2":
					
					System.out.println("\n");
					break;
					
				//3. Update an entry (student,worker)
				case "3":
					
					System.out.println("\n");
					break;
					
				//4. Delete an entry (student,worker)
				case "4":
					
					System.out.println("\n");
					break;
					
				//5. Exit CRUD Menu
				case "5":
					System.out.print("Exiting CRUD Menu..."+"\n");
					break;
					}
				System.out.println("\n");
				break;
				}
			
			Scanner sc0=new Scanner(System.in);
			String str0="Do you want to continue searching, making changes"+"\n"
			           +"in Database Entries or creating Databases (y/n): ";
			System.out.println(str0);
			Answer = sc0.next();
			while(!Answer.equals("y")&&!Answer.equals("n")) {
				System.out.println("Invalid input"+"\n"+"please type one of the following choices"+str0);
				Answer=sc0.next();
				}
			System.out.print("\n");
			
			} while (!Answer.equalsIgnoreCase("n"));
		
		
		
		
		
		
		
		}
	}
