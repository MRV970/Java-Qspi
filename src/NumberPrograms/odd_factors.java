package NumberPrograms;

public class odd_factors {
	public static void main(String args []) {
		int st=1,ed=12;
		for(int i=st;i<=ed;i++) {
			if(ed%i==0 && i%2!=0) {
				System.out.println(i);
			}
		}
	}
}


