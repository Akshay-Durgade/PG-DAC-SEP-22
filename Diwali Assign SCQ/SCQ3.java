package src;
import java.util.Scanner;
class SCQ3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int countlr=0;
		int countud=0;
		for(int i=0;i<str.length();i++)
		{
			char sym=str.charAt(i);
			
			if(Character.toUpperCase(sym)=='R')
				countlr++;
			if(Character.toUpperCase(sym)=='L')
				countlr--;
			if(Character.toUpperCase(sym)=='U')
				countud++;
			if(Character.toUpperCase(sym)=='D')
				countud--;
		}
		
		if(countlr==0 && countud==0)
			System.out.println("true");
		else 
			System.out.println("false");
		
	}
}