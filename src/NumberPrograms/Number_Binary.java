package NumberPrograms;

public class Number_Binary {
	public static void main(String args[]) {
		int no=12;
		String binary="";
		while(no>0) {
			
		
		int rem=no%2;
		binary=rem+binary;
		 
		 no=no/2;
		}
		
		System.out.println(binary);
		}
		//System.out.println(no);
		
	}


