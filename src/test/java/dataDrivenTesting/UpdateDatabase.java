package dataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDatabase {

	public static void main(String[] args) throws SQLException {
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
		  Statement statement = connection.createStatement();
		  int result = statement.executeUpdate("insert into employee(ID,Name,phone,Salary) values('503','kgf','8978687676','68000')");
		  System.out.println(result);
		  connection.close();

	}

}
