package constuctor;

public class PersonDriver {
	public static void main(String args[]) {
		Person p1=new Person("mrv");
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.c_no);
		
		Person p2=new Person("mrv",21); 
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		

		Person p3=new Person("mrv",21,1234345464l); 
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.c_no);
		
Person p4=new Person();
		}
	}


