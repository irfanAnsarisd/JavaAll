package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {
	public static void main(String[] args) {
		// a-z -->> this is find only small letter of character from a to z
		Pattern p = Pattern.compile("[a-z]");
		Matcher m = p.matcher("a6b#@9DcdfhlDdfsDKGLkf");
		while(m.find()) {
			System.out.println(m.start()+".........."+m.group());
		}
	}
}
