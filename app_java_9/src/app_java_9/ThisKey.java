package app_java_9;

public class ThisKey {
	public static void main(String[] args) {
		ThisKey a1 = new ThisKey();
		System.out.println(a1);
		a1.test();
	}
	public void test() {
		System.out.println(this);
	}
}
