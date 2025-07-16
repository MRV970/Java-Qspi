package abstraction;

public  abstract class Laptop {
	String name;
	double price;
	
	static  String colour="Blue";
	
	public abstract  void demo();
	Laptop(String name,double price){
		this.name=name;
		this.price=price;
		
	}
	public void play() {
		System.out.println("Playing games --->>> Chess");
	}
	public static void watch() {
		System.out.println("Watching movies --->>> Patriotic movies");
	}
	
	static {
		System.out.println("Static intialiser");
	}
	
	{
		System.out.println("Non Static intialiser");
	}

}
