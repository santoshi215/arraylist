package collections;

import java.util.ArrayList;

public class Remove3 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("santu");
		al.add("123");
		al.add("jiggy");
		al.add("Z");
		al.add("999");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);


	}

}
