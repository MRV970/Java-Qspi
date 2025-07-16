package Lower_Alphabets;

public class n {
	public static void main(String args []) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if( j==n && i>(n+1)/2
					|| i==(n+1)/2 && j>=(n+1)/2 && j!=n	
					|| j==(n)/2 && i>=(n+1)/2 
					
						) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
