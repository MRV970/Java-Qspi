package constuctor;

public class Book {
	String Name;
	int No_pages;
	double price;
	

public Book(String Name,int No_pages,double price){
	this.Name=Name;
	this.No_pages=No_pages;
	this.price=price;
	
}
public void read() {
	
	System.out.println("reading purpose");
	
}
public void learn() {
	System.out.println("learning purpose");
	
}
public static void main(String args[]) {
	Book b=new Book("SQL",500,1000);
	System.out.println(b.Name);
	System.out.println(b.No_pages);
	System.out.println(b.price);
	System.out.println("---------");
	b.read();
	b.learn();
	System.out.println("---TQ---");
	Book b1=new Book("MANUAL",300,250);
	System.out.println(b1.Name);
	System.out.println(b1.No_pages);
	System.out.println(b1.price);
	System.out.println("---------");
	b1.read();
	b1.learn();
	System.out.println("---TQ---");
	Book b2=new Book("JAVA",400,500);
	System.out.println(b2.Name);
	System.out.println(b2.No_pages);
	System.out.println(b2.price);
	System.out.println("---------");
	b2.read();
	b2.learn();
	System.out.println("---TQ---");
	Book b3=new Book("API",50,100);
	System.out.println(b3.Name);
	System.out.println(b3.No_pages);
	System.out.println(b3.price);
	System.out.println("---------");
	b3.read();
	b3.learn();
	System.out.println("---TQ---");
	Book b4=new Book("APTI",450,900);
	System.out.println(b4.Name);
	System.out.println(b4.No_pages);
	System.out.println(b4.price);
	System.out.println("---------");
	b4.read();
	b4.learn();
	
	System.out.println("---TQ---");
	
	
}
	
	
	
	
	
	

}
