package src;
import java.util.Scanner;
import java.util.Arrays;
class Q23
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str[]=new String[2];
		for(int i=0;i<str.length;i++)
		{
			System.out.println("Enter the String");
			str[i]=sc.nextLine();
		}
		System.out.println("Input : "+Arrays.toString(str));
		
		String temp[]=new String[1];
		temp[0]="AK";
		
		for(int i=0;i<str.length-1;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				//StringBuffer temp=new StringBuffer("");
				System.out.println(str[i].length());
				System.out.println(str[j].length());
				if(str[i].length() > str[j].length())
					temp[0]=str[i];
					System.out.println(temp[0]);
					str[i]=str[j];
					System.out.println(str[i]);
					str[j]=temp[0];
					System.out.println(str[j]);
			}
			System.out.println("-----------------");
		}
		
		System.out.println(Arrays.toString(str));
		
	}
}