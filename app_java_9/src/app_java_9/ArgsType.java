package app_java_9;

public class ArgsType {
	ArgsType(int x){
		System.out.println(x);
	}
	ArgsType(char x){
		System.out.println(x);
	}
	ArgsType(String x){
		System.out.println(x);
	}
	public static void main(String[] args) {
		ArgsType a1 = new ArgsType(100);
		ArgsType a2 = new ArgsType('G');
		ArgsType a3 = new ArgsType("Hello Irfan");
	}
}
