package NumberPrograms;

public class factorialofdigits {
	public static void main(String args []) {
		int no=1542;
		while(no>0) {
			 int rem=no%10;
			 int fact=1;
		 for(int i=1;i<=rem;i++) {
			 
			fact=fact*i;
		
		 }
		
			 System.out.println( rem+"->"+fact);
		
		no=no/10;
		
	}	 
	}	
}	


	
