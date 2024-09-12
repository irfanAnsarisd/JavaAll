
package diamond_interface;

interface InterfaceA {
     default void display() {
        System.out.println("InterfaceA display");
    }
}

interface InterfaceB extends InterfaceA {
    default void display() {
        System.out.println("InterfaceB display");
    }
}

interface InterfaceC extends InterfaceA {
    default void display() {
        System.out.println("InterfaceC display");
    }
}

// Class inheriting from InterfaceB and InterfaceC
class MyClass implements InterfaceB, InterfaceC {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		InterfaceC.super.display();
	}
	
    // No overriding of the display() method
	
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display(); // Which display() method should be called?
    }
}