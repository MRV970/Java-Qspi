package Inheritance;

public class Benz extends Car {
	String model="benz 890";
	String feature="sunroof";
	public static void safety() {
		System.out.println("safety because of airbaloons");
	}
	public void  enjoy() {
		System.out.println("stand and enjoy because of sunroof ");
	}
	public static void main(String args[] ){
		Benz b1=new Benz();
		System.out.println(b1.noofwheels);
		System.out.println(b1.types);
		drive();
		b1.transport();
		System.out.println(b1.name);
		System.out.println(b1.noofseats);
		ride();
		b1.travel();
		System.out.println(b1.model);
		System.out.println(b1.feature);
		safety();
		b1.enjoy();
	}

}
