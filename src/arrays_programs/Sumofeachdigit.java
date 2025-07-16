package arrays_programs;

public class Sumofeachdigit {
	public static void main(String args []){
		int a[]= {54,525,441,44,99};
		for(int i:a) {
			
		
		int sum=0;
		int i1=i;
		
			while(i>0) {
				
				
			
			int rem=i%10;
			sum=sum+rem;
			i=i/10;
		
			
			}
			System.out.println(sum+"is the sum of"+i1);
		}	
	}

}
