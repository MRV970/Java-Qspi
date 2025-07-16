package Non_Primitive_Typecasting;

public class Apples extends Fruit {
	String col="Green";
	double weight=2.5;
	public void m() {
		System.out.println("Apples are in different colours");
	}
	public static void main(String []args) {
		Fruit f1=new Apples();
		System.out.println(f1.type);
		System.out.println(f1.price);
		eat();
		System.out.println("----Downcasting----");
		Apples a1=(Apples)f1;
		System.out.println(a1.type);
		System.out.println(a1.price);
		eat();
		System.out.println(a1.col);
		System.out.println(a1.weight);
		a1.m();
		
		
	}

}
