package Inheritance;

public class ICICI extends Bank{
	float Vloan=50000;
	public void Irateofinterest() {
		System.out.println("ICICI gives vechicle loan");
	}
	public static void main(String args[]) {
		ICICI i1=new ICICI();
		System.out.println(i1.Eloan);
		Rateofinterest();
		System.out.println(i1.Vloan);
		i1.Irateofinterest();
		
	}

}
