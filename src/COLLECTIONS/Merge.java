package COLLECTIONS;

import java.util.ArrayList;

public class Merge {
	public static void main(String[] args) {
		int a[]= {45,92,45,29,20};
		int a1[]= {34,45,20,14,24};
		ArrayList<Integer> al1=new ArrayList();
		for(int i=0,j=0;i<=a.length-1&&j<=a.length-1;i++,j++) {
			al1.add(a[i]);
			al1.add(a1[j]);
		}
		System.out.println(al1);
	}

}
