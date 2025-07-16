package arrays_programs;

public class Countof_Strong_Palindrome_Armstrong {
	
	public static void main(String args []) {
		int a[]= {145,2,121,153,56,78};
		for(int i=0;i<=a.length-1;i++) {
		int count=0;
		int sum=0;
		while(a[i]>0) {
			int rem=a[i]%10;
			int fact=1;
			for(int j=0;j<a[i];j++) {
				fact=fact*j;
			}
			int b=fact;
			sum=sum+b;
			a[i]=a[i]/10;
			
		}
		if(sum==a[i]) {
			System.out.println(a[i]+"Its a Strong number");
			count++;
		}
		
	System.out.println(count);
		
		
	}
	}
}
