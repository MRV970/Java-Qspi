package NumberPrograms;

public class primewithreturn {
	public static int prime(int no)  {
		int count=0;
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				count++;
			}
		}
		return count;
		
		}
	public static void main(String args[]) {
		int no=4;
		if(prime(no)==2){
			System.out.println("prime number"+no);
			
		}
		else {
			System.out.println("not a prime number"+no);
		}
	}
			
		}
			
		
	


