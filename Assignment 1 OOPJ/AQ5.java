import java.util.Scanner;
class Student
{
	private String name;			//using access modifiers to increase security achieving abstraction and encapsulation
	private int marks1;
	private int marks2;
	private int marks3;
	private int tmarks;
	Scanner sc1=new Scanner(System.in);
	Student()
	{
		//default zero argument or user defined parameterless constructor. It will be invoked even if we do not declare it here
		this.name="DEFAULT";
		this.marks1=0;
		this.marks2=0;
		this.marks3=0;
		this.tmarks=0;
	}
	void setDetails()	//method to accept details from the user
	{
		System.out.println("-----------------------------------------------");
		System.out.println("Enter the name");
		this.name=sc1.next();
		System.out.println("Enter the Marks");
		this.marks1=sc1.nextInt();
		System.out.println("Enter the Marks");
		this.marks2=sc1.nextInt();
		System.out.println("Enter the Marks");
		this.marks3=sc1.nextInt();
		System.out.println("-----------------------------------------------");
	}
	void printDetails()		//method to display or print details 
	{
		System.out.println("-----------------------------------------------");
		System.out.println("Name= "+this.name+"\nMarks 1 = "+this.marks1+"\nMarks 2 = "+this.marks2+"\nMarks 3 = "+this.marks3);
		System.out.println("-----------------------------------------------");
	}
	void totalMarks()
	{
		tmarks=this.marks1+this.marks2+this.marks3;
		System.out.println(this.name+"\'s marks are = "+tmarks);
	}
	double calculateAverage()	//method to calculate average
	{
		return (this.marks1+this.marks2+this.marks3)/3;
	}
	String getName()
	{
		return this.name;
	}
	double getMarks1()
	{
		return this.marks1;
	}
	double getMarks2()
	{
		return this.marks2;
	}
	double getMarks3()
	{
		return this.marks3;
	}
}
class AQ5
{
	public static void main(String args[])
	{
		Student obj=new Student();
		Scanner sc=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Enter what you want to do\n0.)Exit\n1.)Enter Details\n2.)Print Details\n3.)Total Marks\n4.)Calculate Average");
			choice = sc.nextInt();
			switch(choice)
			{
				case 0:
					System.out.println("Program Terminated :)");
				break;
				case 1:
					obj.setDetails();
				break;
				case 2:
					obj.printDetails();
				break;
				case 3:
					System.out.println("-----------------------------------------------");
					obj.totalMarks();
					System.out.println("-----------------------------------------------");
					break;
				case 4:
					System.out.println("-----------------------------------------------");
					double average=obj.calculateAverage();
					System.out.println(obj.getName()+"\'s average marks are = "+average);
					System.out.println("-----------------------------------------------");
				break;
			}
		}while(choice!=0);
		sc.close();
		
	}
}