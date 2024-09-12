package method_of_String;
/*
Although Java uses a ‘+’ operator for concatenating two or more strings. A concat() is an
inbuilt method for String concatenation in Java.
*/
public class Concat_of {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = " world";
		
		String str3 = str1.concat(str2);
		System.out.println(str3);
		
	}
}
