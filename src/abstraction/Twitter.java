package abstraction;

public  class Twitter extends Application {
	public  void signup(String name) {
		System.out.println(" User name---->>>"+name);
	}
	public void login(long c_no) {
		System.out.println(" Contactno----->>>"+c_no);
	}
	public static void main(String args []) {
		Twitter t= new Twitter();
		t.signup("mrv");
		t.login(9999933333l);
	}
	

}
