package assignmentno1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q6
{
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSl=false","root","Akshay@16");
			Statement s=con.createStatement();
			int choice=0;
			do
			{
				System.out.println("Enter Your Choice\n0.)EXIT\n1.)INSERT\n2.)SHOW TABLE\n3.)UPDATE\n4.)DELETE");
				choice=sc.nextInt();
				switch(choice)
				{
					case 0:
						System.out.println("You chose to exit");
					break;
					case 1:
						insert(s);
					break;
					case 2:
						select(s);
					break;
					case 3:
						update(s);
					break;
					case 4:
						delete(s);
					break;
				}
			}while(choice!=0);	
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	static void insert(Statement s)
	{
		System.out.println("Enter the Roll No");
		int rno=sc.nextInt();
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the Marks");
		float mark=sc.nextFloat();
		System.out.println("Enter the DOB YYYY-MM-DD");
		String dob=sc.next();
		int i=0;
		try {
			i = s.executeUpdate("INSERT INTO student VALUES("+rno+",'"+name+"',"+mark+",'"+dob+"')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(i+" Rows Affected");
		
	}
	
	
	static void update(Statement s)
	{
		System.out.println("Enter the Roll No");
		int rno=sc.nextInt();
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the Marks");
		float mark=sc.nextFloat();
		System.out.println("Enter the DOB YYYY-MM-DD");
		String dob=sc.next();
		int i=0;
		try 
		{
			i = s.executeUpdate("UPDATE student SET name='"+name+"',marks="+mark+",dob='"+dob+"' WHERE rno="+rno);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(i+" Rows Affected");
		
	}
	
	static void select(Statement s)
	{
		ResultSet rs;
		try
		{
			rs = s.executeQuery("SELECT * FROM student ORDER BY marks desc");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
				
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	static void delete(Statement s)
	{
		System.out.println("Enter the Roll No");
		int rno=sc.nextInt();
		try 
		{
			int i=s.executeUpdate("DELETE FROM student WHERE rno="+rno);
			System.out.println(i+" Rows Affected");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


