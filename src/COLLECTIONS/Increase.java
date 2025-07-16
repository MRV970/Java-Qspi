package COLLECTIONS;

import java.util.ArrayList;

public class Increase {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		for(int i=1;i<=10;i++) {
			a1.add(i);
		}
		a1.add("Hi");
		System.out.println(a1);
	}

}
