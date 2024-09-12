package functional_interface;
/*
 * this is was introduced in java 8
 * this interface can consist of exactly one incomplete method in it.
 * we can create any number of complete method using default keyword
 * 
 */
@FunctionalInterface
public interface A {
	public void test1();
	
	default public void test2() {
		System.out.println(200);
	}
	
	default public void test3() {
		System.out.println(300);
	}
}
