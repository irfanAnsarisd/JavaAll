package string_udterstanding;

public class Demo1 {
	public static void main(String[] args) {
		String s1 = "Irfan";
		String s2 = "Irfan";
		String s3 = new String("Irfan");
		char[] c = {'j','a','v','a'};
		String s4 = new String(c);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		if(s1==s2) {
			System.out.println("both address are same");
		}
		
		if(s1==s3) {
			System.out.println("address are same");
		}else {
			System.out.println("adress are diffrent");
		}
	}
}
