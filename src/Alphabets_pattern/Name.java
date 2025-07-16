package Alphabets_pattern;
import java.util.Scanner;

public class Name {
	public static void main(String args [])throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		String s1=sc.next();
		String s=s1.toUpperCase();
		System.out.println("Enter the grid");
		int n=sc.nextInt();
		for(int a=0;a<=s.length();a++) {
			char ch=s.charAt(a);
			switch(ch) {
			case 'A' :
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(  i==1 &&j!=1&& j!=n 
							|| j==1 && i!=1 && j!=n
							||j==n &&i!=1 
							|| i==(n+1)/2 )
								
							
						{
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
						
					}break;
			case 'B':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(j==1 || i==1 && j!=n 
							|| i==(n+1)/2 
							|| i==n && j!=n  
							|| j==n &&i!=n && i!=1)
						{
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
				}break;
			case 'C':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(j==1 && i!=1 &&i!=n
							|| i==n && j!=1
							||i==1 &&j!=1 )
						{
						System.out.print("* ");	
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}}
			break;
			case 'D':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(  j==1  
							|| i==1 && j!=n 
							|| i==n && j!=n 
							|| j==n && i!=1 && i!=n)
						{
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
					}	
			}break;
			case 'E' :
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if( j==1 || i==1 || i==n ||
								i==(n+1)/2)
						{
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
			}break;
			case 'F':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if( j==1 || i==1 || i==(n+1)/2)
						{
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
			}break;
			case 'G' :
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(i==1 && j!=1 
							|| j==1 &&i!=1&& i!=n 
							|| i==n && j!=1 && j<=(n+1)/2 
							|| j==(n+1)/2  && i>(n+1)/2 && j!=1
							|| i==(n+1)/2 && j>(n+1)/2 &&j!=n 
							|| j==n && i>(n+1)/2)
						{
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
					
				}
			}break;
			case 'H' :
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(j==1 || j==n || i==(n+1)/2)
						{
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
			}break;
			case 'I' :
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(i==1 || i==n || j==(n+1)/2) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
							
						}
					}
					System.out.println();
				}
			}break;
			case 'J' :
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(  i==1 || j==(n+1)/2 && i!=n 
							|| i==n && j<(n+1)/2)
						{
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
				
			}break;
			case 'K' :{
				
			
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if( i==j&& i>=(n+1)/2 
						|| i+j==(n+1)&& i<=(n+1)/2
						|| j==(n+1)/2 )
					{
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			}break;
			case 'L':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if( j==1 || i==n)
						{
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
				
			}break;
			case 'M':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if( j==1 || j==n  
							|| i==j && i<=(n+1)/2
							|| i+j==(n+1)&& i<=(n+1)/2)
						{
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}	
			}break;
			case 'N':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if( j==1 || j==n || i==j )
						{
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
			}break;
			case 'O':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(i==1 &&j!=1 &&j!=n
							|| j==1 && i!=1 && i!=n 
							|| j==n &&i!=1 && i!=n
							|| i==n && j!=1 && j!=n)
						{
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
			}break;
			case 'P':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(j==1 || i==1&& j!=n 
							|| j==n && i!=1 && i<(n+1)/2
							|| i==(n+1)/2 && j!=n) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
					
				}
			}break;
			case 'Q':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(i==(n-1)&& j!=1 && j!=n 
							|| j==1 && i!=1 && i!=n && i!=(n-1)
							|| j==(n-1) && i!=n && i!=(n-1) && i!=1
							|| i==1 &&j!=1 && j!=(n-1) && j!=n
							|| i==j && j>=(n+1)/2)
						{
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
			}break;
			case 'R':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(j==1&& i!=1 && j!=(n+1)/2 
							||	i==1 && j!=1 && j!=n
							|| j==n && i!=1 && i<(n+1)/2 && j!=(n+1)/2
							|| i==(n+1)/2 && j!=n && j<=(n+1)/2
							||i==(n+1)/2  && i!=n && j!=n
							|| i==j&& i>(n+1)/2
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
			}break;
			case 'S':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(i==1 &&j!=1 &&j!=n
							|| j==1 && i<=(n+1)/2 &&i!=1 && i!=(n+1)/2
							|| j==n && i>(n+1)/2 && i!=n
							|| i==n && j!=n && j!=1 
							|| i==(n+1)/2  && j!=1 && j!=n) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
					
				}
			}break;
			case 'T':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(i==1 ||j==(n+1)/2) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
					
				}
			}break;
			case 'U' :
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(j==1 &&i!=n || j==n &&i!=n
							||	i==n && j!=1 &&j!=n) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
					
				}
			}break;
			case 'V':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(i==j && i<=(n+1)/2 
								|| i+j==(n+1) && i<=(n+1)/2) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
					
				}
			}break;
			case 'W':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(j==1 || j==n
								|| i+j==(n+1)&& i>=(n+1)/2
								|| i==j && i>=(n+1)/2) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
					
				}
			}break;
			case 'X':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(i==j || i+j==(n+1)) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
					
				}
				
			}break;
			case 'Y':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(i==j && i<=(n+1)/2 
								|| i+j==(n+1) && i<=(n+1)/2
								|| j==(n+1)/2 && i>=(n+1)/2) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
					
				}
				
			}break;
			case 'Z':
			{
				for(int i=1;i<=n;i++) {
					for(int j=1;j<=n;j++) {
						if(i==1 || i==n||i+j==(n+1)) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
					
				}
			}break;
			default:
			{
				
			
				System.out.println(" enter the valid data");
			}
			}
			System.out.println();
			System.out.println();
			Thread.sleep(2000);
			}
			
		
		
	}


}
