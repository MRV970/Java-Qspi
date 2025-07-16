package NumberPrograms;

public class Mobileno {
	public static void main(String args [] ){
		long a=1234567890l;
		int count=0;
		while(a>0) {
			long rem=a%10;
			count++;
			 a=a/10;
			
			
			
		}
		if(count==10) {
			System.out.println("valid Mobileno");
		}
		else {
			System.out.println("Not a Valid  Mobileno");
		}
		
		
	}

}
