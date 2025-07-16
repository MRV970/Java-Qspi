package Encapsulation;

public class BookDriver {
	public static void main(String args[]) {
		Book b1=new Book("Java");
		System.out.println(b1.getName());
		b1.setName("SQL");
		System.out.println(b1.getName());
		
	}

}
