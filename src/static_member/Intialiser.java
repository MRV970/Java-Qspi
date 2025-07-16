package static_member;

public class Intialiser {
	static double d1;
	static String s1;
	
	static {
		System.out.println(d1);
		d1=123.123;
		System.out.println(d1);
		
	}
static {
	
	System.out.println(s1);
	s1="Java";
	System.out.println(s1);
	
}
public static void main(String [] args) {
	System.out.println(d1);
	System.out.println(s1);
}
}
