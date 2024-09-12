package p3;

import java.util.Scanner;

public class MobilePhoneValidator {
	public static void main(String[] args) {
		System.out.println("Enter mobile number:");
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		String regex = "[6-9][0-9]{9}";
		if(str.matches(regex)){
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
	}
}
