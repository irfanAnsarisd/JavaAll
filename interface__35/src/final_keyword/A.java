package final_keyword;

public class A {
//	final static int x; // error the blank field x may not have been initialized
//	final int y;
	
	final public void test() {
		
	}
	public static void main(String[] args) {
		final int x = 10;
//		x = 10 // error
//		x = 20; // error
		System.out.println(x);
	}
}
