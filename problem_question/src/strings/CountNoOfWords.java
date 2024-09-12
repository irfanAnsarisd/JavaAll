package strings;

public class CountNoOfWords {
	public static void main(String[] args) {
		String s1  = "irfan ansari i am      from gopalganj bihar";
		
		String[] arr = s1.split("\\s");
		String[] arr1 = s1.split("\\s+");  // s+ is used to remove extra space to not count as word
		
		int count =0;
		for(int i = 0; i<arr1.length; i++) {
			count++;
		}
		System.out.println(s1);
		System.out.println("Total Number is present in this given strings are: " + count);
	}
}
