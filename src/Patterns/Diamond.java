package Patterns;

public class Diamond {
	public static void main(String args []) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if( (i+j)-1==(n+1)/2 
					|| i-j==n/2
					|| i+j==(n+1)/2+n
					|| i==j-n/2
					)
				{
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
