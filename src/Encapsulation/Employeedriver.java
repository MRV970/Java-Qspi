package Encapsulation;

public class Employeedriver {
public static void main(String args[]) {
	Employee e1=new Employee("mrv",50000,9951403191l);
	System.out.println(e1.getname());
	System.out.println(e1.getsal());
	System.out.println(e1.getc_no());
	e1.setsal(9999.0);
	System.out.println(e1.getsal());
	e1.setsal(20000.0);
	System.out.println(e1.getsal());
	
}
}
