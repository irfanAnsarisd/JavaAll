package method_of_String;

/*
 * #6) String contains()
This method is used to determine whether a substring is a part of the main String or not.
The return type is Boolean.
For E.g. In the below program, we will check whether “it” is a part of “ashokit” or not and
we will also check whether “blog” is a part of “ashokit”.
 */
public class Contains_of {
	public static void main(String[] args) {
		String str1 = "ashokit";
		
		boolean contains1 = str1.contains("it");
		System.out.println(contains1);
		
		boolean contains2 = str1.contains("blog");
		System.out.println(contains2);
		
	}
}
