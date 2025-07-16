package arrays_programs;

import java.util.Arrays;

public class ReverseArray {
	static void reverse(int a[]) {
		int i=0,j=a.length-1;
		while(i<=j) {
			int temp =a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString (a));
	}
	public static void main(String[] args) {
		int a[]= {75,7,100,25,37};
		System.out.println(Arrays.toString(a));
		reverse(a);
	}

}
