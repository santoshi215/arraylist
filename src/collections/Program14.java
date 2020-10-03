package collections;

import java.util.LinkedList;

public class Program14 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("malava");
		l.add("30");
		l.add("mirza");
		l.add("singapore");
		System.out.println(l);
		l.addLast("$smp$");
		
		System.out.println(l);
	}

}
