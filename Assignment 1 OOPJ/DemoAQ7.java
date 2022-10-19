import java.util.Scanner;
class MathOperation //<T>
{
	//static int a;
	//static int b;
	static int add(int a,int b)
	{
		return a+b;
	}
	static int subtract(int a,int b)
	{
		return a-b;
	}
	static int multiply(int a,int b)
	{
		return a*b;
	}
	static int power(int a,int b)
	{
		int mul=1;
		if(b==0)
			return 1;
		for(int i=1;i<=b;i++)
		{
			mul=mul*a;
		}
		return mul;
	}
}
class DemoAQ7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1");
		int num1=sc.nextInt();
		System.out.println("Enter Number 2");
		int num2=sc.nextInt();
		int a=MathOperation.add(num1,num2);
		System.out.println("Addition = "+a);
		a=MathOperation.subtract(num1,num2);
		System.out.println("Subtraction = "+a);
		a=MathOperation.multiply(num1,num2);
		System.out.println("Multiplication = "+a);
		a=MathOperation.power(num1,num2);
		System.out.println("Power = "+a);
	}
}


/*
import java.util.Scanner;
class MathOperation <T>
{
	static T a;
	static T b;
	static ? add(int a,int b)
	{
		return a+b;
	}
	static int subtract(int a,int b)
	{
		return a-b;
	}
	static int multiply(int a,int b)
	{
		return a*b;
	}
	static int power(int a,int b)
	{
		return (int)Math.pow(a,b);
	}
}
class DemoAQ7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1");
		int num1=sc.nextInt();
		System.out.println("Enter Number 2");
		int num2=sc.nextInt();
		int a=MathOperation.add(num1,num2);
		System.out.println("Addition = "+a);
		a=MathOperation.subtract(num1,num2);
		System.out.println("Subtraction = "+a);
		a=MathOperation.multiply(num1,num2);
		System.out.println("Multiplication = "+a);
		a=MathOperation.power(num1,num2);
		System.out.println("Power = "+a);
	}
}*/