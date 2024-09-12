package method_of_String;

/*
 * #8) Java String indexOf()
This method is used to perform a search operation for a specific character or a substring on
the main String. There is one more method known as lastIndexOf() which is also commonly
used.
indexOf() is used to search for the first occurrence of the character.
lastIndexOf() is used to search for the last occurrence of the character.


 */
public class Index_of {
	public static void main(String[] args) {
		String str1 = "ashokit learn here lead anywhere";
		System.out.println(str1.indexOf('a'));
		System.out.println(str1.lastIndexOf('e'));
	}
}
