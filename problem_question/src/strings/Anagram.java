package strings;

import java.util.Arrays;
import java.util.Scanner;

/*
 * to check anagram 
 * ex- xyz , yxz -- in this two string same character is parsent that why this is anagram.
 * ex- peek, keep -- in this two string same character and length is same that why this is anagram.
 * ex- java,awaj - in this two string same character not present -- this is not anagram.
 */
public class Anagram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s1 = scan.next();
		System.out.println("Enter second String: ");
		String s2 = scan.next();
		
		if(s1.length() != s2.length()) {
			System.out.println("This is not Anagram..");
			return;
		}
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a,b)){
			System.out.println("Given String is anagram");
		}else {
			System.out.println("Given Sring is not Anagram");
		}
	}
	
}
