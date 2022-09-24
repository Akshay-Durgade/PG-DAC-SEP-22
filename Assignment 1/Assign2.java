import java.util.Scanner;
class Assign2
{
	public static void main(String[] args)
	{
		int a;
		do
		{
			int fact=1;
			System.out.println("Enter the number to find factorial");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			for(int i=1;i<=a;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of "+a+" is ="+fact);
		}while(a!=0);
	}
}