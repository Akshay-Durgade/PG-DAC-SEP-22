package assignmentno1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Q14
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID ");
		int id=sc.nextInt();
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSL=false","root","Akshay@16");
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("SELECT addr FROM emp1 WHERE id="+id);
			while(rs.next())
			{
				System.out.println(id+"\t"+rs.getString(1));
			}
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
