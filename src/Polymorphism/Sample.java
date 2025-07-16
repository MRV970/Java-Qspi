package Polymorphism;

public class Sample {
	public static void demo() {
		System.out.println("Demo Method");
		
	}
	public static void demo(int a) {
		System.out.println("Demo Method "+a);
	}
	public static void demo(double d) {
		System.out.println("Demo Method "+d);
}
	public void demo(long l) {
		System.out.println("Demo Method "+l);
		
	}
	public void demo(float f) {
		System.out.println("Demo Method "+f);
  }
	public void demo(char ch) {
		System.out.println("Demo Method "+ch);
	}
	public static void main(String args[]) {
		Sample s1=new Sample();
		s1.demo('a');
	}

	
}
