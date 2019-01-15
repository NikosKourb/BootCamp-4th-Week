package last;


import java.util.Scanner;

public class DBMain {
	
	static DBConnection dbc=new DBConnection();

	public static void main(String[] args) {
		
		String url=null;
		String username=null;
		String password=null;
		
		Scanner sc= new Scanner(System.in);
		
		//url configuration
		System.out.println("Give me the URL of your server or type 'D' to load default (jdbc:mysql://localhost:3306): ");
		String urlOption=sc.next();
		String urlFinal=null;
				if(urlOption.equalsIgnoreCase("D")) {
					url="jdbc:mysql://localhost:3306";
					}
				else {
					url=urlOption;
					}		
		urlFinal=url;
		
		//username configuration
		System.out.println("Give me the USERNAME of your server account or type 'D' to load default(root)");
		String usernameOption=sc.next();
		String usernameFinal=null;
				if(urlOption.equalsIgnoreCase("D")) {
					username="root";
					}
				else {
					username=usernameOption;
					}
		usernameFinal=username;
		
		//password configuration
		System.out.println("Give me the PASSWORD of your server account or type 'D' to load default");
		String passwordOption=sc.next();
		String passwordFinal=null;
		    	if(urlOption.equalsIgnoreCase("D")) {
					password="Gt2!d7h3a&F85$";
					}
				else {
					password=passwordOption;
					}
		passwordFinal=password;
		
		//Primary Menu
		String str1="What do you want to do:"
		            +"\n"+"1. Create a test Database (myschooldb, with 10 students & 5 teachers)"
			        +"\n"+"2. Create an empty DataBase (like above without entries and a name of your choosing)"
			        +"\n"+"Type in a number from the above:";
		
		System.out.println(str1);
		String usrChoice=sc.next();
		
		while(!usrChoice.equals("1")&&!usrChoice.equals("2")) {
			System.out.println("Invalid input"+"\n"+str1);
			usrChoice=sc.next();
			}
		
		String answer=null;
		
		//Logging in
		dbc.connect(urlFinal,usernameFinal,passwordFinal);
		
		do {
			//1. Create a test Database (myschooldb, with 10 students & 5 teachers)
			if(usrChoice.equals("1")) {
				
				//Creating 'myschooldb' Database
				dbc.executeStatement("CREATE SCHEMA `myschooldb`;");
				
				//Creating an empty table 'students' in myschooldb Database
				dbc.executeStatement("CREATE TABLE `myschooldb`.`students` (\r\n" + 
				"  `id` INT NOT NULL AUTO_INCREMENT,\r\n" + 
				"  `first_name` VARCHAR(50) NOT NULL,\r\n" + 
				"  `last_name` VARCHAR(50) NOT NULL,\r\n" + 
				"  `faculty_number` INT NULL,\r\n" + 
				"  PRIMARY KEY (`id`));");
				
				//Creating an empty table 'workers' in myschooldb Database
				dbc.executeStatement("CREATE TABLE `myschooldb`.`workers` (\r\n" + 
				"  `id` INT NOT NULL AUTO_INCREMENT,\r\n" + 
				"  `first_name` VARCHAR(50) NOT NULL,\r\n" + 
				"  `last_name` VARCHAR(50) NOT NULL,\r\n" + 
				"  `salary_per_hour` DECIMAL(7,2) NULL,\r\n" + 
				"  `hours_per_day` INT NULL,\r\n" + 
				"  `weekly_salary` DECIMAL(7,2) NULL,\r\n" + 
				"  PRIMARY KEY (`id`));");
				
				//Populating the 'students' table
				dbc.executeStatement("INSERT INTO `myschooldb`.`students` "+"\n"
				                     +"(`first_name`, `last_name`, `faculty_number`) "+"\n"
				                     +"VALUES ('Frodo', 'Baggins', '5'),"
				                            +"('Samwise', 'Gamgee', '5'),"
				                            +"('Meriadoc ', 'Brandybuck', '6'),"
				                            +"('Peregrin', 'Took', '6'),"
				                            +"('Gimli', 'Gloinson', '7'),"
				                            +"('Legolas', 'Greenleaf', '7'),"
				                            +"('Boromir', 'Denethorson', '8'),"
				                            +"('Faramir', 'Denethorson', '8'),"
				                            +"('Aragorn', 'Elessar', '9'),"
				                            +"('Eomer', 'Eomundson', '10')");
				
				//Populating the 'workers' table
				dbc.executeStatement("INSERT INTO `myschooldb`.`workers` "+"\n"
				                     +"(`first_name`, `last_name`, `salary_per_hour`, `hours_per_day`, `weekly_salary`) "+"\n"
						             +"VALUES ('Gandalf', 'Mithrandir', '15.50', '7', '542.50'),"
						                    +"('Saruman', 'Curunir', '16.20', '8','567.00'),"
						                    +"('Radagast', 'BirdFriend', '13.45', '5', '336.25'),"
						                    +"('Denethor', 'Ecthelionson', '10.58', '4', '211.60'),"
						                    +"('Theoden', 'Thengelson', '10.23', '4', '204.60');");
				
				
				
				/*//Inserting the 'weekly_salary' into the 'workers' Table
				dbc.executeStatement("INSERT INTO `myschooldb`.`workers` "+"\n"
				                     +"(`weekly_salary`)"+"\n"
						             +"VALUES ('542.50')," 
						                    +"('567.00'),"
						                    +"('336.25'),"
						                    +"('211.60'),"
						                    +"('204.60');");
						        				                    
						         
						                     ('"+(dbc.executeStatement("SELECT salary_per_hour FROM myschooldb.workers"+"\n"+"where id=1;")*dbc.executeStatement("SELECT hours_per_day FROM myschooldb.workers"+"\n"+"where id=1;")*5)+"')," 
						             		 +"('"+(dbc.executeStatement("SELECT salary_per_hour FROM myschooldb.workers"+"\n"+"where id=2;")*dbc.executeStatement("SELECT hours_per_day FROM myschooldb.workers"+"\n"+"where id=2;")*5)+"'),"
						             		 +"('"+(dbc.executeStatement("SELECT salary_per_hour FROM myschooldb.workers"+"\n"+"where id=3;")*dbc.executeStatement("SELECT hours_per_day FROM myschooldb.workers"+"\n"+"where id=3;")*5)+"'),"
						             		 +"('"+(dbc.executeStatement("SELECT salary_per_hour FROM myschooldb.workers"+"\n"+"where id=4;")*dbc.executeStatement("SELECT hours_per_day FROM myschooldb.workers"+"\n"+"where id=4;")*5)+"'),"
						             		 +"('"+(dbc.executeStatement("SELECT salary_per_hour FROM myschooldb.workers"+"\n"+"where id=5;")*dbc.executeStatement("SELECT hours_per_day FROM myschooldb.workers"+"\n"+"where id=5;")*5)+"'),");
						                    +*/
				
				
				
				//Test Database (myschooldb) SUBMENU
				String str2="What do you want to do:"
			            +"\n"+"1. Create a new entry (student,worker)"
				        +"\n"+"2. Search for an entry (student,worker)"
			            +"\n"+"3. Update an entry (student,worker)"
			            +"\n"+"4. Delete an entry (student,worker)"
				        +"Type in a number from the above:";
				
				System.out.println(str2);
				String userTestdbMenuChoice=sc.next();
				while(!userTestdbMenuChoice.equals("1")&&!userTestdbMenuChoice.equals("2")
					  &&!userTestdbMenuChoice.equals("3")&&!userTestdbMenuChoice.equals("4")) {
					System.out.println("Invalid input"+"\n"+str2);
					userTestdbMenuChoice=sc.next();
					}
				
				if(userTestdbMenuChoice.equals("1")) {
					String str3="What type of entry do you want to Create:"
							+"\n"+"1. Student"
					        +"\n"+"2. Worker"
							+"\n"+"Type in a number from the above:";
					System.out.println(str3);
					String userCreateType=sc.next();
					while(!userCreateType.equals("1")&&!userCreateType.equals("2"));
					System.out.println("Invalid input"+"\n"+str3);
					userCreateType=sc.next();
					
					if(userCreateType.equals("1")) {
						System.out.println("Please type in the Student's First Name: ");
						String stdFName=sc.next();
						
						dbc.executeStatement("INSERT INTO `myschooldb`.`students`");
						}
					
					
					
				
			
					
					
					
				}
				
				
				System.out.print("Do you want to continue the changes in the test Database (y/n): ");
				answer=sc.next();
				System.out.print("\n");
				
				}
				
			}while(!answer.equals("n"));
			
		
		//2. Create an empty DataBase (like above without entries and a name of your choosing)
		if(usrChoice.equals("2")) {
			
			//Creating a new Database
			System.out.print("Give me a name for the empty database: ");
			String dbName=sc.next();
			dbc.executeStatement("CREATE SCHEMA `"+dbName+"`;");
			
			//Creating an empty table 'student' in the new Database
			dbc.executeStatement("CREATE TABLE `myschooldb`.`student` (\r\n" + 
				"  `id` INT NOT NULL AUTO_INCREMENT,\r\n" + 
				"  `first_name` VARCHAR(50) NULL,\r\n" + 
				"  `last_name` VARCHAR(50) NULL,\r\n" + 
				"  `faculty_number` INT NULL,\r\n" + 
				"  PRIMARY KEY (`id`));");
			
			//Creating an empty table 'worker' in the new Database
			dbc.executeStatement("CREATE TABLE `myschooldb`.`worker` (\r\n" + 
				"  `id` INT NOT NULL AUTO_INCREMENT,\r\n" + 
				"  `first_name` VARCHAR(50) NULL,\r\n" + 
				"  `last_name` VARCHAR(50) NULL,\r\n" + 
				"  `salary_per_hour` DECIMAL(7,2) NULL,\r\n" + 
				"  `hours_per_day` INT NULL,\r\n" + 
				"  `weekly_salary` DECIMAL(7,2) NULL,\r\n" + 
				"  PRIMARY KEY (`id`));");
			}
		

			
		
		

		
		sc.close();
		

	}

}
