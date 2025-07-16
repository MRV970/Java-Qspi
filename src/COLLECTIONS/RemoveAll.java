package COLLECTIONS;

import java.util.ArrayList;

public class RemoveAll {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add("maaza");
		l1.add("Coke");
		l1.add("Fanta");
		System.out.println(l1);
		ArrayList f1=new ArrayList();
		f1.add("Mango");
		f1.add("Apple");
		f1.add("Orange");
		System.out.println(f1);
		l1.addAll(f1);
		System.out.println(l1);
		
		System.out.println(l1);
		System.out.println(l1.removeAll(f1));
	}

}
