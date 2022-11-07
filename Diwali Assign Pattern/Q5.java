package src;
import java.util.Scanner;
class Q5
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the value for pattern");
		//int n=sc.nextInt();
		System.out.println("-----------------------------------");
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<4;i++)
		{
			for(int j=i;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j
		}
	}
}