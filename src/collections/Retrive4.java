package collections;

import java.util.ArrayList;

public class Retrive4 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("5");
		al.add("6");
		System.out.println(al);
		al.addAll(al);
		System.out.println(al);
		

	}

}
