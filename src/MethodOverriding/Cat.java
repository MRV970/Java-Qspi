package MethodOverriding;

public class Cat extends Animal {
public void sound() {
	super.sound();
	
	System.out.println(" Cat make meow frequently");
}
public void eat() {
	super.eat();
	System.out.println(" Cat eats non-veg,drinking milk");
}
}
