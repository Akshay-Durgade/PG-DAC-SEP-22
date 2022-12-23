package assignmentno1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q12
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false","root","Akshay@16");
	
			Statement s=con.createStatement();
//			boolean flag=s.execute("CREATE TABLE emp (empid INT PRIMARY KEY, name VARCHAR(30), sal FLOAT, doj DATE)");
//			System.out.println(flag);
//			boolean flag=s.execute("CREATE TABLE emp1 (addr VARCHAR(30),city VARCHAR(15),country VARCHAR(15),id INT not null,FOREIGN KEY (id) REFERENCES emp(empid))");
//			System.out.println(flag);
			

			System.out.println("Enter the empid");
			int id=sc.nextInt();
			System.out.println("Enter the Name");
			String name=sc.next();
			System.out.println("Enter the Salary");
			float sal=sc.nextFloat();
			System.out.println("Enter the Date of Joining YYYY-MM-DD");
			String doj=sc.next();
			int i=s.executeUpdate("INSERT INTO emp VALUES("+id+",'"+name+"',"+sal+",'"+doj+"')");
			System.out.println(i+" Rows Affected");
			
			System.out.println("Enter the Address");
			String addr=sc.next();
			System.out.println("Enter the City");
			String city=sc.next();
			System.out.println("Enter the Country");
			String country=sc.next();
			i=s.executeUpdate("INSERT INTO emp1 VALUES('"+addr+"','"+city+"','"+country+"',"+id+")");
			System.out.println(i+" Rows Affected");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Done");
		sc.close();
	}

}


