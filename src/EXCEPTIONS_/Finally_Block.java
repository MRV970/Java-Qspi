package EXCEPTIONS_;

public class Finally_Block {
	public static void main(String[] args) {
		int a=12;
		int b=10;
		try {
		int res=a/b;
		System.out.println(res);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally  Block");
		}
	}

}
