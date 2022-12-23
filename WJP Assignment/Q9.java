package assignmentno1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q8
{
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?useSSl=false","root","Akshay@16");
			
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
						insert(con);
					break;
					case 2:
						select(con);
					break;
					case 3:
						update(con);
					break;
					case 4:
						delete(con);
					break;
				}
			}while(choice!=0);	
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	static void insert(Connection con)
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
			PreparedStatement s=con.prepareStatement("INSERT INTO student VALUES("+rno+",'"+name+"',"+mark+",'"+dob+"')");
			i = s.executeUpdate();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		System.out.println(i+" Rows Affected");
		
	}
	
	
	static void update(Connection con)
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
			PreparedStatement s=con.prepareStatement("UPDATE student SET name='"+name+"',marks="+mark+",dob='"+dob+"' WHERE rno="+rno);
			i = s.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(i+" Rows Affected");
		
	}
	
	static void select(Connection con)
	{
		ResultSet rs;
		try
		{
			PreparedStatement s=con.prepareStatement("SELECT * FROM student");
			rs = s.executeQuery();
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
	
	static void delete(Connection con)
	{
		System.out.println("Enter the Roll No");
		int rno=sc.nextInt();
		try 
		{
			PreparedStatement s=con.prepareStatement("DELETE FROM student WHERE rno="+rno);
			int i=s.executeUpdate();
			System.out.println(i+" Rows Affected");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


