package hashTable;

import java.util.Hashtable;

public class A {
	public static void main(String[] args) {
		Hashtable<Integer,String> hastable = new Hashtable<>();
		hastable.put(100,"ravi");
		hastable.put(102, "smith");
		
		hastable.put(121,"ravi");
		hastable.put(502, "smith");
		
		hastable.put(100,"ravi");
		hastable.put(162, "smith");
		
		hastable.put(190,"ravi");
		hastable.put(152, "smith");
		
		System.out.println(hastable);
		
	}
}
