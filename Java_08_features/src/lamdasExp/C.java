package lamdasExp;

@FunctionalInterface
interface Aa{
	public void test2(int x);
}

public class C {
	public static void main(String[] args) {
		Aa a1 = (int x)->{
			System.out.println(x);
		};
		a1.test2(200);
	}
}
