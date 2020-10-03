package collections;

import java.util.ArrayList;

public class Program10 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("santu");
		al.add("123");
		al.add("jiggy");
		al.add("Z");
		al.add("999");
		System.out.println("first arraylist:-"+al);
		//ArrayList al1 = new ArrayList(al);-->we can copy either one among below 2.
		ArrayList al1 = new ArrayList();
		al1.addAll(al);
		System.out.println("copied arraylist:-"+al1);
		
		
	}

}
