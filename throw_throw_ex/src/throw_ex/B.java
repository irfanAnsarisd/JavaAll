package throw_ex;

public class B {
	public static void main(String[] args) {
		try {
			throw new ApplicationCrashed();
		} catch (ApplicationCrashed e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("Application restarting..");
		}
	}
}
