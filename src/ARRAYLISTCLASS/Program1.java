package ARRAYLISTCLASS;

import java.util.ArrayList;

public class Program1 {
	public static void main(String[] args) {
		
		int a[]= {12,21,13,4,56};
		int a1[]= {21,12,14,5,65,56};
		ArrayList<Integer>l1=new ArrayList();
		for(int i:a) {
			l1.add(i);
		}
		System.out.println(l1);
		ArrayList<Integer> l2=new ArrayList();
		for(int i:a1) {
			l2.add(i);
		}
		System.out.println(l2);
		l1.retainAll(l2);
		System.out.println(l1);
	}

}
