package Encapsulation;

public class Bag {
	private String name;
	private String color;
	private double price;
	private String type;
	private int compartments;
	public Bag(String name,String color,double price,String type,int compartments) {
		this.name=name;
		this.color=color;
		this.price=price;
		this.type=type;
		this.compartments=compartments;
	}
	public String getname() {
		return name;
		
	}
	public String getcolor() {
		return color;
		
	}
	public double getprice() {
		return price;
		
	}
	public String gettype() {
		return type;
		
	}
	public int getcompartments() {
		return compartments;
		
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	public void setprice(Double price) {
		if(price>=1500) {
			this.price=price;
		}
		else {
			System.out.println("not possible");
		}
	}
	public void settype(String type) {
		this.type=type;
	}
	public void setcompartments(int compartments) {
		this.compartments=compartments;
	}
	
	

}
