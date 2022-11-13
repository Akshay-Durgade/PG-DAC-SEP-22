package src;
import java.util.Scanner;
import java.util.Stack;
class SCQ13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String 1");
		String s1=sc.nextLine();
		decode(s1);
		sc.close();
	}
	static String decode(String s1)
	{
		String str="";
		Stack<Integer> i=new Stack<Integer>();
		Stack<Character> c=new Stack<Character>();
		for(int j=0;j<s1.length();j++)
		{
			char sym=s1.charAt(j);
			
			if(Character.isDigit(sym))
				i.push((int)sym-48);
			else
			{
				if(sym==']')
				{
					while(!c.isEmpty() && c.peek() != '[')
					{
						str=str+c.pop();
					}
					int n=i.pop();
					for(int k=0;k<n;k++)
						System.out.print(str);
				}
				else
					c.push(sym);
			}
			str="";
		}
		return str;
	}
}