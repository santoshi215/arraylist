package collections;

import java.util.LinkedList;

public class Program22 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		LinkedList l2=new LinkedList();
		l1.add("manjara");
		l1.add("kaveri");
		l1.add("ganga");
		l1.add("malprabha");
		l1.add("null");
		System.out.println(l1);
		l2.add("manjara");
		l2.add("kaveri");
		l2.add("dairymilk");
		l2.add("malprabha");
		l2.add("ganga");
		l2.add("null");
		l1.containsAll(l2);
		System.out.println(l1.containsAll(l2));
	}

}
