import java.util.Scanner;
class Assign19
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		do
		{
			System.out.println("\nEnter the number upto which u want the series");
			a=sc.nextInt();
			if(a!=0)
			{
				System.out.println("Series is ");
				for(int i=2;i<=a;i+=2)
				{
					System.out.print(i+", ");
				}
			}
			else
				System.out.println("\nProgram Exit \nTata Ciao \n;)");
		}while(a!=0);
	}
}