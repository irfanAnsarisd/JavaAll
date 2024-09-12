package strings;

public class WapToCombineTwoString {
	public static void main(String[] args) {
//		String str1 = "Irfan";
//		String str2= " Ansari";
//		
//		String str3 = str1.concat(str2);
//		System.out.println(str3);
		
		String s1 = "Hello ";
		
		StringBuffer strB = new StringBuffer(s1);
		
		String s2 = "world";
		StringBuffer strB2 = new StringBuffer(s2);
		
		System.out.println(strB.append(strB2));
		
	}
}
