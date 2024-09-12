package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[abcd]");
		Matcher m = p.matcher("a6b#@9Dcd");
		
		while(m.find()) {
			System.out.println(m.start()+"......"+m.group());
		}
	}
}
