package NumberPrograms;

public class Happy_Sadno {
	public static void main(String args[]) {
		int no=4;
		         
		 while(true) {
			 int sum=0;
			 int sq=1;
			 while(no>0) {
				 int rem=no%10;
				 sq=rem*rem;
				 sum=sum+sq;
				 no=no/10;
			 }
			 no=sum;
			 
			 if(no==1) {
				 System.out.println("Happy number "+no);
			 break;
			 }
			 else if(no==4) {
				 System.out.println("Sad number "+no);
				 break;
				
			 }
			 
		 }
	}

}
