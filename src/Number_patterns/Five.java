package Number_patterns;

public class Five {
	public static void main(String args []) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if( i==1 || j==1 && i<=(n+1)/2
						|| i==(n+1)/2 && j!=n
						|| i==n && j!=n
						|| j==n &&i>=(n+1)/2 && i!=(n+1)/2 && i!=n) {
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
