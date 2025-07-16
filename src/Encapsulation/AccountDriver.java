package Encapsulation;

public class AccountDriver {
	public static void main(String args[]) {
		Account a1=new Account("Sheela",14332676354473l,20453.00);
		System.out.println(a1.getname());
		System.out.println(a1.getno());
		System.out.println(a1.getbal());
		
		a1.setname("mrv");
		System.out.println(a1.getname());
		a1.setno(345612345678945l);
		System.out.println(a1.getno());
		a1.setbal(50000.00);
		System.out.println(a1.getbal());
		
	}

}
