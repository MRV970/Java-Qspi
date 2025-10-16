package COLLECTIONS;

import java.util.ArrayList;

public class Bag {
	public static void main(String[] args) {
		ArrayList bag1 =new ArrayList();
		bag1.add('A');
		bag1.add('B');
		bag1.add('C');
		bag1.add('D');
		ArrayList bag2=new ArrayList();
		bag2.add('E');
		bag2.add('F');
		bag2.add('G');
		bag2.add('H');
		bag1.add(bag2);
		System.out.println(bag1);
        bag1.add(2,bag2);
        System.out.println(bag1);
        //bag1.getFirst();
        System.out.println(bag1);
        
		}

}
