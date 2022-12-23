package assignmentno1;


//Create a program to create table named student having columns [ rno, name, marks, date of birth].
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class Q1 {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false","root","Akshay@16");
			Statement s=con.createStatement();
			boolean flag=s.execute("CREATE TABLE student ( rno INT, name VARCHAR(30),marks FLOAT(10,2),dob DATE)");
			System.out.println(flag);
			s.close();
			con.close();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
