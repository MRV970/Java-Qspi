package COLLECTIONS;

import java.util.ArrayList;

public class Cont {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Hi Nanna");
		a1.add("KGF");
	   System.out.println(a1);
	   ArrayList a2=new ArrayList();
	   a2.add("Pushpa");
	   a2.add("RRR");
	   a1.add(a2);
	   System.out.println(a2);
	   System.out.println(a1);
	   System.out.println(a2.contains("KGF"));
	   System.out.println(a1.contains(a2));
	}

}
