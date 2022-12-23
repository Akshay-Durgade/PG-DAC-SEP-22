package assignmentno1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Q16
{
	public static void main(String args[])
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false","root","Akshay@16");
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("SELECT MAX(sal) FROM emp");
			while(rs.next())
			{
				System.out.println("HIGHEST SALARY : \t"+rs.getInt(1)+" INR");
			}
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			
			e.printStackTrace();
		}
		
		System.out.println("Done");
	}
	
}

/*
		delimiter //
		create procedure abc1(rno_ INT, name_ VARCHAR(30), marks_ FLOAT(10,2))
		begin
			INSERT INTO student (rno,name,marks) VALUES(rno_,name_,marks_); 
		end; //
		delimiter ;
 * */
