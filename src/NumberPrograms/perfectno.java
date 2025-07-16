package NumberPrograms;

public class perfectno {
	public static void main(String args[]) {
		int st=1,ed=18,sum=0;
		for(int i=st;i<ed;i++) {
			if(ed%i==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		if(sum==st) {
			System.out.println(ed+"is"+"Perfect no");
			
		}
		else {
			System.out.println(ed+"is"+"Not a Perfect no");
		}
		
	}
}
