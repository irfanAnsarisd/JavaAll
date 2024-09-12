package strings;
/*
 * find total no of occurence of (a) in given string
 */
public class NoOfOccurence {
	public static void main(String[] args) {
		String s = "IrfanAnsari";
		
		char ch = 'a';
		char[] arr = s.toCharArray();
		int count = 0;
		for(int i =0; i<arr.length;i++) {
			if(arr[i] == ch || arr[i] == 'A' ) {
				count++;
			}
		}
		System.out.println(s);
		System.out.println("No of occurence (a) is : " + count++);
	}
}









