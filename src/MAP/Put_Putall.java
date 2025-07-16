package MAP;

import java.util.HashMap;

public class Put_Putall {
	public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.put(12, "madhuri");
		h1.put(13, "mrv");
		h1.put(14, "ABC");
		h1.put(14, "Nishi");
		h1.put(null, "DEF");
		h1.put(15, null);
		System.out.println(h1);
		HashMap h2=new HashMap();
		h2.putAll(h1);
		System.out.println(h2);
		
	}

}
