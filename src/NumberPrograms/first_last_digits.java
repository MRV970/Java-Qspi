package NumberPrograms;

public class first_last_digits {
	public static void main(String args[]) {
		int a=3456;
		int rem=a%10;
		System.out.println(rem);
		//a=a/10;
		//System.out.println(a);
		while(a>9) {
			a=a/10;
		}
		System.out.println(a);	
		
		
		}
	}


