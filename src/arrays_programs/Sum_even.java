package arrays_programs;

public class Sum_even {
	public static void main(String args []) {
		int sum=0;
		int a[]= {1,2,3,4,5};
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
			}
		}
				
			
			System.out.println(sum);
		
	}
}
