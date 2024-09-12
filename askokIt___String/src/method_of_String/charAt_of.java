package method_of_String;
/*
 * #4) String charAt()
This method is used to retrieve a single character from a given String.
The syntax is given as:
char charAt(int i);
The value of ‘i’ should not be negative and it should specify the location of a given String i.e.
if a String length is 5, then the value of ‘i’ should be less than 5
 */
public class charAt_of {
	public static void main(String[] args) {
		String str1 = "ashokit";
		System.out.println(str1.charAt(4));
	}
}
