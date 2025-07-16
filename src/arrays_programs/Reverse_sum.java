package arrays_programs;

public class Reverse_sum {
	public static void main(String args []) {
		int a[]= {10,20,35,56};
		int first=a[0];
		int second=a[1];
		int sum=0;
		int rev=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>first) {
				second =first;
				first=a[i];
			}
			else if(a[i]>second && a[i]!=first) {        
				second =a[i];
			}
		}
		
		sum=first+second;
		System.out.println("sum of elements"+sum);
		int sum1=sum;
		while(sum1>0) {
			
		
		int rem=sum1%10;
		
		rev=(rev*10)+rem;
		sum1=sum1/10;
		}
		System.out.println("revesre the sum"+rev);
	}

}
