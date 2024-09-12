package optionalClass;

import java.util.Optional;
/*
 * this was introduced in java 8.
 * it is alternative way of handling null pointer exception
 */
public class OptionalClass {
	int x = 10;
	public static void main(String[] args) {
		//OptionalClass a1 = new OptionalClass();
		OptionalClass a1 = null;
		
		Optional<OptionalClass> val = Optional.ofNullable(a1);
		
		if(val.isPresent()) {
			System.out.println(a1.x);
		}else {
			System.out.println("null reference");
		}
		
	}
}
