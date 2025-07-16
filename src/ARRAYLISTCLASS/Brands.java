package ARRAYLISTCLASS;

import java.util.ArrayList;
import java.util.ListIterator;

public class Brands {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Apple");
		a1.add("Google");
		a1.add("Microsoft");
		a1.add("Samsung");
		a1.add("Amazon");
		a1.add("Apple");
		a1.add("Toyota");
		System.out.println(a1);
      ListIterator i=a1.listIterator();
      while(i.hasNext()) {
    	  System.out.println(i.next());
    	  
    	  
      }
      System.out.println("----");
      while(i.hasPrevious()) {
    	  System.out.println(i.previous());
      }
		
	}

}
