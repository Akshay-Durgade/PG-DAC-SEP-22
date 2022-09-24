import java.util.Scanner;
class Assign20
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
				for(int i=1;i<=a;i+=2)
				{
					System.out.print(i+", ");
				}
			}
			else
				System.out.println("\nProgram Exit \nTata Annyeong... \n;)");
		}while(a!=0);
	}
}