package MethodOverriding;

public class Snake extends Animal {
	public void sound() {
		super.sound();
		System.out.println( "Snake make buss frequently");
	}
	public void eat() {
		super.eat();
		System.out.println(" Snake eats flies,frogs");
	}

}
