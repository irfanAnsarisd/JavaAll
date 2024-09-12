package p2;

public class C extends B{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println(100);
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println(200);
		
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.test1();
		c.test2();
	}

}
