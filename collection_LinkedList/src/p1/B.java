package p1;

import java.util.LinkedList;

public class B {
	public static void main(String[] args) {
		LinkedList<Integer> x = new LinkedList<Integer>();
		x.add(100);
		x.add(200);
		x.add(300);
		
		System.out.println(x);
		
		x.addFirst(4000);
		
		System.out.println(x);
		
		x.addFirst(5000);
		System.out.println(x);
		
		x.addLast(400);
		System.out.println(x);
	}
}
