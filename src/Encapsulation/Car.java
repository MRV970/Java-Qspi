package Encapsulation;

class Car {
	private	String color;
	private double price;
	private String brand;
	private String model;
		
	public String getcolor() {
		return color;
	}
	public double getprice() {
		return price;
	}
	public String getbrand() {
		return brand;
	}
	public String getmodel() {
		return model;
	}
	public void setcolor(String color) {
		this.color=color;
		
	}
	public void setprice(double getprice) {
		this.price=price;
	}
	public void setbrand(String brand) {
		this.brand=brand;
	}
	public void setmodel(String model) {
		this.model=model;
	}
	public Car(String color,double price,String brand,String model) {
		this.color=color;
		this.price=price;
		this.brand=brand;
		this.model=model;
		
}
}
