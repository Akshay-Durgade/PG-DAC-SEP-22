package assignmentno1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Q11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Roll No");
		int rno=sc.nextInt();
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the Marks");
		float mark=sc.nextFloat();
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false","root","Akshay@16");
			CallableStatement s=con.prepareCall("{ call abc1(?,?,?) }");
			s.setInt(1, rno);
			s.setString(2,name);
			s.setFloat(3,mark);
			boolean i=s.execute();
			System.out.println(i);
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			
			e.printStackTrace();
		}
		
		System.out.println("Done");
		sc.close();
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
