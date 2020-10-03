package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Program11 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("durga");
		l.add("30");
		l.add("null");
		l.add("singapore");
		System.out.println(l);
		l.addFirst("navya");
		l.removeLast();
		l.getLast();
		l.set(2, "bali");
		System.out.println(l);
		ListIterator li = l.listIterator();
		while(li.hasNext())
		{
			String s = (String) li.next();
			
			if(s.equals("navya"))
			{
				li.add("rakesh");
				
			}
			else if(s.equals("bali"))
			{
				li.set("mouni");
			}
			else if(s.equals("durga"))
			{
				li.remove();
			}
			else
				
				{
					li.add("rakesh");
				}
			System.out.println(l);
		
		

	}}

}
