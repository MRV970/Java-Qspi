package Test;

public class Rectangle {
	public static void main(String args []) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if( i==1 && j!=1 && j!=n
						|| i==n && j!=1 && j!=n
						|| j==1 && i!=1 && i!=n
						|| j==n && i!=1 && i!=n
						|| i==j && i!=1 && i!=n && j!=1 && j!=n
						|| i+j==(n+1) && i!=1 && i!=n && j!=n && j!=n
						
						
						
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
