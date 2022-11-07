package src;
import java.util.Scanner;
import java.util.Arrays;
class Q3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in).useDelimiter("\n");
		System.out.println("Enter the first word");
		String str1=sc.next();
		System.out.println("Enter the second word to check for anagram");
		String str2=sc.next(); 
		
		char arr1[]=new char[str1.length()];
		char arr2[]=new char[str2.length()];
		
		arr1=str1.toCharArray();
		arr2=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean t = Arrays.equals(arr1, arr2);
		
		if(t)
			System.out.println("Strings are anagram");
		else
			System.out.println("Strings are not anagram");
		
		
		
	}
}