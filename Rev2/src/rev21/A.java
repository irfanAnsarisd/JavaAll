package rev21;

public class A {
	A(){
		System.out.println("this is called default cons");
	}
	
	A(int x){
		System.out.println(x);
		return;
	}
	
	A(String name){
		System.out.println(name);
	}
	
	A(char x){
		System.out.println(x);
	}
	A(int a , int b){
		System.out.println(a);
		System.out.println(b);
	}
	
	A(String first, String last){
		String fullname = first + last;
		System.out.println(fullname);
	}
	
	
	public static void main(String[] args) {
		A a = new A(12);
		A a1 = new A('a');
		A a2 = new A("irfan");
		A a3= new A(112, 123);
		A a4= new A("irfan", " Ansari");
	
	}
}
