package strings;

// Hello My Friend -- olleH yM dneirF 

public class ReverseEachWordString {
	public static void main(String[] args) {
		String s = "Hello My Friend";
		
		String[] arr = s.split(" ");
		
		for(int i = 0; i<arr.length; i++) {
			String x = arr[i];
			
			StringBuffer sb = new StringBuffer(x);
			sb.reverse();
			System.out.print(sb + " ");
		}
	}
}
