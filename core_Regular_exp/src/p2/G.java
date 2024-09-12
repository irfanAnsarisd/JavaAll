package p2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class G {
	public static void main(String[] args) {
		// "\\W"--> capital W  it is used to return apart from digit and character
		Pattern p = Pattern.compile("\\W");
		Matcher m = p.matcher("adf4 3f #3 ftikHJ*( 898 KIKJ");
		while(m.find()) {
			System.out.println(m.start()+"......"+m.group());
		}
	}
}
