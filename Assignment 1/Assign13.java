import java.util.Scanner;
class Assign13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to reverse");
		int a=sc.nextInt();
		int b=a, rev=0;
		System.out.println("Before Reverse Number is ="+a); 
		while(a>0)
		{
			b=a%10;
			rev=rev*10+b;
			a=a/10;
		}
		System.out.println("Reversed Number is = "+rev);
	}
}