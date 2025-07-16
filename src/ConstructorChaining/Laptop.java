package ConstructorChaining;

public class Laptop extends Devices {
	String name;
	int id;
	public Laptop(String name,int id,String types,double price) {
		
		super(types,price);
		this.name=name;
		this.id=id;
	}

}
