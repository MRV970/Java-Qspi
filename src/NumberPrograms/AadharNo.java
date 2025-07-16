package NumberPrograms;

public class AadharNo {
	public static void main(String args [] ){
		long a=123456789012l;
		int count=0;
		while(a>0) {
			long rem=a%10;
			count++;
			 a=a/10;
			
			
			
		}
		if(count==12) {
			System.out.println("valid AadharNo");
		}
		else {
			System.out.println("Not a Valid  AadharNo");
		}
		
		
	}
		
	}