package src;
import java.util.Scanner
class SCQ10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the jewels");
		String jewels=sc.next();
		System.out.println("Enter the stones");
		String stones=sc.next();
		int n=checkJewels(jewels,stones);
		System.out.println(n);
	}
	static int checkJewels(String jewels, String stones)
	{
		int count=0;
		for(int i=0;i<jewels.length();i++)
		{
			for(int j=0;j<stones.length();j++)
			{
				if(jewels.charAt(i)==stones.charAt(j))
				{
					count++;
				}
			}
		}
			
		return count;
	}
}