package Polymorphism;

public class Student extends Human{
	public   void acting(String s1) {
		System.out.println(s1+" Students are struggling to get a Job");
		
	}
	public static void main(String args []) {
		Human s1=new Student();
		s1.acting(" Like Ahi");
		
	}

}
