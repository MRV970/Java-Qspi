package NumberPrograms;

public class Neon_no {
	public static String Neon(int no) {
		
		int sqr=no*no;
		int sum=0;
		
		

		while(sqr>0) {
			
			
			int rem=sqr%10;
			
			sum=sum+rem;
			sqr=sqr/10;
		}
			if(no==sum) 
				return "Neon "+no;
			else
				return "Not a Neon "+no;
		
		}
	public static void main(String args[]) {
		System.out.println(Neon(9));
	}
	}


