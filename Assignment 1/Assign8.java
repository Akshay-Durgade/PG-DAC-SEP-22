import java.util.Scanner;
class Assign8
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to print its digit");
		a=sc.nextInt();
		int b=a; int digit, count=0;
		while(a>0)
		{
			a=a/10;
			count++;
		}
		while(b>0)
		{
			digit=b%10;
			System.out.println("Digit at position"+count+" is = "+digit);
			count--;
			b=b/10;
		}	
	}
}