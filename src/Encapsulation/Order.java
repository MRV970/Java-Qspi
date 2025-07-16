package Encapsulation;

public class Order {
private	String productname;
private int ProductId;
private double price;
private boolean payment;
	
public String getname() {
	return productname;
}
public int getid() {
	return ProductId;
}
public double getprice() {
	return price;
}
public boolean getpay() {
	return payment;
}
public void setname(String productname) {
	this.productname=productname;
	
}
public void setid(int ProductId) {
	this.ProductId=ProductId;
}
public void setprice(double price) {
	this.price=price;
}
public void setpay(boolean payment) {
	this.payment=payment;
}
public Order(String productname,int ProductId,double price,boolean payment) {
	this.productname=productname;
	this.ProductId=ProductId;
	this.price=price;
	this.payment=payment;
}
}
