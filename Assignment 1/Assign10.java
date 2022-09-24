import java.util.Scanner;
class Assign10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num, sum=0,temp=1;
		System.out.println("Enter the number");
		num=sc.nextInt();
		int b=num;
		while(b>0)
		{
			temp=b%10;
			sum=sum+temp;
			b=b/10;
		};
		System.out.println("Sum of "+num+" is = "+sum);
	}
}