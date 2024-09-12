package p3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidator {
	public static void main(String[] args) {
		System.out.println("Enter your name:");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 0;
		Pattern p = Pattern.compile("[^a-zA-Z]");
		Matcher m = p.matcher(str);
		while(m.find()) {
			count++;
		}
		if(count!=0 || str.length() <3) {
			System.out.println("Error");
		}
		else {
			System.out.println("Input Accepted");
		}
		
	}
}
