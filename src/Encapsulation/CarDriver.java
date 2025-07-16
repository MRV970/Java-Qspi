package Encapsulation;

public class CarDriver {
	public static void main(String args[]) {
		Car c1=new Car("red",1200000,"BENZ","XYZ");
	System.out.println(c1.getcolor());
	System.out.println(c1.getprice());
	System.out.println(c1.getbrand());
	System.out.println(c1.getmodel());
	c1.setcolor("red");
	System.out.println(c1.getcolor());
	c1.setprice(1400000);
	System.out.println(c1.getprice());
	c1.setbrand("Maruthi");
	System.out.println(c1.getbrand());
	c1.setmodel("maruthi 800");
	System.out.println(c1.getmodel());

	}
}
