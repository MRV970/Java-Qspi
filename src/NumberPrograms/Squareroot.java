package NumberPrograms;

public class Squareroot {
	public static void main(String args[]) {
		int no=36;
		int n=0;
		boolean f=true;
		for(int i=1;i<=no;i++) {
			if(i*i==no) {
				n=i;
				f=false;
				break;
			}
		}
				System.out.println(n);
			
		}
	

}
