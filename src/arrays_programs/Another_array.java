package arrays_programs;

import Lower_Alphabets.b;

public class Another_array {
	public static void main(String args []) {
		int a[]= {1,2,4,6,9};
		int a1[]=new int [a.length];
		for(int i=0;i<=a.length-1;i++) {
			a1[i]=a[i];
			
		}
		for(int i:a1) {
			
		
		System.out.println(i);
	}
	}
}
