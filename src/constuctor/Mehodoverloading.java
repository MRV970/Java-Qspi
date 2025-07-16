package constuctor;

public class Mehodoverloading {
	public static void add() {
		System.out.println("No argument method");
	}
	public static void add(int
			a) {
		System.out.println(a);
	}
	public static void add(char a,int b) {
		System.out.println(a+b);
	}
	public static void add(double a,int b) {
		System.out.println(a+b);
	}	
		public static void main (String []args) {
	
		add();
		add(6);
		add('c',7);
		add(65,3);
	}

}
