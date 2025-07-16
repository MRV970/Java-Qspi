package arrays_programs;

import java.util.Arrays;
import java.util.Scanner;
public class RotationArray {
	
		static void reverse(int a[],int start,int end) {
			int i=start,j=end;
			while(i<=j) {
				
			
			int temp =a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
			j--;
			}
		}
		static void rotateUsingReverse(int a[],int count) {
			if (count<0)
				count=a.length-count;
			count%=a.length;
			reverse(a,0,count-1);
			reverse(a,count,a.length-1);
			reverse(a,0,a.length-1);
		System.out.println(Arrays.toString (a));
		
	}
		public static void main(String[] args) {
			int a[]= {75,7,100,25,37};
			System.out.println(Arrays.toString(a));
			System.out.println("enter rotation times");
		rotateUsingReverse(a,new Scanner(System.in).nextInt());
		}
}
