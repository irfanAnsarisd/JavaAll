package p2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// one group form with 10 digit

public class A {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[0-9]{5}");
//		Pattern p = Pattern.compile("[0-9]{10}");
//		Pattern p = Pattern.compile("[0-9]{10}");
		Matcher m = p.matcher("620735664890907");
		while(m.find()) {
			System.out.println(m.start()+"......"+m.group());
		}
	}
}
