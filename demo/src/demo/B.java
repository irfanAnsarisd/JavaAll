package demo;

public class B {
	public static void main(String[] args) {
		int[] x = {2,111,21,2,30,14,4,51,4,21,30};
		int temp = 0;
		
		for(int i = 0; i<x.length-1;i++) {
			for(int j = 0; j<x.length-1;j++) {
				if(x[j]>x[j+1]) {
					temp = x[j];
					x[j]= x[j+1];
					x[j+1] = temp;
				}
			}
		}
		
	    // to remove te duplicate value in array
		int[] arrTemp = new int[x.length];
		int j = 0;
		
		for(int i = 0; i<x.length-1; i++) {
			if(x[i]!=x[i+1]) {
				arrTemp[j] = x[i];
				j++;
			}
		}
		
		arrTemp[j] = x[x.length-1];
		
		
//		for(int k = 0; k<=j; k++) {
//			System.out.println(arrTemp[k]);
//		}
		
		System.out.println(arrTemp[j]);
		System.out.println(arrTemp[j-1]);
	}
}
