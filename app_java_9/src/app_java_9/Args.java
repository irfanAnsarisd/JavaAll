package app_java_9;

public class Args {
	 Args() {
		// TODO Auto-generated constructor stub
		 System.out.println(100);
	}
	 Args(int x){
		 System.out.println(x);
	 }
	 Args(int x, int y){
		 System.out.println(x);
		 System.out.println(y);
	 }
	 public static void main(String[] args) {
		 Args a1 = new Args();
		 Args a2 = new Args(200);
		 Args a3 = new Args(10,20);
	}
}
