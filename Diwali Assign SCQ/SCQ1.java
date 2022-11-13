package src;
import java.util.Scanner;
class SCQ1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String 1");
		String s1=sc.nextLine();
		boolean t=isPallindrome(s1);
		System.out.println(t);
		sc.close();
	}
	static boolean isPallindrome(String s1)
	{
		s1=s1.replaceAll("[^A-Za-z0-9]","");
		System.out.println(s1);
		for(int i=0,j=s1.length()-1;i<s1.length() && j>=0;i++,j--)
		{
			if(Character.toLowerCase(s1.charAt(i))!=Character.toLowerCase(s1.charAt(j)))
				return false;
		}
		return true;
	}
}