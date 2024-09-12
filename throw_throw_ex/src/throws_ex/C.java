package throws_ex;

import java.io.FileWriter;

public class C {
	public static void main(String[] args) throws Exception{
		A a1 = new A();
		a1.test();
		
		System.out.println("main methhod");
	}
	
	public void test() throws Exception{
		FileWriter fw = new FileWriter("F:\\test.txt");
	}
}
