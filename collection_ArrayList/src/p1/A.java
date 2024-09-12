package p1;

import java.util.ArrayList;
import java.util.Iterator;

public class A {
	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<Integer>();
		// add value
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(40);
		
		System.out.println("add method():"+x);
		
		// size of list
		System.out.println("size of ArrayList : "+x.size());
		
		
		// add value in b/w
		x.add(1, 500);
		System.out.println("add(index, value) method():"+x);
		
		// new arrayList y
		ArrayList<Integer> y = new ArrayList<Integer>();
		y.add(300);
		y.add(400);
		y.add(500);
		
		// addAll(index, collection) --> bind one collection into another
		x.addAll(2,y);
		System.out.println("add(index, collection) method():"+x);
		
		// check whether value present in it or not 
		if(x.contains(5000)) {// contains method
			System.out.println("Yes Present");
		}else {
			System.out.println("No Present");
		}
		
		// remove(index) using index no.
		x.remove(1);
		System.out.println("remove(index) method():"+x);
		
		// read the data through get()
		System.out.println("get the data on index number :" + x.get(3));
		
		// iterator to print the data
		Iterator itr = x.iterator();
		
		while(itr.hasNext()) {
			System.out.println("value of x : " + itr.next());
		}
				
	}
}
