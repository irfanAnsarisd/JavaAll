package hashSet;

import java.util.HashSet;

public class A {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(40);
		hashSet.add(40);
		hashSet.add(null);
		hashSet.add(50);
		
		System.out.println(hashSet);
	}
}
