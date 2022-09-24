import java.util.Scanner;
class Assign4{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number 1");
		int a=sc.nextInt();
		System.out.println("Enter the Number 2");
		int b=sc.nextInt();
		System.out.println("Before Swap First Number is "+a+" and Second Number is ="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping First Number is"+a+"and Secong Number is ="+b);
	}
}