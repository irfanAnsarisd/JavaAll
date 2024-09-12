package psa_string;

public class PsaCountNumberOfWords {
	public static void main(String[] args) {
		String str = "Pankaj Sir   Acedemy   ";
		
		String[] sp = str.split("\\s+"); // \\+ is used to remove extra spaces
		
		int count = 0;
		for(int i = 0; i<sp.length; i++) {
			count++;
//			System.out.print(sp[i]);
			
		}
//		System.out.println(); 
		System.out.println(count);
		
	}
}
