package NumberPrograms;

public class Xyleam_phleom {
	public static void main(String args[]) {
		int no=1234,sum=0;
		int last=no%10;
		no=no/10;
		
		
		while(no>=10) {
			
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
			
		}
		int res=last+no;
		System.out.println(res);
		System.out.println(sum);
		if(sum==res) {
			System.out.println("xyleam number");
		}
		else {
			System.out.println("phleon number");
		}
		
	}
}
