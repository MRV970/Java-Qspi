package arrays_programs;
import java.util.Scanner;
public class Diagonal_2D {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no.of rows");
	int row=sc.nextInt();
	System.out.println("enter the no.of columns");
	int col=sc.nextInt();
	int s[][]=new int[row][col];
	for(int i=0;i<=s.length-1;i++) {
		for(int j=0;j<=s.length-1;j++) {
			System.out.println(i+":"+j);
			s[i][j]=sc.nextInt();
			
		}
	}
	for(int i=0;i<=s.length-1;i++) {
		for(int j=0;j<=s.length-1;j++) {
			if(i==j) {
				System.out.print(s[i][j]+" ");
			}
			else {
				System.out.print(" * ");
			}
		}
	
	System.out.println();
}}
}
