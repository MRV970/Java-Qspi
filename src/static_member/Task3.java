package static_member;

public class Task3 {
	static String s1="Java";
	static int a=10;
	static int b;
	static {
		System.out.println(s1);
		
	}
	static {
		System.out.println(a);
		
	}
	static {
		System.out.println(b);
		System.out.println("Bye");
	}
	public static void m1() {
		System.out.println(s1);
		System.out.println(a);
		System.out.println(b);
		
	}
public static void main(String args []) {
	m1();
	
}
}
