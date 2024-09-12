package throw_ex;

import java.util.Scanner;

/*
 * it helps us to create customized exception as per the requirement of developer
 */
public class A {
	public static void main(String[] args) {
		int balance = 500;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your amount: ");
		int amount = sc.nextInt();
		if(balance> amount) {
			System.out.println("collect the cash ");
		}else {
			try {
				throw new InsufficientFunds();
			}catch(InsufficientFunds e) {
				System.out.println(e);
				System.out.println("low balance");
			}
		}
	}
}
