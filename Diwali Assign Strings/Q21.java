package src;
import java.util.Scanner;
import java.util.Arrays;
class Q21
{
	static void remove(String str, char c)
	{
		char ch[]=new char[str.length()];
		int index=0;
		
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != c)
				ch[index++]=str.charAt(i);
		}
		
		String str2=String.valueOf(ch);
		
		System.out.println("Input String : "+str);
		
		System.out.println("Output String : "+str2);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.println("Enter the Character");
		char c =sc.next().charAt(0);
		remove(str,c);
		
	}
}