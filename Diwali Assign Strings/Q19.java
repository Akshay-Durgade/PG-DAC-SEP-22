package src;
import java.util.Scanner;
import java.util.Arrays;
class Q19
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String 1");
		String str=sc.nextLine();
		
		int temp=0;
		for(int i=65;i<=122;i++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j) == i)zz
					count++;
			}
			if(count>temp)
				temp=count;
		}
		
	}
}
	