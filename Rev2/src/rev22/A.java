package rev22;

public class A {
	//int x = 10;
	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
		a1.test2();
		A a2 = new A();
		a2.test();
		
		a1.test();
	}
	
	public void test() {
		System.out.println(this);
	}
	
	public void test2() {
		System.out.println(this);
	}
}
