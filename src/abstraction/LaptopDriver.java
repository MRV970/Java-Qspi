package abstraction;

public class LaptopDriver extends Laptop {
	int a;
	LaptopDriver(String name,double price,int a){
		super(name,price);
		this.a=a;
	}
	
public void demo() {

	System.out.println("Demo method");
}
public static void main(String args []) {
	LaptopDriver l=new LaptopDriver("Lenovo",55000,25);
	System.out.println(l.name);
	System.out.println(l.price);
	System.out.println(l.a);
	System.out.println(l.colour);

	l.play();
	//l.watch();
	Laptop.watch();
}
}
