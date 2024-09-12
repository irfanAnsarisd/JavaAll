package psa_string;

public class PsaReverse_String {
	public static void main(String[] args) {
		String str = "Irfan Ansari";
		// reverse
		for(int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
