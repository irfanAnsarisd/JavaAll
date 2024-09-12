package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class A {
	public static void main(String[] args) {
		List<Integer> x = new LinkedList<Integer>();
		
		x.add(10);
		x.add(20);
		x.add(30);
		
		System.out.println(x);
		
		x.add(1,300);
		System.out.println(x);
		
		ArrayList<Integer> y = new ArrayList<Integer>();
		y.add(200);
		y.add(400);
		y.add(600);
		
		x.addAll(1, y);
		System.out.println(x);
		
		
		if(x.contains(6000)) {
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}
		
		
		x.remove(3);
		System.out.println(x);
		
		System.out.println(x.get(1));
		
		
		Iterator itr = x.iterator();
		while(itr.hasNext()) {
			System.out.println("value of x :" + itr.next());
		}
		
		System.out.println(x.size());
		
	}
	
}
