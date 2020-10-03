package collections;

import java.util.ArrayList;

public class Program3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("durga");
		al.add("a");
		al.add("z");
		al.add("apple");
		al.add("brown");
		System.out.println(al);
		al.add(0, "ram");//at first position insertion
		System.out.println(al);

	}

}
