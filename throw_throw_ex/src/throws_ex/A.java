package throws_ex;
/*
 * it is applied on method 
 * if any exception occurs in a method then the exception will be passed on to the
 * calling statement of the method
 */

import java.io.FileWriter;

public class A {
	public static void main(String[] args) {
		A a1 = new A();
		//a1.test();  // unhandled Exception
	}
	
	public void test() throws Exception{
		FileWriter fw = new FileWriter("F:\\test.txt");
	}
}
