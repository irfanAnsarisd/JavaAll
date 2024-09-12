package multiple_diamond_36;

public class D implements C{
	public void test1() {
		System.out.println(100);
	}
	public void test2() {
		System.out.println(200);
	}
	public static void main(String[] args) {
		D d = new D();
		d.test1();
		d.test2();
	}
}
