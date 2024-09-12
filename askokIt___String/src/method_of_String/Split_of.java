package method_of_String;

/*
 * #7) Java String split()
As the name suggests, a split() method is used to split or separate the given String into
multiple substrings separated by the delimiters (“”, “ ”, \\, etc).
In the below example, we will split the String (Thexyzwebsitexyzisxyzashokitxyzhelp) using a
chunk of String(xyz) already present in the main String.

 */
public class Split_of {
	public static void main(String[] args) {
		String str1 = "Thexyzwebsitexyzisxyzashokitxyzhelp";
		
		String[] split = str1.split("xyz");
		
		for(String str : split) {
			System.out.println(str);
		}
	}
}
