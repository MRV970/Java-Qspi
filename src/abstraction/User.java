package abstraction;

public class User {
	public static void ansim(Bank f1 ) {
		f1.rateofinterest(5555555);
	}
	public static void ansim2(Bank d) {
		d.withdrawl(222222.0);
	}
	public static void main(String args []) {
		ansim (new SBI());
		ansim( new ICICI ());
		ansim( new BOB());
		ansim2(new SBI());
		
	}



}
