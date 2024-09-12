package defualtKey;

/*
 * this was introduced in java 8
 * 
 * using default keyword we can create complete methods in an interface.
 */

public class B implements A{
	public static void main(String[] args) {
		B b = new B();
		b.test1();
		b.test2();
	}
}
