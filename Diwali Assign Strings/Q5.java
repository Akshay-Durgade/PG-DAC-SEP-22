package src;
import java.util.Scanner;
class Q5
{
	static boolean checkDigit(String str)
	{
		for(int i=0;i<str.length()-1;i++)
		{
			if(!Character.isDigit(str.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in).useDelimiter("\n");
		System.out.println("Enter the String");
		String str=sc.next();
		if(checkDigit(str) == false)
		{
			System.out.println("String contains a non number");
		}
		else 
			System.out.println("String is correct");
		
		
		
	}
	
}