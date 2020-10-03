package collections;

import java.util.LinkedList;

public class Program16 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
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
		System.out.println("first occurance of nakul is: "+l.indexOf("nakul"));
		System.out.println("last occurance of 30 is:  "+l.lastIndexOf("30"));
		
	

	}

}
