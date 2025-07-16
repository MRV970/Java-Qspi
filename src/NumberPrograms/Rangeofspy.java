package NumberPrograms;

public class Rangeofspy {
	public static void main(String args[]) {
		
		int st=1000,ed=1;
		int count=0;
		for(int i=st;i>=ed;i--) {
			
		
		int a=i;
		int b=a;
		int sum=0;
		int mul=1;
		while(a>0) {
			int rem=a%10;
			sum+=rem;
			mul*=rem;
			a/=10;
		}
		if(sum==mul) {
			count++;
			System.out.println("Spy no"+b);
		}
		}
		System.out.println(count);	
	}	

}
