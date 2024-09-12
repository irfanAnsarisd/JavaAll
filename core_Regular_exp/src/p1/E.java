package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E {
	public static void main(String[] args) {
		// A-Z this is used to find all capital letter from the group
		Pattern p = Pattern.compile("[A-Z]");
		Matcher m = p.matcher("hjfASlsd3df4F3hgjB4");
		while(m.find()) {
			System.out.println(m.start()+"......."+m.group());
		}
	}
}
