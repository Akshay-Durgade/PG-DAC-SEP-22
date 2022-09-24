import java.util.Scanner;
class Assign18
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		do
		{
			System.out.println("\nEnter the number to print it's Prime Factor");
			a=sc.nextInt();
			if(a!=0)
			{
				System.out.println("The Prime Factors of "+a+" are ");
				for(int i=2;i<a;i++)
				{
					if(a%i==0)
					{
						int flag=0;
						for(int j=2;j<i;j++)
						{
							if(i%j==0)
							{
								flag=1;
							}
						}
						if(flag==0)
							System.out.print(i+", ");
					}
				}
			}
			else
				System.out.println("\n\nProgram Exited \n Tata BuByeee \n ;)"); 
		}while(a!=0);
	}
}