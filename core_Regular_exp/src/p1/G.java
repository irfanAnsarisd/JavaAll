package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class G {
	public static void main(String[] args) {
		// [^a-zA-Z0-9] this is used for other than capital and small letter and number also
		Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		Matcher m = p.matcher("jfs#$%dlDh%dj$%&kLkjdjh^&dDNMm.,HJ4365@#$476%^^");
		while (m.find()) {
			System.out.println(m.start() + "......." + m.group());
		}
	}
}
