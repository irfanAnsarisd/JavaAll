package strings;

/*
 * palindrome 
 * ex->boob -- boob, liril -- liril ->> madam -- madam --->> all are palindrome
 * ex- java  - not palindrome
 */
public class WapToCheckStringIsPalindromeOrNot {
	public static void main(String[] args) {
		String str1 = "liril";
		String str2 = "java";
		
//		String rev = "";
//		for(int i = str1.length()-1; i>=0; i--) {
//			rev = rev + str1.charAt(i);
//		}
//		
//		if(str2.equals(rev)) {
//			System.out.println("this is palindrome : " + rev);
//		}else {
//			System.out.println("This is not palindrome.");
//		}
		
		StringBuffer sb = new StringBuffer(str1);
		
		sb.reverse();
		
		String str3 = sb.toString();
		if(str1.equals(str3)) {
			System.out.println("this is palindrome");
			
		}else {
			System.out.println("this is not palindrome");
		}
		
	}
}
