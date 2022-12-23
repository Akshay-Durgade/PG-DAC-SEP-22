package assignmentno1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Q4 
{
	
	
	public static void main(String[] args) 
	{	
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSl=false","root","Akshay@16");
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("SELECT * FROM student");
			System.out.println("+-------+-------+-------+-----------+");
			while(rs.next())
			{
				System.out.println("|  "+rs.getInt(1)+"\t|  "+rs.getString(2)+"\t|  "+rs.getFloat(3)+"\t|"+rs.getString(4)+" |");
				System.out.println("+-------+-------+-------+-----------+");
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
