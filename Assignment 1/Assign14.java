import java.util.Scanner;
class Assign14
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		do
		{
			System.out.println("Enter the Number 1");
			a=sc.nextInt();
			System.out.println("Enter the Number 2");
			b=sc.nextInt();
			int temp=1;
			for(int i=1;i<=a&&i<=b;i++)
			{
				if(a%i==0 && b%i==0)
					temp=i;
			}
			System.out.println("The GCD of "+a+" and "+b+" is = "+temp);
		}while(a!=0);
	}
}