package p2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class F {
	public static void main(String[] args) {
		// "\\w"-->  it is used to return  digit and character
		Pattern p = Pattern.compile("\\w");
		Matcher m = p.matcher("adf4 3f #3 ftikHJ*( 898 KIKJ");
		while(m.find()) {
			System.out.println(m.start()+"......"+m.group());
		}
	}
}