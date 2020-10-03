package collections;

import java.util.LinkedList;

public class Program15 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("malava");
		l.add("30");
		l.add("mirza");
		l.add("singapore");
		System.out.println(l);
		l.add(1, "disha");
		l.add(3, "nakul");
		
		System.out.println(l);
	}
	

}
