package NumberPrograms;

public class sum_of_factorial {
	public static void main(String args[]) {
		
	int no=145,sum=0;
	while(no>0) {
		int rem=no%10;
		int fact=1;
		for( int i=1;i<=rem;i++) {
			fact=fact*i;
			
		}
		
		int b=fact;
		sum=sum+b;
		no=no/10;
	}
	System.out.println(sum);
	

}
}