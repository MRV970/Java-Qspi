package ConstructorChaining;

public class Keyboard extends Laptop {
	String type;
	String model;
	public Keyboard(String types,double price,String name,int id,String type,String model) {
		super(name,id,types,price);
		this.type=type;
		this.model=model;
	}
	public static void main(String args[]) {
		Keyboard k=new Keyboard("different types of devices",500000,"Lenovo",4567,"Touch keyboard","india pad3");
		System.out.println(k.types);
		System.out.println(k.price);
		System.out.println(k.name);
		System.out.println(k.id);
		System.out.println(k.type);
		System.out.println(k.model);
		
	}

}
