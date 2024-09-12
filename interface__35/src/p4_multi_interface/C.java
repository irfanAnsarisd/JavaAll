package p4_multi_interface;


public class C implements B{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println(1000);
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println(2000);
	}
	public static void main(String[] args) {
		C c = new C();
		c.test1();
		c.test2();
	}
}	
