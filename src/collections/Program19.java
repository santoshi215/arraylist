package collections;

import java.util.LinkedList;

public class Program19 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("11");
		l.add("30");
		l.add("25");
		l.add("36");
		l.add("disha");
		l.add("nakul");
		l.add("30");
		System.out.println(l);
		l.remove("disha");
		l.remove(2);
		System.out.println(l);
		

	}

}
