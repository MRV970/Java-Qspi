package Non_Primitive_Typecasting;

public class B extends A {
	double d1=123.123;
	public void m1() {
		
		System.out.println("B Class Method");
		
	}
	public static void main(String args []) {
		
		A a1=new B();
		System.out.println(a1.col);
		Demo();
		System.out.println("----Downcasting----");
		B b1=(B) new A();//exception
		System.out.println(b1.col);
		b1.Demo();
		System.out.println(b1.d1);
		b1.m1();
		
	}

}
