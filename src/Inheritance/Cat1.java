package Inheritance;

public class Cat1 extends Animal1 {
	String color="white";
	public static void meow() {
		System.out.println("meow frequently");
	}
	public static void main(String args[]) {
		Cat1 c = new Cat1();
		System.out.println(c.nooftypes);
		run();
		System.out.println(c.color);
		meow();
		
	}

}
