package arrays_programs;

public class Factorial {
	public static int fact(int n) {
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact =fact*i;
				
			}
		return fact;
		}
			public static void main(String args []) {
				int arr[]= {5,6,7,8};
				
				
			for(int i:arr) {
			
			
			System.out.println(i+" factorial of the number=" +fact(i));
				}
	}}


