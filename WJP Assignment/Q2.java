package assignmentno1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.SQLException;
public class Q2 
{
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Roll No");
		int rno=sc.nextInt();
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the Marks");
		float mark=sc.nextFloat();
		System.out.println("Enter the DOB YYYY-MM-DD");
		String dob=sc.next();
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSl=false","root","Akshay@16");
			Statement s=con.createStatement();
			int i=s.executeUpdate("INSERT INTO student VALUES("+rno+",'"+name+"',"+mark+",'"+dob+"')");
			System.out.println(i+" Rows Affected");
			s.close();
			con.close();
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Done");
		sc.close();

	}

}
