package src;
import java.util.LinkedList;
import java.util.Iterator;
public class Q13
{
	public static void main(String args[])
	{
		LinkedList<Integer> list1=new LinkedList<Integer>();
		LinkedList<Integer> list2=new LinkedList<Integer>();
		
		list1.add(10);		list2.add(10);
		list1.add(20);		list2.add(20);
		list1.add(30);		list2.add(30);
		list1.add(40);		list2.add(40);
		list1.add(50);		list2.add(50);
		list1.add(60);		list2.add(60);
		
      System.out.println("Are List is same : "+compareLL(list1,list2));
	}
	
	static boolean compareLL(LinkedList list1, LinkedList list2)
	{
		Iterator<Integer> itr1=list1.iterator();
		Iterator<Integer> itr2=list2.iterator();
		
		if(list1.size() != list2.size())
			return false;
		else
		{
			while(itr1.hasNext() && itr2.hasNext())
			{
				if(itr1.next() != itr2.next())
					return false;
			}
		}
		return true;
	}
}