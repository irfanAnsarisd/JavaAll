package Interface_37;

/*
 * All variable by default in an interface is final and static 
 * we can not create object of an interface
 */
public class B implements A{
	public static void main(String[] args) {
		System.out.println(A.CURRENT_SCORE);
		System.out.println(A.USER_NAME);
		
		/*
		 * An object of interface cannot be created but reference variable can be created 
		 */
		//A a1 = new A();// error
	}
}
