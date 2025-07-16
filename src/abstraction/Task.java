package abstraction;

public class Task implements C {
	public void m1() {
		System.out.println("m1()-->> Hi");
	}
	public void m2() {
		System.out.println("m2()-->> Bye");
	}
	
	public static void main(String args []) {
		Task t=new Task();
		t.m1();
		t.m2();
		
		System.out.println(a);
		System.out.println(b);
	}

}
