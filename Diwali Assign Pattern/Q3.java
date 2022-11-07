package src;
import java.util.Scanner;
class Q3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for pattern");
		int n=sc.nextInt();
		int c=1;
		System.out.println("-----------------------------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((c++)+" ");
			}
			System.out.println();
		}
	}
}