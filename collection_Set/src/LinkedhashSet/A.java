package LinkedhashSet;

import java.util.LinkedHashSet;

public class A {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
		lSet.add(10);
		lSet.add(40);
		lSet.add(20);
		lSet.add(30);
		lSet.add(50);
		
		lSet.add(null);
		
		System.out.println(lSet);
	}
}
