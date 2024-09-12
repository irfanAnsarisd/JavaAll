package p4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		// a* gives us zero occurence and group of occurence
		Pattern p = Pattern.compile("a*");
		
		// a+ gives us at least one occurence and group of occurence
				Pattern p2 = Pattern.compile("a+");
				
				// a? gives us the single occurence of character and zero occurense
				Pattern p3 = Pattern.compile("a?");
				
		      Matcher m = p3.matcher("aabaaabaaaabaaaabbaabab");
		      while(m.find()) {
		    	  System.out.println(m.start()+"......."+m.group());
		      }
	}
}
