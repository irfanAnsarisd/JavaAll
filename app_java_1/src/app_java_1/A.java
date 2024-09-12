package app_java_1;

public class A {
	 
	  int x = 10;
	 
	public static void main(String[] args) {
		A a2 = new A();
		a2.x = 30;
		System.out.println(a2.x);
		A a3 = new A();
		System.out.println(a3.x);
	}
	public void test() {
		System.out.println(x);
	}
}
