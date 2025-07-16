package MethodOverriding;

public class Driver {
	public static void main(String args[]) {
		Snake s1= new Snake();
		s1.sound();
		s1.eat();
		Dog d1=new Dog();
		d1.sound();
		d1.eat();
		Cat c1=new Cat();
		c1.sound();
		c1.eat();
	}

}
