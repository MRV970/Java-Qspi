package arrays_programs;

public class Sum_of_twolargest {
	public static void main(String args []) {
		int a[]= {5,4,67,3};
		int first =a[0];
		int second=a[1];
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>first) {
				second=first;
				first=a[i];
			}
			else if(a[i]>second && a[i]!=first) {
				second =a[i];
			}
		}
		sum=first+second;
		System.out.println(first);
		System.out.println(second);
		System.out.println("sum of the elements"+sum);
	}

}
