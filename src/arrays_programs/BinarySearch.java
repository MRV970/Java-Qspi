package arrays_programs;

import java.util.Arrays;
import java.util.Scanner;

import Method_Overloading.Main_Overloading;

public class BinarySearch {
	
static int search(int a[],int key) {
	int l=0,h=a.length,m=0;
	while(l<=h) {
		m=(l+h)/2;
		if(a[m]==key)
		return m;
		else if(key>a[m])
			l=m+1;
		else 
			h=m-1;
	}
	return -1;

	}
	public static void main(String args []){
		int a[]= {10,2,4,78,98,56,64,89,27,33,15,22,103};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("enter key value");
		int n= new Scanner(System.in).nextInt();
		System.out.println(search(a,n));
		
	
}
}
