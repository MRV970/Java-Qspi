package COLLECTIONS;

import java.util.ArrayList;

public class Contains_All {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Hi Nanna");
		a1.add("Kgf");
	   System.out.println(a1);
	   ArrayList a2=new ArrayList();
	   a2.add("Pushpa");
	   a2.add("rrr");
	   
	   System.out.println(a2);
	  a1.addAll(a2);
	   System.out.println(a1);
	   
	   System.out.println(a1.containsAll(a2));
	}

}
