package collections;

import java.util.LinkedList;

public class Program23 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");
		l.add("5");
		l.add("4");
		l.add("9");
		System.out.println(l);
		l.set(4, 55);
		System.out.println(l);
	}

}
