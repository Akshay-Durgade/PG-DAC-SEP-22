package src;
import java.util.Scanner;
class Q8
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in).useDelimiter("\n");
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch == str.charAt(i))
				count++;
		}
		System.out.println("Occurence of \'"+ch+"\' is "+count+" times");
		
			
	}
}