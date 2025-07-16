package abstraction;

public class Person2 {
	String name;
	int age;
	long c_no;
	Person2(String name,int age,long c_no){
		this.name=name;
		this.age=age;
		this.c_no=c_no;
		
	}
	public String toString() {
		return name+" "+age+" "+c_no;
	}
	public static void main(String args []) {
		Person2 p1=new Person2("Ahi",25,1234567899l);
		System.out.println(p1);
		Person2 p2=new Person2("mrv",22,994675868l);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
	}

}
