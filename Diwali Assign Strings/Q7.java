package src;
import java.util.Scanner;
class Q7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entet the String");
		String str=sc.next();
		for(int i=65;i<123;i++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if((char)i== str.charAt(j))
					count++;
			}
			if(count>1)
				System.out.println((char)(i)+" : "+count);
		}
	}
}