import java.util.Scanner;
class Assign3{
	static int Factorial(int num)
	{
		int fact=1;
		if(num!=0)
		{
		fact=num*Factorial(num-1);
		return fact;
		}
		else
			return fact;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to find Factorial");
		int a= sc.nextInt();
		int b= Factorial(a);
		System.out.println("Factorial of "+a+"is = "+b);
		
	}
}