package OverLoading;

// here we crate more the more method with the same name in same class provided they have different number of 
//arguments or different type of arguments. 
public class Calculator {
	public int sum(int a, int b) {
		return a+b;
	}
	public float sum(float a, float b) {
		return a+b;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int sum1 = cal.sum(10, 20);
		float sum2 = cal.sum(45.4f, 12.3f);
		System.out.println(sum1);
		System.out.println(sum2);
		
	}
}
