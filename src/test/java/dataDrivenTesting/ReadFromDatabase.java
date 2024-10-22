package dataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadFromDatabase {

	public static void main(String[] args) throws SQLException {
	  Driver dbDriver = new Driver();
	  DriverManager.registerDriver(dbDriver);
	  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv", "root", "root");
	  Statement statement = connection.createStatement();
	  ResultSet  result = statement.executeQuery("select * from employee;");
	  while(result.next()) {
		  System.out.println(result.getInt("ID") + "\t" + result.getString("Name") + "\t" + result.getString("phone") + "\t" + result.getInt("Salary"));
		  
	  }
	  
	  connection.close();
	  

	}

}
