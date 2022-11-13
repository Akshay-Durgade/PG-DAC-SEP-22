package src;
import java.util.Scanner;
class SCQ2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean t=capitalization(str);
		System.out.println(t);
	}
	
	static boolean capitalization(String str)
	{
		if(str.toUpperCase()==str || str.toLowerCase()==str)
			return true;
		else
		{
			for(int i=1;i<str.length();i++)
			{
				char sym=str.charAt(i);
				if(Character.isUpperCase(sym))
					return false;
			}
		}
		return true;
	}
}