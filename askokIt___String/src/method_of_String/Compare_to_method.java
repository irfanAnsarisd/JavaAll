package method_of_String;

/*
 * #5) Java String compareTo()
This method is used to compare two Strings. The comparison is based on alphabetical order.
In general terms, a String is less than the other if it comes before the other in the dictionary.

 */
public class Compare_to_method {
	public static void main(String[] args) {
		String str1 = "irfan  ansari";
		String str2 = "irfan";
		
		int compareToo = str1.compareTo(str2);
		System.out.println(compareToo);
		System.out.println(str2.compareTo(str1));
	}
}
