import java.util.Scanner;
class Assign6
{
	public static void main(String args[])
	{
		int a;
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to check Leap Year \n Enter the Year");
			a=sc.nextInt();
			if(a%4==0)
			{
				if(a%100!=0)
					System.out.println("Leap Year");
				else if(a%100==0 && a%400==0)
					System.out.println("Leap Year");
				else
				{
						System.out.println("Non Leap Year");
				}
				
			}
			else
			{
					System.out.println("Non Leap Year");
			}
		}while(a!=0);
	}
}