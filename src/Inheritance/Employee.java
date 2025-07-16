package Inheritance;

public class Employee extends Person {
	int id=12345;
	String dept="java";
	double salary=55000;
	public static void main(String args []) {
		Employee e1=new Employee();
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.id);
		System.out.println(e1.dept);
		System.out.println(e1.salary);
		
	}
	

}
