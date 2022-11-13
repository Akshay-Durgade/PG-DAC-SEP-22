package src;
import java.util.Scanner;
class package src;
import java.util.Scanner;
class Q8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		StringBuffer str=new StringBuffer(sc.next());
		System.out.println("Enter the position to delete");
		int n=sc.nextInt();
		boolean t=pallindrome(str,n);
		System.out.println(t);
	}
	
	static boolean pallindrome(StringBuffer str,int n)
	{
		str=str.replace(n,n+1,""); 
		for(int i=0,j=str.length()-1;i<str.length() && j>=0;i++,j--)
		{
				if(str.charAt(i)!=str.charAt(j))
					return false;
		}
		return true;
	}
}