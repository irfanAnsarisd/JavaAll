package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C {
	public static void main(String[] args) {
		// a-zA-Z -->> this is find both small letter and capital letter from character.
		Pattern p = Pattern.compile("[a-zA-Z]");
		Matcher m = p.matcher("a6b#@9DcdfhlDd@#$fsDKGL%^kf");
		while(m.find()) {
			System.out.println(m.start()+".........."+m.group());
		}
	}
}