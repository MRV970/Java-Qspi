package Non_Primitive_Typecasting;

public class Apple extends Fruits{
	String col="Red";
	double price=30;
	public static void eat() {
		System.out.println("With Apple we made Jam to eat");
	}
	public void type() {
		System.out.println("different types of Apples");
	}
	public static void main(String args []) {
		Fruits f1=new Apple();
		System.out.println(f1.color);
		System.out.println(f1.shape);
		Fruits.eat();
		f1.drink();
	
		
		
	}

}
