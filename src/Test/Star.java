package Test;

public class Star {
	public static void main(String args []) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==(n+1)/2
				|| j==(n+1)/2
				|| i==j
				|| i+j==(n+1)
						
						
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
