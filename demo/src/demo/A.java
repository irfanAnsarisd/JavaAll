package demo;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
	try (Scanner scan = new Scanner(System.in)) {
		String cdn = "yes";
		
		while(cdn.equals("yes")) {
			System.out.println("Enter the amount");
			int amount = scan.nextInt();
			System.out.println("please collect the cash Rs."+ amount);
			System.out.println("do you want to continue yes/no");
			cdn = scan.next();
		}
	}
	}
}
