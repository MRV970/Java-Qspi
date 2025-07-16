package Inheritance;

public class IPhone_11 extends IPhone_10{
 public  void display() {
	 System.out.println("good Display");
 }
 public static void main(String args[]) {
	 IPhone_11 i1=new IPhone_11();
	 System.out.println(i1.name);
	 System.out.println(i1.price);
	 camera();
	 i1.display();
 }
}
