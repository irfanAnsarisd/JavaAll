package demo2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class B {
public static void main(String[] args) {
	try {
		FileOutputStream fos = new FileOutputStream("F:\\test\\A.txt");
		A a1 = new A();
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		fos.close();
		oos.close();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
