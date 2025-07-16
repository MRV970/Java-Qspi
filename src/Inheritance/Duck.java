package Inheritance;

public class Duck extends Bird{
String colour="Yellow";
int age=3;
public static void main(String args []) {
	Duck d1=new Duck();
	System.out.println(d1.colour);
	System.out.println(d1.age);
	System.out.println(d1.type);
	d1.swim();
	fly();
	
	
	
}
}
