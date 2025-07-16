package constuctor;

public class Person {
String name;
int age;
long c_no;
public Person() {
	System.out.println("No argument");
	
}
public Person(String Name) {
	name=Name;
System.out.println(Name);	
}
public Person(String name,int age) {
	this.name=name;
	this.age=age;
}
public Person(String name,int age,long c_no) {
	this.name=name;
	this.age=age;
	this.c_no=c_no;
}
}
