package app_java_9;

public class A {
	A(){
		this(100);
		System.out.println("boy");
	}
	A(int x){
		
		System.out.println(x);
		
	}
	A(int x, int y){
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		A a2 = new A();
		A a3 = new A(1,3);
	}
}

