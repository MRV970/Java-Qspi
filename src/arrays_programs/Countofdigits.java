package arrays_programs;

public class Countofdigits {
	public static int  count (int n) {
		
		
		
			int count=0;
			
			while(n>0) {
				count++;
				n=n/10;
				
			
			}
			return count;
		
	}
	public static void main(String args []) {
		int arr[]= { 53334,5235,441,44,99};
		for(int i:arr) {
			System.out.println(i+" : "+count(i));
		}
		
	}

}
