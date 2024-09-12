package p1__thread_jaava;

public class B extends Thread{
	String name;
	B(String name){
		this.name = name;
	}
	
	
	
	@Override
	public void run() {
		for(int i = 1; i<=10000;i++) {
			System.out.println(this.name);
		}
	}



	public static void main(String[] args) {
		B a1 = new B("XXXXXXXX");
		B a2 = new B("YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
		B a3 = new B("ZZ");
		
		a1.start();
		a2.start();
		a3.start();
		
		
	}
}
