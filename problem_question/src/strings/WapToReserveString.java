package strings;

public class WapToReserveString {
	public static void main(String[] args) {
//		String str1 = "Irfan";
//		
//		for(int i = str1.length()-1; i>=0; i--) {
//			System.out.println(str1.charAt(i));
//		}
		
		String str2 = "irfan ansari";
		
		StringBuffer s= new StringBuffer(str2);
		StringBuffer rev= s.reverse();
		System.out.println(rev);
	}
}
