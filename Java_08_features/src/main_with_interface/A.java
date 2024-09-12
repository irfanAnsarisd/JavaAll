package main_with_interface;
/*
 * main method allowed in interface after java 8
 * 
 * ->>> we cannot create incomplete static  method in an interface
 * 
 *  -->> we can create complete static method in an interface
 */
public interface A {
	int  x = 10;
	public static void test1() {
		System.out.println(100);
	}
	
	public static void main(String[] args) {
		System.out.println(A.x);
		
		A.test1();
	}
}
