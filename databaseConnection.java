package stddatabase;

import java.sql.*;
import javax.sql.*;

public class databaseConnection {
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "Kano@8182";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/stud";
	static Connection cn;
	std s1= new std();

	public static Connection getConnection() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			System.out.println(cn);
		} 
		catch(ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cn;
	}
}