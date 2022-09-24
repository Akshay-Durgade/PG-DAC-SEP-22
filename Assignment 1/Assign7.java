import java.util.Scanner;
class Assign7
{
	static int Print(int num)
	{
		if(num!=1)
		{
			int a=Print(num-1);
			System.out.println(a);
		}
		return num;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		do 
		{
			System.out.print("Enter the Number upto which you want to print");
			a=sc.nextInt();
			int b= Print(a);
			System.out.println(b);
		}while(a!=0);
	}
}