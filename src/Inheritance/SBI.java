package Inheritance;

public class SBI extends Bank{
	float Hloan=300000;
	public static void SRateofinterest() {
		System.out.println("SBI gives House loans");
		
	}
	public static void main(String args[]) {
		SBI s1= new SBI();
		System.out.println(s1.Eloan);
		Rateofinterest();
		System.out.println(s1.Hloan);
		SRateofinterest();	}

}
