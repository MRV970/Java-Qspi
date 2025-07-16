package Lower_Alphabets;

public class j {
	public static void main(String args []) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if( j==(n+1)/2 && i!=2 && i!=n
					|| i==n && j!=n	 && j<=(n+1)/2 && j!=(n+1)/2
					
					
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
