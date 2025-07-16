package Method_Overloading;

public class Main_Overloading {
	public static void main() {
		System.out.println("no argument method");
	
	}
public static void main(int a) {
	System.out.println(a);
}
public static void main(String name) {
	System.out.println(name);
}
public static void main(char a,long b) {
	System.out.println(a+b);
	
}
public static void main(double price,char b) {
	System.out.println(price+b);
}
public static void main(String args[]) {
	main();
	main(55);
	main("mrv");
	main('E',1234345l);
	main(66.0,'D');
}
}
