package assignmentno1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class Q5 
{
	
	
	public static void main(String[] args) 
	{	
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSl=false","root","Akshay@16");
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("SELECT COUNT(rno) FROM student");		
			System.out.println("No. of Rows in student table : "+rs+"\n\n");
			s.close();
			con.close();
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Done");


	}

}
