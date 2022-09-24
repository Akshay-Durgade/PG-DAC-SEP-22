import java.util.Scanner;
class Assign9
{
	public static void main(String args[])
	{
		int a;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number to find Factors");
			a=sc.nextInt();
			System.out.println("Factors of "+a+" = ");
			if(a>0)
			{
				for(int i=1;i<=a;i++)
				{
					if(a%i==0)
					{
						System.out.print(i+", ");
					}
				}
			}
			else
				System.out.println("Program Exited Tata Byeeee!!!! :)");
			System.out.println();
		}while(a!=0);
	}