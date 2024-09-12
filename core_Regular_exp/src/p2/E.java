package p2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E {
	public static void main(String[] args) {
		// "\\D"--> capital D  it is used to return other than digit
		Pattern p = Pattern.compile("\\D");
		Matcher m = p.matcher("adf4 3f #3 ftikHJ*( 898 KIKJ");
		while(m.find()) {
			System.out.println(m.start()+"......"+m.group());
		}
	}
}