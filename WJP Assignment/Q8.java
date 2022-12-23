package assignmentno1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Q8 
{
	
	
	public static void main(String[] args) 
	{	
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSl=false","root","Akshay@16");
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("SELECT AVG(marks) AS AverageMarks FROM student");			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				
			}
			
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
