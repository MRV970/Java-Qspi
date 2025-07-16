package Encapsulation;

public class Account {
private String acc_holder_name;
private long  acc_no;
private double balance;
public Account(String acc_holder_name,long acc_no,double balance) {
	this.acc_holder_name=acc_holder_name;
	this.acc_no=acc_no;
	this. balance=balance;
	
}


public String getname() {
	return acc_holder_name;
}
public long getno() {
	return acc_no;
}
public double getbal() {
	return balance;
}
public void setname(String acc_holder_name) {
	this.acc_holder_name=acc_holder_name;
}
public void setno(long acc_no) {
	this.acc_no=acc_no;
}
public void setbal(double balance) {
	this.balance=balance;
}
}
