package constuctor;

public class phonedriver {
public static void main(String args[] ){
	phone p1=new phone("oppo",20000.0);
		System.out.println(p1.name);
		System.out.println(p1.price);
		
		phone p2=new phone(9951403191l,20);
		System.out.println(p2.number);
		System.out.println(p2.ram);

		phone p3=new phone("oppo",20000.0,9951403191l,20);
System.out.println(p3.name);
System.out.println(p3.price);
System.out.println(p3.number);
System.out.println(p3.ram);
}
}