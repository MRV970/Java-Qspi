package NumberPrograms;

public class FirstdigitE_O {
	public static void main(String args []) {
		int no=785;
		int count=0;
		
		while(no>9) {
			no=no/10;
		}
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("First digit is a prime number"+no);
		}
		else {
			System.out.println("Not a prime number"+no);
		}
		
	}

}
