package static_member;

public class largestno {
	static int a=70;
	static int b=26;
	static int c=20;
	public static void m1() {
		int res=a>b?a:b;
		int res1=res>c?res:c;
		System.out.println(res1);
		
	}
public static void main(String []args) {
	m1();
}
}
