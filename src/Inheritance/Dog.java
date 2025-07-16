package Inheritance;

public class Dog extends Animal1{
	String type="with fur";
	public void bark() {
		System.out.println("barking frequently");
	}
	public static void main(String args[] ){
		Dog d=new Dog();
		System.out.println(d.nooftypes);
		run();
		System.out.println(d.type);
		d.bark();
		
	}

}
