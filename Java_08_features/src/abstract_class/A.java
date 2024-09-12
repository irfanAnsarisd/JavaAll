package abstract_class;
/*
 * it can consist of both complete and incomplete methods in it.
 */
abstract class A {
	int x = 10;
	static int y = 20;
	
	public void test1() {
		System.out.println(1);
	}
	
	abstract public void test2();
	public static void main(String[] args) {
		// A a1 = new A(); // error object cannot be created
	}
}
