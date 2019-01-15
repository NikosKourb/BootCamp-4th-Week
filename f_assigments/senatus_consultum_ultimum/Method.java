package senatus_consultum_ultimum;

import java.util.Scanner;

public class Method {

	public Method() {}
	
	public void CreateEmptyDB(LogIn login1,String DBName) {
		
		//Creating an empty Database with a name chosen by the user
		login1.executeStatement("CREATE SCHEMA `"+DBName+"`;");
		
		//Creating an empty table 'students' in the empty Database
		login1.executeStatement("CREATE TABLE `"+DBName+"`.`students` (\r\n" + 
		"  `id` INT NOT NULL AUTO_INCREMENT,\r\n" + 
		"  `first_name` VARCHAR(50) NOT NULL,\r\n" + 
		"  `last_name` VARCHAR(50) NOT NULL,\r\n" + 
		"  `faculty_number` VARCHAR(50) NULL,\r\n" + 
		"  PRIMARY KEY (`id`));");
		
		//Creating an empty table 'workers' in the empty Database
		login1.executeStatement("CREATE TABLE `"+DBName+"`.`workers` (\r\n" + 
		"  `id` INT NOT NULL AUTO_INCREMENT,\r\n" + 
		"  `first_name` VARCHAR(50) NOT NULL,\r\n" + 
		"  `last_name` VARCHAR(50) NOT NULL,\r\n" + 
		"  `salary_per_hour` DECIMAL(7,2) NULL,\r\n" + 
		"  `hours_per_day` INT NULL,\r\n" + 
		"  `weekly_salary` DECIMAL(7,2) NULL,\r\n" + 
		"  PRIMARY KEY (`id`));");
		
		System.out.print("\n"+"Database "+DBName+" was succesfully created");
	}
	
	public void PopulateEmptyDB(LogIn login1,String DBName) {
		
		//Populating the 'students' table with 10 students
		login1.executeStatement("INSERT INTO `"+DBName+"`.`students` "+"\n"
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
		
		//Populating the 'workers' table with 5 workers
		login1.executeStatement("INSERT INTO `"+DBName+"`.`workers` "+"\n"
		                       +"(`first_name`, `last_name`, `salary_per_hour`, `hours_per_day`, `weekly_salary`) "+"\n"
				               +"VALUES ('Gandalf', 'Mithrandir', '15.50', '7', '542.50'),"
				               +"('Saruman', 'Curunir', '16.20', '8','567.00'),"
				               +"('Radagast', 'BirdFriend', '13.45', '5', '336.25'),"
				               +"('Denethor', 'Ecthelionson', '10.58', '4', '211.60'),"
				               +"('Theoden', 'Thengelson', '10.23', '4', '204.60');");
		
		System.out.print("\n"+"Database "+DBName+" was succesfully populated"+"\n"
		                     +"with 10 students and 5 workers");
	}

}
