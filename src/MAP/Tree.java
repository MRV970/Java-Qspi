package MAP;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Tree {
	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put("Java", 96);
		tm.put("SQL", 30);
		tm.put("Manual", 60);
		tm.put("API", 30);
		tm.put("Automation", 50);
		System.out.println(tm);
		Set s1=tm.entrySet();
		Iterator i= s1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("--------");
		System.out.println(tm.remove("API"));
		System.out.println(tm);
		System.out.println(tm.remove("SQL", 30));
		System.out.println(tm);
	}

}
