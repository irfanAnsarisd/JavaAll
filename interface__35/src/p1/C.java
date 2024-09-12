package p1;

public class C implements B {
	public void test() {
		System.out.println(100);
	}
	public static void main(String[] args) {
		C c = new C();
		c.test();
	}
}
