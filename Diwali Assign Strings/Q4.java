package src;
import java.util.Scanner;
class Q4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in).useDelimiter("\n");
		System.out.println("Enter the String");
		String str=sc.next();
		
		for(int i=0;i<str.length()-1;i++)
		{
			int count=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i) ==  str.charAt(j))
					count++;
			}
			if(count == 1)
			{
				System.out.println("First Non Repeating Character is : "+str.charAt(i));
				break;
			}
		}
	}
}