package MethodOverriding;

public class Dog extends Animal {
public void sound() {
	super.sound();
	
	System.out.println(" Dog barking frequently");
}
public void eat() {
	super.eat();
	System.out.println(" Dog eats veg and non-veg");
}
}
