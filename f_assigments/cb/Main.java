package cb;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String url="jdbc:mysql://localhost:3306";
        Database db=new Database();
        db.connect(url,"root","yF1q37$f98&!");
       //db.executeStatement("CREATE DATABASE humanity2;");
      /* db.executeStatement("CREATE TABLE `humanity2`.`teachertest` (\r\n" + 
               "  `id` INT NOT NULL AUTO_INCREMENT,\r\n" + 
               "  `firstName` VARCHAR(45) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NULL,\r\n" + 
               "  `lastName` VARCHAR(45) NULL,\r\n" + 
               "  `facultyNumber` VARCHAR(45) NULL,\r\n" + 
               "  PRIMARY KEY (`id`));\r\n" + 
               "");*/
        //db.executeStatement("INSERT INTO `humanity2`.`teachertest` (`firstName`, `lastName`, `facultyNumber`) VALUES ('Kostas', 'Pakiroglou', '5');");
        db.executeStatement("INSERT INTO `humanity2`.`teachertest` (`firstName`, `lastName`, `facultyNumber`) VALUES ('Kostas', 'Pakiroglou', '5'),('Nikos', 'Kourmpanis', '6');\r\n" + 
                "");
        //db.executeStatement.("DELETE FROM `humanity2`.`teachertest` WHERE ID IN ('8','9');");
    }
 
}


