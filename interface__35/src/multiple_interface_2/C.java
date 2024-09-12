package multiple_interface_2;

public class C implements A,B{

	
	public void test1() {
		System.out.println(1000);
	}
	public static void main(String[] args) {
		C c = new C();
		c.test1();
		
		
	}

		
}
