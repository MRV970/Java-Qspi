package NumberPrograms;

public class StrongNumber {
	public static void main(String args[]) {
		
		int no=6,sum=0;
		int a=no;
		while(a>0) {
			int rem=a%10;
			int fact=1;
			for( int i=1;i<=rem;i++) {
				fact=fact*i;
				
			}
			
			int b=fact;
			sum=sum+b;
			a=a/10;
		}
		System.out.println(sum);
	
		if(sum==no) {
			System.out.println(no+" Strong number");
		}
		else {
			System.out.println(no+" Not a strong number");
		}
		

}

}
