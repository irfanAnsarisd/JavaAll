package p2;
/*
 an interface forcing class to implements those methods of interface or else you will get an error 
 in the class
 */
public class B implements A{
	public void test1() {
		System.out.println("test1");
	}
	public void test2() {
		System.out.println("test2");
	}
	public static void main(String[] args) {
		B b = new B();
		b.test1();
		b.test2();
	}
}
