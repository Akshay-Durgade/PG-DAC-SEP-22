import java.util.Scanner;
class Assign5{
	public static void main(String args[])
	{
		int a;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		a= sc.nextInt();
		if(a>0)
			System.out.println("Number is positive");
		else if(a<0)
			System.out.println("Numbber is negative");
		else
			System.out.println("Number is neither Negative nor Positive \n Tata Byeee Byeee Program Exited");
		}while(a!=0);
	}
}