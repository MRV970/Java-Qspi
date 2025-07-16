package Encapsulation;

public class Employee {
private String name;
private double sal;
private long c_no;
public Employee(String name,double sal,long c_no) {
	this.name=name;
	this.sal=sal;
	this.c_no=c_no;
}
public String getname() {
	return name;
}
public double getsal() {
	return sal;
}
public long getc_no() {
	return c_no;
}
public void setname(String name) {
	this.name=name;
}
public void setsal(double sal) {
	if(sal>=10000) {
		this.sal=sal;
	}
	else {
		System.out.println("not possible");
	}
}
	public void setc_no(long c_no) {
		this.c_no=c_no;
	}
}

