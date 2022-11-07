package src;
import java.util.Scanner;
class Q2
{
	static void dupChar(String str)
	{
		System.out.println("Repeated characters are");
		for(int i=0;i<256;i++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				
				if(str.charAt(j) == i)
					count++;
			}
			if(count>1)
				System.out.print((char)(i)+",");
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in).useDelimiter("\n");
		System.out.println("Enter the String");
		String str=sc.next();
		dupChar(str);
			
	}
}