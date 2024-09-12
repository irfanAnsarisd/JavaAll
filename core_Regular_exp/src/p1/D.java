package p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D {
	public static void main(String[] args) {
		// 0-9 -->> this is find only number from the group.
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher("a6b#@9Dc943jjk35m,k45KGL%^kf");
		while(m.find()) {
			System.out.println(m.start()+".........."+m.group());
		}
	}
}