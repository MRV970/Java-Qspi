package Non_Primitive_Typecasting;

public class Mango extends Apples {
String shape="oval";
double price1=80;
public static void use() {
	System.out.println("By using Mangos we can prepare different food items");
}
public static void main(String args []) {
	Apples a1=new Mango();
	System.out.println(a1.col);
	System.out.println(a1.weight);
	a1.m();
	System.out.println(a1.type);
	System.out.println(a1.price);
	eat();
	System.out.println("-->> Downcasting <<--");
	Mango m1=(Mango)a1;
	System.out.println(m1.col);
	System.out.println(m1.weight);
	m1.m();
	System.out.println(m1.shape);
	System.out.println(m1.price1);
	use();
	System.out.println(m1.type);
	System.out.println(m1.price);
	eat();
	
	
}

}
