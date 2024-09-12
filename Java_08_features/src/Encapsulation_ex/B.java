package Encapsulation_ex;

import java.io.BufferedReader;
import java.io.FileReader;

public class B{
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("F:\\password\\A.txt");
			BufferedReader br = new BufferedReader(fr);
			A a1 =new A();
			a1.setPassword(br.readLine());
			System.out.println(a1.getPassword());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
