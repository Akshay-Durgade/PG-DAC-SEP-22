package src;
import java.util.Scanner;
class SCQ5
 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Binary Number 1");
		String s1=sc.next();
	    System.out.println("Enter the Binary Number 2");
		String s2=sc.next();
		int num=decimalToBinary(Integer.parseInt(s1))+decimalToBinary(Integer.parseInt(s2));
		System.out.println(toBinary(num));
		sc.close();
	}
	static int decimalToBinary(int binary)
	{
		int decimal=0;
		int n=0;
		while(true)
		{
			if(binary==0)
			{
				break;
			}
			else
			{
				int temp=binary%10;
				decimal=decimal+temp*(int)Math.pow(2, n);
				binary=binary/10;
				n++;
			}
		}
		
		return decimal;
	}
	
	static String toBinary(int n)
	{
		String s="";
		int binary[]=new int[32];
		int i=0;
		while(n>0)
		{
			int temp=n%2;
			binary[i++]=temp;
			n=n/2;
		}
		for(int j=i-1;j>=0;j--)
			s=s+binary[j];
		return s;
	}
}