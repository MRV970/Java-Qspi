package constuctor;

public class phone {
	String name;
	double price;
	long number;
	int ram;
public phone(String name,double price) {
	this.name=name;
	this.price=price;
}
public phone(long number,int ram) {
	this.number=number;
	this.ram=ram;
}
public phone(String name,double price,long number,int ram) {
	this.name=name;
	this.price=price;
	this.number=number;
	this.ram=ram;
	
	
}
}
