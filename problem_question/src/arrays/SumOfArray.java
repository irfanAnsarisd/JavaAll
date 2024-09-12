package arrays;

public class SumOfArray {
	public static void main(String[] args) {
		int[] x = {1,2,3,4,5};
		int sum = 0;
		
		for(int i =0; i<x.length; i++) {
			sum = sum + x[i];
		}
		
		System.out.println(sum);
	}
}
