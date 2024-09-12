package p2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {
	public static void main(String[] args) {
		// "\\s"  it is used to remove white space 
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher("adf4 3f #3 ftikHJ*( 898 KIKJ");
		while(m.find()) {
			System.out.println(m.start()+"......"+m.group());
		}
	}
}
