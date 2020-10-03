package collections;

import java.util.LinkedList;

public class Program21 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("M");
		l.add("P");
		l.add("K");
		l.add("30");
		System.out.println(l);
		l.removeAll(l);
		System.out.println(l);

	}

}
