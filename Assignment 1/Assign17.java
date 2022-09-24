import java.util.Scanner;
class Assign17
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a;
		do
			{
			System.out.println("Enter the Number");
			a=sc.nextInt();
			int b=a;int rev=0;
			while(b>0)
			{
				int temp=b%10;
				rev=rev*10+temp;
				b=b/10;
			}
			if(a==rev)
			{
				System.out.println("It is a Pallindrome Number");
			}
			else
			{
				System.out.println("It is Not a Pallindrome Number");
			}
		}while(a!=0);
	}
}