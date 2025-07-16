package ARRAYLISTCLASS;

import java.util.Vector;

public class ADD {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add("kanakadurga temple");
		v1.add("Venkateswaraswamy temple");
		v1.add("Hanuman temple");
		v1.add("Laxminarasimhaswamy temple");
		v1.add("Saibaba temple");
		System.out.println(v1);
		Vector v2=new Vector();
		v2.add("Laxmi temple");
		v2.add("shiva temple");
		
		v1.add(v2);
		System.out.println(v1);
	}

}
