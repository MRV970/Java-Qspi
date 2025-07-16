package arrays_programs;

public class Palindrome {
	public static void main(String args []) {
		int a[]= {25,45,66,79};
		int count=0;
		for( int i:a ) {
			int rev=0;
            int n=i;		
			while(i>0) {
				       
			int rem=i%10;        
			
			
			rev=rev*10+rem; 
			
		i=i/10;
			}
		if(n==rev) {
			count++;
			System.out.println(n);
		}
		}
		System.out.println(count+" Palindrome no");
	
	}

}
