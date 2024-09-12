package p1__thread_jaava;

public class A extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i<=10000; i++) {
			System.out.println("run");
		}
	}

	public static void main(String[] args) {
		System.out.println("main method start");
		A a = new A();
		a.test();
        Thread t = new Thread(a);
        t.start();
		
        for(int i = 1; i<=10000; i++) {
			System.out.println("main");
		}
		
		
	}
	public void test() {
		for(int i = 1; i<=1000; i++) {
			System.out.println(100);
		}
	}
}
