package p1;

public class Cat extends Dog {
	
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.noise();
		System.out.println("______");
		Cat c = new Cat();
		c.eat();
		c.noise();
	}

	@Override
	public void noise() {
		// TODO Auto-generated method stub
		System.out.println("mew mew....");
	}
	
}
