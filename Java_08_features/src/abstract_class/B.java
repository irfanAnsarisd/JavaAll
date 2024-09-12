package abstract_class;

public class B extends A{
	
	public void test2() {
		System.out.println(300);
	}
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.x);
		System.out.println(A.y);
		b.test1();
		b.test2();
	}
}
