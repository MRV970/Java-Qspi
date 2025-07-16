package Inheritance;

public class Cat extends Animal {
public static void meow() {
	System.out.println("meow frequently");
}
public static void main(String args[]) {
	Cat c1=new Cat();
	System.out.println(c1.type);
	c1.swim();
	meow();
}
}
