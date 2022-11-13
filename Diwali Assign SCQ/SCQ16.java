package src;
import java.util.*;
class SCQ16 
{
    public static int longestStrChain(String[] words) 
	{
        
	    if(words == null || words.length == 0) 
		{
            return 0;
        }
	
        int res = 0;
	
        Arrays.sort(words, (a,b)-> a.length()-b.length());
	    HashMap<String, Integer> map = new HashMap(); 
	    
        for(String w : words) 
		{                            
		    map.put(w, 1);                                  
		
            for(int i=0; i<w.length(); i++) 
			{  
                
    			StringBuilder sb = new StringBuilder(w);
	    		String next = sb.deleteCharAt(i).toString();
                
		    	if(map.containsKey(next) && map.get(next)+1 > map.get(w))
			    	map.put(w, map.get(next)+1);       
        	}
		    res = Math.max(res, map.get(w));          
	    }
	    return res;
    }

	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		String[] strarr=null;
		str=str.replaceAll("[^a-zA-Z\\s]","");
		strarr=str.split(" ");
		
		System.out.println(longestStrChain(strarr));
	}
}