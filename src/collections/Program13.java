package collections;

import java.util.LinkedList;

public class Program13 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("abc");
		l.add("30");
		l.add("null");
		l.add("singapore");
		System.out.println(l);
		l.addFirst("$smp$");
		
		System.out.println(l);

	}

}
