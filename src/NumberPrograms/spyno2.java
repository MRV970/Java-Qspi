package NumberPrograms;

public class spyno2 {
	public static void main(String args[]) {
		int no=123;
		int a=no;
		int sum=0;
		int mul=1;
		while(no>0) {
			int rem=no%10;
			sum+=rem;
			mul*=rem;
			no/=10;
		}
		if(sum==mul) {
			System.out.println("Spy no"+a);
		}
		else {
			System.out.println("Not a Spy no"+a);
		}
			
	}	
			
}	
			
			
			
			
			
		
	


