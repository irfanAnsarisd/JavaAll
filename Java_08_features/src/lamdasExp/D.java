package lamdasExp;

@FunctionalInterface
interface Da{
	public int add(int a , int b);
	
	default public void test2() {
		System.out.println(200);
	}
	
	default public void test3() {
		System.out.println(300);
	}
}

public class D {
	public static void main(String[] args) {
		Da d = (int a, int b)-> {
			return a+b;
		};
		
		int x = d.add(10,20);
		System.out.println(x);
		d.test2();
		d.test3();
	}
}

