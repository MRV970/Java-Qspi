package EXCEPTIONS_;

public class NullpointException {
	String name;
	int age;
	public NullpointException(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	public static void main(String[] args) {
		
		NullpointException n1=null;
		
		System.out.println(n1.name);
	}

}
