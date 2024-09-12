package p5_mulitple_interface;

public class Aclass implements First_Interface, Second_Interface {
	public void test1() {
		System.out.println(10);
	}
	public void test2() {
		System.out.println(200);
	}
	public static void main(String[] args) {
		Aclass a1 = new Aclass();
		a1.test1();
		a1.test2();
	}
}
