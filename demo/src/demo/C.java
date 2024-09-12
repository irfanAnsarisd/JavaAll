package demo;

import java.io.File;

public class C {
	public static void main(String[] args) {
		File f = new File("F:\\test\\");
		String[] val = f.list();
		for(int i = 0; i<val.length;i++) {
			System.out.println(val[i]);
		}
	
	
		System.out.println(val.length);
		
	}
}
