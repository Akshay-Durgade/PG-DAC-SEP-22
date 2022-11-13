Special 15:
package src;
import java.util.*;
class SCQ15 
{
 
     public static int findTheLongestSubstring(String s) 
	 {
        int res = 0 , mask = 0, n = s.length();
        HashMap<Integer, Integer> seen = new HashMap<>();
        seen.put(0, -1);
        for (int i = 0; i < n; ++i) 
		{
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{ 
                int c=s.charAt(i);
                mask=mask ^ c;
                seen.putIfAbsent(mask, i);
            }            
            res = Math.max(res, i - seen.get(mask));
        }
        return res;
    }

	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		
		System.out.println(findTheLongestSubstring(str));
	}
}