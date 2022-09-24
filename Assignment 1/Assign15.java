import java.util.Scanner;
class Assign15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,temp=1;
		do
		{
			System.out.println("Enter the Number 1");
			a=sc.nextInt();
			System.out.println("Enter the Number 2");
			b=sc.nextInt();
			
			for(int i=2;i<=a&&i<=b;i++)
			{
				while(a%2!=0 && b%2!=0)
				{
					temp=temp*i;
				}
			}
			System.out.println("The LCM of "+a+" and "+b+" is ="+temp);
		}while(a!=0);
		
	}
}