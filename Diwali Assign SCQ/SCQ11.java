package src;
import java.util.Scanner;
public class practice
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String 1");
		String s1=sc.next();
		System.out.println("Enter the String 2");
		String s2=sc.next();
		String str=merge(s1,s2);
		System.out.println(str);
	}
	
	static String merge(String s1, String s2)
	{
		String str="";
		int i=0;
		int j=0;
		int i1=0;
		int j1=0;
		while(i<s1.length() || j<s2.length())
		{
			while(i1<=i)
			{
				str=str+s1.charAt(i);
            i1++;
				
			}
			while(j1<=j)
			{
				str=str+s2.charAt(j);
				j1++;
			}
         i++;
         j++;
		}
		return str;
	}

}