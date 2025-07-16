package ConstructorChaining;

public class Instagram {
	String username;
	long c_no;
	public Instagram() {
		System.out.println("No arg Constructor");
	}
	public Instagram(String username) {
		this();
		//this.username=username;
		
		System.out.println(username);	
		
		
	}
	public Instagram(long c_no) {
		this("msvtr");
		//this.c_no=c_no;
		System.out.println(c_no);
	}
	public static void main(String args []){
		Instagram i1=new Instagram(1234567890l);
		System.out.println(i1.username);
		System.out.println(i1.c_no);
		
	}
	

}
