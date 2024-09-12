package arrays;

public class Largest_Element_An_Array {
	
	public int findMax(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Largest_Element_An_Array max = new Largest_Element_An_Array();
		int[] arr = {12,22444,73,389,1234,12};
	
		
		int largest = arr[0];
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]> largest) {
				largest = arr[i];
			}
		}
		System.out.println("big number is : " + max.findMax(arr) );
		
		
	}
}
