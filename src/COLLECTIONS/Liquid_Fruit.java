package COLLECTIONS;

import java.util.ArrayList;

public class Liquid_Fruit {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add("maaza");
		l1.add("Coke");
		l1.add("Thums up");
		l1.add("Fanta");
		l1.add("String");
		System.out.println(l1);
		ArrayList f1=new ArrayList();
		f1.add("Mango");
		f1.add("Apple");
		f1.add("Orange");
		f1.add("Kiwi");
		f1.add("Banana");
		System.out.println(f1);
		System.out.println("-------");
		l1.add(f1);
		System.out.println(l1);
		System.out.println("-----");
		l1.remove(f1);
		System.out.println(l1);
		
		
	}

}
