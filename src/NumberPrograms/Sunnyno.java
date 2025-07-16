package NumberPrograms;

public class Sunnyno {
	public static void main(String args[]) {
		int no=8;
		int no1=no+1;
		int n=0;
		
		//boolean f=true;
		for(int i=1;i<=no;i++) {
			if(i*i==no1) {
				
				n=i;
				//f=false;
				break;
			}
		}
				if(n==0) {
					System.out.println("Its a Sunny number");
					
				}
				else {
					System.out.println("Its not a Sunny number");
				}
			
		}
	


}
