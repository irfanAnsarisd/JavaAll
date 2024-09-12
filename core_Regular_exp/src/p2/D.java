package p2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D {
	public static void main(String[] args) {
		// "\\d"-->   it is used to return only digit or number
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher("adf4 3f #3 ftikHJ*( 898 KIKJ");
		while(m.find()) {
			System.out.println(m.start()+"......"+m.group());
		}
	}
}
