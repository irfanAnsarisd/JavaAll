package throws_ex;

import java.io.FileWriter;

public class B {
	public static void main(String[] args) {
		B a1 =new B();
		try {
			a1.test();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		System.out.println("into the main program");
	}
	
	public void test() throws Exception{
		FileWriter fw = new FileWriter("F:\\test.txt");
	}
}
