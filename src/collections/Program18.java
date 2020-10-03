package collections;

import java.util.LinkedList;

public class Program18 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("nakul");
		l.add("30");
		l.add("mirza");
		l.add("singapore");
		l.add("disha");
		l.add("nakul");
		l.add("30");
		System.out.println(l);
		l.retainAll(l);
		System.out.println(l);
		

	}

}
